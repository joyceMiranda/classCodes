package conta.mvc;

import conta.controller.ContaController;
import conta.view.TelaConta;


public class RunConta {

    public static void main(String[] args) {
        ContaController controller = 
                new ContaController(new TelaConta());
    }
    
}
