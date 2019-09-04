/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitosOO.polimorfismo;

/**
 *
 * @author mdsjo
 */
public class FolhaPagamento {
    
    private String periodo;

    public FolhaPagamento(String periodo) {
        this.periodo = periodo;
    }
    
    public void pagar(Funcionario funcionario, double desconto){
        System.out.println("Período: " + this.periodo + "\n" +
                " Depositando: " +
                funcionario.calcSalarioLiquido(desconto) + 
                " na conta de: " + funcionario.getNome());
    }
    
}
