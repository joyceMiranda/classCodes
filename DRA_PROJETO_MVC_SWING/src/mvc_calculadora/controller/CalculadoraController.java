package mvc_calculadora.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc_calculadora.model.CalculadoraModel;
import mvc_calculadora.view.CalculadoraView;

public class CalculadoraController {
    
    private CalculadoraView view;
    
    public CalculadoraController(CalculadoraView view){
        this.view = view;
        this.view.addBtnSomarListener(new SomarListener());
        this.view.setVisible(true);
    }
    
    private class SomarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(!view.getTxtNum1().equals("") && !view.getTxtNum2().equals("") ){
                //interagindo com a view
                double num1 = Double.parseDouble(view.getTxtNum1());
                double num2 = Double.parseDouble(view.getTxtNum2());

                //interagindo com o model
                CalculadoraModel model = new CalculadoraModel(num1, num2);

                //interagindo com a view
                view.setTxtResultado(Double.toString(model.somar()));
            }else{
                view.showMsg("Informe todos os valores!");
            }
        
    }

    }    
}
