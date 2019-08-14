package sintaxebasica;

import java.time.LocalDate;
import java.util.Scanner;

public class TesteScanner {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nome = read.nextLine();
        
        System.out.println("Informe o ano de seu nascimento: ");
        int anoNasc = read.nextInt();
        
        int anoAtual = LocalDate.now().getYear();
        
        int idade = anoAtual - anoNasc;
        
        System.out.println("Nome: " + nome + 
                           "\nAno de Nascimento: " + anoNasc + 
                           "\nIdade: " + idade + " ano(s)");
        
        
        
    }
    
}
