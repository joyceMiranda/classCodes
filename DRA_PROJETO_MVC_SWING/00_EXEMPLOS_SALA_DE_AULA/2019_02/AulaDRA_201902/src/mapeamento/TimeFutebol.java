package mapeamento;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class TimeFutebol {
    
    @Id @GeneratedValue
    private long id;
    private String nome;
    
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(joinColumns = 
            @JoinColumn(name="time_id"),
            inverseJoinColumns = @JoinColumn(name="atleta_id"))
    private Collection<Atleta> atletas;

    public TimeFutebol() {
    }

    public TimeFutebol(String nome, Collection<Atleta> atletas) {
        this.nome = nome;
        this.atletas = atletas;
    }
    
    
    
}
