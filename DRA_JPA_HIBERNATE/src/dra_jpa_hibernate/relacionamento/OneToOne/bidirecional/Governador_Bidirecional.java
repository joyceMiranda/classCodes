package dra_jpa_hibernate.relacionamento.OneToOne.bidirecional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Governador_Bidirecional {
    
    @Id @GeneratedValue
    private long id;    
    private String nome;

    @OneToOne(mappedBy = "governador")
    private Estado_Bidirecional estado;
    
    public Governador_Bidirecional(String nome) {
        this.nome = nome;
    }
    
    
    
}
