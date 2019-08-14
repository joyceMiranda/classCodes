package mvc_calculadora.mvc;

import mvc_calculadora.controller.CalculadoraController;
import mvc_calculadora.view.CalculadoraView;

public class CalculadoraMVC {
    public static void main(String[] args) {
      CalculadoraController controller = 
                new CalculadoraController(new CalculadoraView());

    }
}
