package dra_jpa_hibernate.relacionamento.OneToOne.bidirecional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Estado_Bidirecional {

    @Id @GeneratedValue
    private long id;    
    private String nome;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Governador_Bidirecional governador;

    public Estado_Bidirecional(String nome, Governador_Bidirecional governador) {
        this.nome = nome;
        this.governador = governador;
    }
    
    
    
}
