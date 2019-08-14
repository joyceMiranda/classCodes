package poo;

import java.util.Scanner;

public class ExecPessoa {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //criando obj Pessoa
        Pessoa pessoa = new Pessoa();
        
        //definindo valores p/ atributos
        System.out.println("Informe o cpf: ");
        pessoa.cpf = scan.nextLine();
        System.out.println("Informe o nome: ");
        pessoa.nome = scan.nextLine();
        
        //exibindo valores p/ atributos
        System.out.println("Cpf: " + pessoa.cpf +
                           "\nNome: " + pessoa.nome);
        
    }
    
}
