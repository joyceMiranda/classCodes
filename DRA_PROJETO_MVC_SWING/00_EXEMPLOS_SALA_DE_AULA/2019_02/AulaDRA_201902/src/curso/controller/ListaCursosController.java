package curso.controller;

import curso.dao.CursoDAO;
import curso.model.Curso;
import curso.view.TelaListaCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ListaCursosController {
    
    private TelaListaCursos telaListaCursos;

    public ListaCursosController(
            TelaListaCursos telaListaCursos) {
        this.telaListaCursos = telaListaCursos;
        this.telaListaCursos.addBtnBuscarListener(
                    new BtnListarCursosListener());
        this.telaListaCursos.setVisible(true);
        
    }
    
    private class BtnListarCursosListener 
            implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Buscando por cursos...");
            
            //recup. valores da tela
            String valorBuscado = 
                    telaListaCursos.getTxtValorBuscado();
            
            //acessando o BD
            CursoDAO dao = new CursoDAO();
            Vector<Curso> listaCursos 
                    = dao.listar(valorBuscado);
            
            //montando tabela para apresentacao
            
            //definindo colunas
            Vector conjuntoColunas = new Vector();
            conjuntoColunas.add("ID");
            conjuntoColunas.add("SIGLA");
            conjuntoColunas.add("DESCRICAO");
            
            //definindo linhas
            Vector conjuntoLinhas = new Vector();
            for (Curso curso : listaCursos) {
                Vector linha = new Vector();
                linha.add(curso.getIdCurso());
                linha.add(curso.getSigla());
                linha.add(curso.getDescricao());
                conjuntoLinhas.add(linha);
            }            
            
            //atualizando registros da tabela
            DefaultTableModel model = 
             new DefaultTableModel(conjuntoLinhas, conjuntoColunas);
            telaListaCursos.setTblCursos(model);
        }
        
    }

    
    
}
