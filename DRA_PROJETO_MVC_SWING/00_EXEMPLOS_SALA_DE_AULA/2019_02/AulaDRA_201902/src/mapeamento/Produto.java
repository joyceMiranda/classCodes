package mapeamento;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produto {
    @Id @GeneratedValue
    private long id;
    private String nome;
    
    @ManyToOne(cascade=CascadeType.PERSIST)
    private Categoria categoria;

    public Produto() {
    }

    
    public Produto(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }
    
    
}
