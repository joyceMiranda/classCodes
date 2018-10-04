package dra_jpa_hibernate.relacionamento.ManyToMany;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Livro {
    
    @Id @GeneratedValue
    private long id;    
    private String nome;
    
    @ManyToMany(cascade = CascadeType.PERSIST)
    private Collection<Autor> autores;

    public Livro(String nome, Collection<Autor> autores) {
        this.nome = nome;
        this.autores = autores;
    }

   
    
    
}
