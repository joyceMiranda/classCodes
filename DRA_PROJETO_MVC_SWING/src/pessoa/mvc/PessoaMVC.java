package pessoa.mvc;

import pessoa.controller.PessoaController;
import pessoa.model.PessoaModel;
import pessoa.view.PessoaView;

public class PessoaMVC {
    
    public static void main(String args[]){
        
        PessoaView theView = new PessoaView();
        PessoaModel theModel = new PessoaModel();
        PessoaController theController = new PessoaController(theView, theModel);
        
        theView.setVisible(true);
        
    }
}
