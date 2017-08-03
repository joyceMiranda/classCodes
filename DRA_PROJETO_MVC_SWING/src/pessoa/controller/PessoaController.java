package pessoa.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import pessoa.model.PessoaModel;
import pessoa.view.PessoaView;

public class PessoaController {

    private PessoaView theView;
    private PessoaModel theModel;
    
    public PessoaController(PessoaView theView, PessoaModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        
        theView.addBtnCalcIdadeListener(new CalcularIdadeListener());
    }
    
    class CalcularIdadeListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //capturar dataNascimento da tela
            String txtDataNascimento = theView.getTxtDataNascimento();
            
            //converter String para LocalDate
            String dia = txtDataNascimento.substring(0, 2);
            System.out.println(dia);
            String mes = txtDataNascimento.substring(3, 5);
                        System.out.println(mes);

            String ano = txtDataNascimento.substring(6, 10);
                        System.out.println(ano);

            
            LocalDate dataNascimento = LocalDate.of(Integer.parseInt(ano), 
                                       Integer.parseInt(mes), 
                                       Integer.parseInt(dia));
            
            
            //setar dataNascimento no modelo
            theModel.setDataNascimento(dataNascimento);
            
            //recuperar anoAtual
            int anoAtual = LocalDate.now().getYear();
            
            //executa metodo calcIdade do modelo
            int idade = theModel.calcIdade(anoAtual);
            
            theView.setIdade(Integer.toString(idade));
            
            
            
            
        
        }
    
    }
}
