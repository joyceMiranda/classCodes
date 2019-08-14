package conta.model;

public class Conta {
    
    private int numero;
    private double saldo ;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo = this.saldo + valor;
            return true;
        }
        return false;
    }
    
    public boolean sacar(double valor){
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }
    
    
    
    
    
}
