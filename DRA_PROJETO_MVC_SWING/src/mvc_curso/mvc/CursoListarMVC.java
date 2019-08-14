/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_curso.mvc;

import mvc_curso.controller.CursoListarController;
import mvc_curso.model.Curso;
import mvc_curso.view.CursoListarView;

/**
 *
 * @author Jhoyce
 */
public class CursoListarMVC {
    
    public static void main(String[] args){
        CursoListarView theView = new CursoListarView();
        
        CursoListarController theController = 
                new CursoListarController(theView);
    }
    
}
