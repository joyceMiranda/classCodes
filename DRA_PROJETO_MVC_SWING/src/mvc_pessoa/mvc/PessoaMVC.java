
package mvc_pessoa.mvc;

import mvc_pessoa.controller.PessoaController;
import mvc_pessoa.view.PessoaView;

public class PessoaMVC {
    public static void main(String[] args) {
        PessoaController controller = 
                new PessoaController(new PessoaView());
    }
}
