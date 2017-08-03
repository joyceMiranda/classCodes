/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.web_maven_jsf_hibernate.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categoria implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    private String nome;

    
    public Categoria(){}
    
    public Categoria(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

@Override
public boolean equals(Object other) {
     return (other instanceof Categoria)?(id == ((Categoria) other).id)
        : (other == this);
}

    


       
}
