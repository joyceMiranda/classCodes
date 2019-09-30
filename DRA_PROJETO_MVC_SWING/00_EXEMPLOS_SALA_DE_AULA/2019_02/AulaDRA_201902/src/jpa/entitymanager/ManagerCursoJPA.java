package jpa.entitymanager;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import jpa.model.Curso;

public class ManagerCursoJPA {

    public static void main(String[] args) {
        EntityManagerFactory factory = 
         Persistence.
         createEntityManagerFactory("syscontroleacademicojpa");
        
        EntityManager manager = 
         factory.createEntityManager();
        
        Curso curso = new Curso("TADS", "TEC. ANÁLISE DE SISTEMAS");
        
        //insert
        manager.getTransaction().begin();        
        manager.persist(curso);        
        manager.getTransaction().commit();
        
        //find        
        curso = manager.find(Curso.class, 1L);
        System.out.println("Curso buscado: " + curso);
        
        //merge => update
        manager.getTransaction().begin();
        curso = new Curso(1L, "TECINFO", "TÉCNICO EM INFORMÁTICA");
        manager.merge(curso);
        manager.getTransaction().commit();
        
        //find        
        curso = manager.find(Curso.class, 1L);
        System.out.println("Curso alterado: " + curso);
        
        //remove
        manager.getTransaction().begin();
        if(curso != null)
            manager.remove(curso);
        manager.getTransaction().commit();        
        
        //typed query
        String query = "SELECT c FROM Curso c";
        TypedQuery<Curso> tq = manager.createQuery(query, Curso.class);
        List<Curso> cursos = tq.getResultList();
        System.out.println("Lista de Cursos: ");
        for (Curso c : cursos) {
            System.out.println(c.getSigla() + " - " + c.getDescricao());
        }
        
        factory.close();
    }
    
}
