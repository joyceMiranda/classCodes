package poo.classes_abstratas;

public class ExecFormaGeometrica {
    
    public static void main(String[] args) {
        
        FormaGeometrica fgQ = new Quadrado(10);
        System.out.println("Área do Quadrado: "  
                + fgQ.calcularArea());
        FormaGeometrica fgT = new Triangulo(30, 20);
        System.out.println("Área do Triângulo: " 
                + fgT.calcularArea());
        
    }
    
}
