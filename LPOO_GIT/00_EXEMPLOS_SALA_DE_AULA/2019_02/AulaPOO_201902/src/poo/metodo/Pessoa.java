package poo.metodo;

public class Pessoa {

    public String cpf;
    public String nome;
    public int anoNascimento;

    public Pessoa(){}
    
    public Pessoa(String cpf, String nome, int anoNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }
    
    public int calcIdade(int anoAtual){
        return anoAtual - anoNascimento;
    }
    
}
