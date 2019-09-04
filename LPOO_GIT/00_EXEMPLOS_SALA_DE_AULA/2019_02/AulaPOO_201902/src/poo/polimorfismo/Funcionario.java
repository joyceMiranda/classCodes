package poo.polimorfismo;

public class Funcionario {

    protected String nome;
    protected double salarioBruto;
    protected String funcao;
  
    public Funcionario(String nome, double salarioBruto, String funcao) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.funcao = funcao;
    }
    
    public double calcSalarioLiquido(double percentualDesconto){
        return 
                this.salarioBruto - 
                    (salarioBruto*percentualDesconto/100);
    }
    
    public void pagarSalario(Funcionario funcionario,
                             double percentualDesconto){
        System.out.println("Depositando R$" +
                this.calcSalarioLiquido(percentualDesconto) +
                " na conta de " + this.nome);        
    }
        
        
    
}
