package calculadora.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import calculadora.model.CalculadoraModel;
import calculadora.view.CalculadoraView;

public class CalculadoraController {
    
    private CalculadoraView theView;
    private CalculadoraModel theModel;

    public CalculadoraController(CalculadoraView theView, 
                                 CalculadoraModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addBtnSomarListener(new SomarListener());
    }
    
    class SomarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                
                double num1 = Double.parseDouble(theView.getTxtNum1());
                double num2 = Double.parseDouble(theView.getTxtNum2());

                theModel.setNum1(num1);
                theModel.setNum2(num2);
                double resultado = theModel.somar();

                theView.setResultado(Double.toString(resultado));
                
            }catch(NumberFormatException ex){
                theView.displayMensagemDeErro(
                        "Entre com dos valores numéricos!!");
            }
        }
    }
    
    
}
