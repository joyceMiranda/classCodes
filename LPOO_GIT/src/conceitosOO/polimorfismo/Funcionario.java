/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.polimorfismo;

public class Funcionario {

    private String nome;
    private double salarioBruto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public double calcSalarioLiquido(double desconto){
        return this.salarioBruto * desconto * 0.01;
    }
    
    
    
}
