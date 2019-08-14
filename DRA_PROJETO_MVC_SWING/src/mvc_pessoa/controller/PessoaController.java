package mvc_pessoa.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import mvc_pessoa.model.PessoaModel;
import mvc_pessoa.view.PessoaView;

public class PessoaController {
    private PessoaView view;

    public PessoaController(PessoaView view) {
        this.view = view;
        this.view.addBtnCalcIdadeListener(new CalcIdadeListener());
        this.view.setVisible(true);
    }
    
    private class CalcIdadeListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //interagindo com a view
            String txtDataNascimento = view.getTxtDataNascimento();
            
            DateTimeFormatter formatador = 
                     DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataNascimento = LocalDate.parse
                                        (txtDataNascimento, formatador);
            
            //interagindo com o model
            PessoaModel model = new PessoaModel(dataNascimento);
            int idade = model.calcIdade(LocalDate.now().getYear());
            
            //interagindo com a view
            view.setTxtIdade(Integer.toString(idade));
        }
        
    }
    
    
}
