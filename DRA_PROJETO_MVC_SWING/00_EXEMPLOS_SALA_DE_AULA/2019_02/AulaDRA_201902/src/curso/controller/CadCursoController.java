package curso.controller;

import curso.dao.CursoDAO;
import curso.model.Curso;
import curso.view.TelaCadCurso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadCursoController {

    private TelaCadCurso telaCadCurso;
    
    public CadCursoController(TelaCadCurso telaCadCurso){
        this.telaCadCurso = telaCadCurso;
        this.telaCadCurso.addBtnCadCursoListener(
                new BtnCadCursoListener());
        this.telaCadCurso.setVisible(true);
    }

    public class BtnCadCursoListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            System.out.println("Cadastrando Curso...");
            
            //recuperar dados da tela
            String sigla = telaCadCurso.getTxtSigla();
            String descricao = telaCadCurso.getTxtDescricao();
            
            //criar um novo objeto
            Curso curso = new Curso(0, sigla, descricao);
            
            //persistir o objeto no BD
            CursoDAO dao = new CursoDAO();
            boolean ok = dao.cadastrar(curso);
            
            if(ok){
                telaCadCurso.showMsg(
                    "Cadastro realizado com sucesso!");
            }else{
                telaCadCurso.showMsg(
                    "ERRO! Cadastro não realizado!");
            }
            
        }
        
    }
    
    
}
