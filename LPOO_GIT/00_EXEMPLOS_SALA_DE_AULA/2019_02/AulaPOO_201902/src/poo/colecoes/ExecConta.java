package poo.colecoes;

import java.util.Scanner;

public class ExecConta {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Conta[] listaContas = new Conta[3];
        
        for (int i = 0; i < listaContas.length; i++) {
            
            System.out.println("Informe o número da conta");
            int numero = scan.nextInt();
            
            System.out.println("Informe o nome do cliente");
            String nome = scan.next();
            
            Conta conta = new Conta(numero, nome);
            listaContas[i] = conta; 
        }
        
    }
    
}
