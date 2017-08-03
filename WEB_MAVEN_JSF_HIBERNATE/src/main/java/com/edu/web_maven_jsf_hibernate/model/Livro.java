package com.edu.web_maven_jsf_hibernate.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Livro implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    private String titulo;
    @ManyToOne
    @JoinColumn(name="categoria_id")
    private Categoria categoria;

    public Livro() {
    }

    public Livro(long id, String titulo, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
}
