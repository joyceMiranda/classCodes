package jpa_generic_dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno {
        
     @Id @GeneratedValue
     private long id;
     private String nome;
     private String curso;

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }
     
     
    
}
