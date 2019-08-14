package mvc_pessoa.model;

import java.time.LocalDate;

public class PessoaModel {
    private LocalDate dataNascimento;

    public PessoaModel(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    public int calcIdade(int anoAtual){
        return anoAtual - dataNascimento.getYear();
    }
}
