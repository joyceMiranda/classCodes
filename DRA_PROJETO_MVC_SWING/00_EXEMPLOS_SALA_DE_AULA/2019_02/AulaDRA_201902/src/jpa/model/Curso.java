package jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Curso {
    
    @Id 
    @GeneratedValue
    private long idCurso;
    private String sigla;
    private String descricao;

    public Curso() {
    }

    public Curso(long idCurso, String sigla, String descricao) {
        this.idCurso = idCurso;
        this.sigla = sigla;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.idCurso + " : " + this.sigla + " : " + this.descricao;
    }
    
    
    
    
    public Curso(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    
}
