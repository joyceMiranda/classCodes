package conceitosOO.polimorfismo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ExecFuncionario {
    
    public static void main(String args[]){
        
        FolhaPagamento fp = new FolhaPagamento("01/2000");
        
        Professor p = new Professor();
        p.setNome("Fulana");
        p.setSalarioBruto(1000.00);
        
        fp.pagar(p, 10);
        
        Gerente g = new Gerente();
        g.setNome("Beltrana");
        g.setSalarioBruto(1000.00);
        g.setBonus(500.00);
        
        fp.pagar(g, 10);
        
        
        
    }
    
}
