package dra_jpa_hibernate.relacionamento.ManyToMany;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Autor {

    @Id @GeneratedValue
    private long id;    
    
    private String nome;
    
    @ManyToMany(mappedBy = "autores")
    private Collection<Livro> livros;

    public Autor(String nome) {
        this.nome = nome;
    }
    
    
    
    
}
