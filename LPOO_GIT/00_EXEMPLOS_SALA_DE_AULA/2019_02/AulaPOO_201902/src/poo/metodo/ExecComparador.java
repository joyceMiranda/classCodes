package poo.metodo;

public class ExecComparador {

    public static void main(String[] args) {
        Comparador comp = new Comparador();
        int a=5, b=10, c=0;
        
        System.out.println("Maior Valor: " 
                + comp.maiorValor(a, c));
        System.out.println("Maior Valor: " 
                + comp.maiorValor(a, b, c));
    }    
}
