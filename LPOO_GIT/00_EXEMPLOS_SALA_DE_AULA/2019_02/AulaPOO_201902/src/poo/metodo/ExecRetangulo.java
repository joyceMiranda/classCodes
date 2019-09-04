package poo.metodo;

public class ExecRetangulo {
    
    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo();
        ret.setAltura(10.0);
        ret.setBase(20.0);
        System.out.println("Área Calculada: " + ret.calcArea());
        
        
    }
    
}
