package conta.mvc;

import controller.ContaController;
import view.TelaConta;

public class RunConta {

    public static void main(String[] args) {
        ContaController controller = 
                new ContaController(new TelaConta());
    }
    
}
