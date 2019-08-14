package curso.mvc;

import curso.controller.CadCursoController;
import curso.view.TelaCadCurso;

public class RunTelaCadCurso {
    
    public static void main(String[] args) {
        new CadCursoController(new TelaCadCurso());
    }
    
}
