package poo.polimorfismo;

public class Professor extends Funcionario {

    public String area;
    public String titulacao;

    public Professor(String nome, double salarioBruto, String funcao,
                        String area, String titulacao) {
        super(nome, salarioBruto, funcao);
        this.area = area;
        this.titulacao = titulacao;
    }
    
    
    
    
    
    
    
}
