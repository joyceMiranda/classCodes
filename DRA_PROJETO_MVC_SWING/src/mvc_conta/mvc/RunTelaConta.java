/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_conta.mvc;

import mvc_conta.controller.ContaController;
import mvc_conta.model.Conta;
import mvc_conta.view.TelaConta;

/**
 *
 * @author mdsjo
 */
public class RunTelaConta {
    
    public static void main(String[] args) {
        ContaController controller =
                new ContaController(new TelaConta());
    }
    
}
