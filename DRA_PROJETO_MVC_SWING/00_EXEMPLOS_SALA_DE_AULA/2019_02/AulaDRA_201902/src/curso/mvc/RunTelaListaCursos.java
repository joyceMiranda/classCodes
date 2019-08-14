package curso.mvc;

import curso.controller.ListaCursosController;
import curso.view.TelaListaCursos;

public class RunTelaListaCursos {
    
    public static void main(String[] args) {
        new ListaCursosController(new TelaListaCursos());
    }
}
