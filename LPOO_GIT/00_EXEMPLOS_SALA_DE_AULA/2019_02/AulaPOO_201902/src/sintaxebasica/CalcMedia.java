package sintaxebasica;

import java.util.Scanner;

public class CalcMedia {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         double[] notas = new double[3];
         double menorNota=0.0, somaNotas=0.0, media=0.0;

         for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i+1) + ":");
            notas[i] = scan.nextDouble(); 
            if(i==0){
                menorNota = notas[i];
            }
            somaNotas = somaNotas + notas[i];
            if(notas[i] < menorNota){
                menorNota = notas[i];
            }
         }
         media = (somaNotas - menorNota)/2;
         System.out.println("Nota Eliminada: " + menorNota);
         System.out.println("Média Final: " + media);

         
        
         
         
    }
    
}
