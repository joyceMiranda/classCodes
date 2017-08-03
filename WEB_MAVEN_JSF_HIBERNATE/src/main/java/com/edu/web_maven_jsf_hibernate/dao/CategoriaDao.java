package com.edu.web_maven_jsf_hibernate.dao;

import com.edu.web_maven_jsf_hibernate.model.Categoria;
import com.edu.web_maven_jsf_hibernate.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CategoriaDao {

    public void save(Categoria categoria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(categoria);
        t.commit();
    }

    public Categoria getCategoria(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Categoria) session.load(Categoria.class, id);
    }

    public List<Categoria> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Categoria").list();
        t.commit();
        return lista;
    }
    
    public List<Categoria> findByName(String categoriaBuscada) throws Exception { 
        Session session = null;
        Transaction t = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            t = session.beginTransaction();
            String hql = "from Categoria c where c.nome like :nome" ;
            List lista = session.createQuery(hql)
                .setParameter("nome", "%" + categoriaBuscada + "%" ).list();
            t.commit();
            return lista;
        } catch (Exception e) {
            if (t != null) t.rollback();
            throw new Exception(e.getMessage());
        }finally {
            if (session != null) session.close();
        }
    }

    public void remove(Categoria categoria) throws Exception {
        Session session = null;
        Transaction t = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            t = session.beginTransaction();
            session.delete(categoria);
            t.commit();
        } catch (Exception e) {
            if (t != null) t.rollback();
            throw new Exception(e.getMessage());
        }finally {
            if (session != null) session.close();
        }
    }

    public void update(Categoria categoria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(categoria);
        t.commit();
    }

}
