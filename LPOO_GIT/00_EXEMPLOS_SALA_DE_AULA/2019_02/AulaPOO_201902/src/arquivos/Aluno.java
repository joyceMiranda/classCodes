package arquivos;

import java.io.Serializable;

public class Aluno implements Serializable {
    
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
    
}
