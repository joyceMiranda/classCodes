package poo;

import java.util.Scanner;

public class ExecEquipe {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Equipe eq = new Equipe();
        
        System.out.println("Informe o nome da equipe: ");
        eq.nomeEquipe = scan.next();
        
        System.out.println(
                "Informe a quantidade de componentes da equipe: ");
        int qtdeComponentes = scan.nextInt();         
        
        eq.alunos = new Aluno[qtdeComponentes];
        
        for (int i = 0; i < qtdeComponentes; i++) {
            Aluno aluno = new Aluno();
            System.out.println("Informe a matricula do aluno " + (i+1));
            aluno.matricula = scan.next();
            System.out.println("Informe o nome do aluno " + (i+1));
            aluno.nome = scan.next();
            
            eq.alunos[i] = aluno;            
        }
    }
}
