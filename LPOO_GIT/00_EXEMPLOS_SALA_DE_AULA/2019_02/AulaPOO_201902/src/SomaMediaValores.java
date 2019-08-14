import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");
        double[] numeros = new double[10];
        double soma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scan.nextDouble();
            soma = soma + numeros[i];
        }
        double media = soma/numeros.length; 
        System.out.println("Soma = " + (int) soma);
        System.out.println("Média = " + df.format(media));
    }
    
}
