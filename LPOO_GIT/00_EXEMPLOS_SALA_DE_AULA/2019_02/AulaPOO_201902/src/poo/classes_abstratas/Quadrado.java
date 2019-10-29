package poo.classes_abstratas;

public class Quadrado extends FormaGeometrica{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }
    
    
    
    
}
