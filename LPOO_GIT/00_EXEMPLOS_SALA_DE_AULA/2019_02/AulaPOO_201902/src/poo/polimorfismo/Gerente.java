package poo.polimorfismo;

public class Gerente extends Funcionario {
    
    private double bonus;
    private String setor;

    public Gerente(String nome, double salarioBruto, String funcao,
            double bonus, String setor) {
        super(nome, salarioBruto, funcao);
        this.bonus = bonus;
        this.setor = setor;
    }

    @Override
    public double calcSalarioLiquido(double percentualDesconto) {
        return super.calcSalarioLiquido(percentualDesconto) 
                + this.bonus;
    }
    
    public void toDoGerente(){
        
    }
    
    
    
    
}
