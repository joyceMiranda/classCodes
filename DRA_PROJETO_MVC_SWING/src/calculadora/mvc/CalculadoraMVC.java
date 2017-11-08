package calculadora.mvc;


import calculadora.controller.CalculadoraController;
import calculadora.model.CalculadoraModel;
import calculadora.view.CalculadoraView;

public class CalculadoraMVC {
    
    public static void main(String args[]){
        
        CalculadoraView theView = new CalculadoraView();
        CalculadoraModel theModel = new CalculadoraModel();
        CalculadoraController theController = 
                new CalculadoraController(theView, theModel);
        
        theView.setVisible(true);
    }
    
}
