package mvc_conta.model;

public class Conta {
    private int numero;
    private double saldo;

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void sacar(double valor){
        this.saldo = this.saldo - valor;
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
}
