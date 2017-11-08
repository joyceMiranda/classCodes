package jpa.basics.model;

import jpa.basics.model.*;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livro implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    
    
 
    
}
