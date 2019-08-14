/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_conta.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc_conta.model.Conta;
import mvc_conta.view.TelaConta;

/**
 *
 * @author mdsjo
 */
public class ContaController {
    
    private TelaConta telaConta;
    private Conta conta;

    public ContaController(TelaConta telaConta) {
        this.telaConta = telaConta;
        this.telaConta.setVisible(true);
        this.telaConta.addBtnNovaContaListener(new NovaContaListener());
        this.telaConta.addBtnDepositarListener(new DepositarListener());
        this.telaConta.addBtnSacarListener(new SacarListener());
    }
    
    private class NovaContaListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            conta = new Conta();
            conta.setNumero(Integer.parseInt(telaConta.getTxtNumeroConta()));
            telaConta.setTxtSaldo(Double.toString(conta.getSaldo()));
        }
        
    }
    
    private class DepositarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            double valor = Double.parseDouble(telaConta.getTxtValorOperacao());
            
            conta.depositar(valor);
            
            telaConta.setTxtSaldo(Double.toString(conta.getSaldo()));
            
        }
        
    }
    
    private class SacarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            double valor = Double.parseDouble(telaConta.getTxtValorOperacao());
            
            conta.sacar(valor);
            
            telaConta.setTxtSaldo(Double.toString(conta.getSaldo()));
            
        }
        
    }
    
    
    
}
