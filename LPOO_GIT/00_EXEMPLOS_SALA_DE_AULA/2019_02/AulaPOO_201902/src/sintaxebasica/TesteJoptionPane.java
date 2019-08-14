package sintaxebasica;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class TesteJoptionPane {

    public static void main(String[] args) {
        
        String nome, msg;
        int anoNasc, idade, anoAtual;
        
        nome = JOptionPane.showInputDialog(
                    "Informe seu nome:");
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog(
                    "Informe o ano do seu nascimento:"));
        
        anoAtual = LocalDate.now().getYear();
        idade = anoAtual - anoNasc;
        
        msg = "Nome: " + nome +
              "\nNascimento: " + anoNasc +
              "\nIdade: " + idade;
        
        JOptionPane.showMessageDialog(null, msg);
        
        
        
    }
    
}
