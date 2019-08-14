package conta.controller;

import conta.model.Conta;
import conta.view.TelaConta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ContaController {
    
    private TelaConta telaConta;
    private Conta conta;
    
    public ContaController(TelaConta telaConta){
        this.telaConta = telaConta;
        this.telaConta.addBtnBuscarListener(new BtnBuscarListener());
        this.telaConta.addBtnDepositarListener(new BtnDepositarListener());
        this.telaConta.addBtnSacarListener(new BtnSacarListener());
        this.telaConta.setVisible(true);
    }
    
    private class BtnBuscarListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            conta = new Conta();
            conta.setNumero(Integer.parseInt(telaConta.getTxtNumero()));
            telaConta.setTxtSaldo(Double.toString(conta.getSaldo()));
        }        
    }
    
    private class BtnDepositarListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double valor = Double.parseDouble(telaConta.getTxtValor());
            boolean ok = conta.depositar(valor);
            if(ok){
                telaConta.setTxtSaldo(Double.toString(conta.getSaldo()));
            }else{
                telaConta.showMsg("Valor inválido! Operação não efetuada.");
            }
        }        
    }
    
    private class BtnSacarListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double valor = Double.parseDouble(telaConta.getTxtValor());
            boolean ok = conta.sacar(valor);
            if(ok){
                telaConta.setTxtSaldo(Double.toString(conta.getSaldo()));
            }else{
                telaConta.showMsg("Valor inválido! Operação não efetuada.");
            }
        }
    }
    
}
