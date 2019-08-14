package mvc_calculadora.model;

public class CalculadoraModel {
    
    private double num1;
    private double num2;

    public CalculadoraModel(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
    public double somar(){
        return this.num1 + this.num2;
    }
}
