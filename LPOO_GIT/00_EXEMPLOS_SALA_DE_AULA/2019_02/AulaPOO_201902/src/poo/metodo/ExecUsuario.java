package poo.metodo;

import java.util.Scanner;

public class ExecUsuario {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do usuário:");
        Usuario user = new Usuario(scan.next());
        String amigo = ""; 
        do{
            System.out.println("Informe o nome do amigo:");
            amigo = scan.next();
            if(amigo.equalsIgnoreCase("exit")) break;
            user.adicionaAmigo(amigo);           
        }while(!amigo.equalsIgnoreCase("exit"));
    }
    
}
