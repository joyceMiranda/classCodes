package poo.metodo;

import java.util.Scanner;

public class ExecConta {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("==Sistema Bancário==");
        
        System.out.println("Informe o número da conta:");
        int numero = scan.nextInt();
        
        System.out.println("Informe o nome do cliente:");
        String nome = scan.next();
        
        System.out.println("Informe o saldo do cliente:");
        double saldo = scan.nextDouble();
        
        Conta minhaConta = new Conta(numero, nome, saldo);
        
        System.out.println("Informe a operação: "
                + " [D]epósito [S]aque");
        String operacao = scan.next();
        
        if(operacao.equalsIgnoreCase("D")){        
            System.out.println("Informe o valor: ");
            double valor = scan.nextDouble();
            boolean ok = minhaConta.depositar(valor);
            if(ok){
                System.out.println("Depósito efetuado!");
            }else{
                System.out.println("Valor inválido.");
            }
            System.out.println("Saldo Atual: " + minhaConta.saldo);
        }else if(operacao.equalsIgnoreCase("S")){
            System.out.println("Informe o valor: ");
            double valor = scan.nextDouble();
            boolean ok = minhaConta.sacar(valor);
            if(ok){
                System.out.println("Saque efetuado!");
            }else{
                System.out.println("Saldo insuficiente.");
            }
            System.out.println("Saldo Atual: " + minhaConta.saldo);
        }else{
            System.out.println("Operação inválida!");
        }
 }
    
}
