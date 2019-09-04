package poo.metodo;

import java.time.LocalDate;
import poo.metodo.Pessoa;

public class ExecPessoa {
    
    public static void main(String[] args) {
        
        Pessoa p = 
                new Pessoa();
        
        p.cpf = "000.000.000-00";
        p.nome = "Fulano";
        p.anoNascimento = 2000;
        
       int idade = p.calcIdade(LocalDate.now().getYear());
       
       System.out.println("Idade: " + idade + " ano(s)");
        
    }
    
}
