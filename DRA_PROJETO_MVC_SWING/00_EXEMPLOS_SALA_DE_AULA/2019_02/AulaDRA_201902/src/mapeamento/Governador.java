package mapeamento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Governador {
    
    @Id
    @GeneratedValue
    private long id;
    
    private String nome;

    public Governador() {
    }

    public Governador(String nome) {
        this.nome = nome;
    }
    
    
    
}
