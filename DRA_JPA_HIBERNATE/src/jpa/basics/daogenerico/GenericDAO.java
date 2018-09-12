package jpa.basics.daogenerico;

import javax.persistence.EntityManager;

public class GenericDAO <T> {
    
    private EntityManager entityManager;
    
    public GenericDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    
    public void save(T obj){
        System.out.println("salvando.." + obj.getClass().getName());
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(obj);
            entityManager.getTransaction().commit();
        }catch(Exception e){
            entityManager.getTransaction().rollback();
        }
    }
    
    public void update(T obj){
        System.out.println("alterando.." + obj.getClass().getName());
        try{
            entityManager.getTransaction().begin();
            entityManager.merge(obj);
            entityManager.getTransaction().commit();
        }catch(Exception e){
            entityManager.getTransaction().rollback();
        }
    }
    
    public void remove(Class<T> obj, Long id){
        System.out.println("excluindo.." + obj.getName());
        T t = findById(obj, id);
        try{
            entityManager.getTransaction().begin();
            entityManager.remove(t);
            entityManager.getTransaction().commit();
        }catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }
    
    public T findById(Class<T> obj, Long id){
        System.out.println("bucando por id.." + obj.getName());
        return entityManager.find(obj, id);
    }
    
}
