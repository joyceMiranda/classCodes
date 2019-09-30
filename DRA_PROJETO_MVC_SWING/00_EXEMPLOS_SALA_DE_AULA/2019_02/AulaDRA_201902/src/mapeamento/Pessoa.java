package mapeamento;

import java.util.Calendar;
import java.util.Collection;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_pessoa")
public class Pessoa {
    
    @Id
    @GeneratedValue
    @Column(name = "col_id")
    private long id;
    
    @Column(length = 150, nullable = false)
    private String nome;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataNascimento;
    
    @Transient
    private int idade;
    
    @Enumerated(EnumType.STRING)
    private Genero genero;
    
    @ElementCollection
    @CollectionTable(name="tbl_pessoa_telefone",
            joinColumns = @JoinColumn(name="pessoa_id"))
    @Column(name="telefone")
    private Collection<String> telefones;
    
    
    private Endereco endereco;    

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa(Endereco endereco) {
        this.endereco = endereco;
    }

    
    public Pessoa(String nome, Calendar dataNascimento, Genero genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public void setTelefones(Collection<String> telefones) {
        this.telefones = telefones;
    }
    
    

    
    
    
}
