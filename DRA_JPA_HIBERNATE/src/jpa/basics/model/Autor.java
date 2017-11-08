package jpa.basics.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Autor implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @ManyToMany
    private Collection<Livro> livros; 
    
 
    
}
