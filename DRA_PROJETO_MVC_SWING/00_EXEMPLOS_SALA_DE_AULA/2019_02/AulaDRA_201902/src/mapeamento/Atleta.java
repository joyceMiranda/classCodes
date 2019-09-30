package mapeamento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Atleta {
    
    @Id @GeneratedValue
    private long id;
    private String nome;

    public Atleta() {
    }
    
    public Atleta(String nome) {
        this.nome = nome;
    }
    
    
    
}
