package poo.colecoes;

import java.util.ArrayList;
import java.util.List;

public class BasicList {
    
    public static void main(String[] args) {
        //criando lista de numeros
        List<Integer> listaNumeros = new ArrayList();
        
        //adicionando numeros à lista
        listaNumeros.add(101);
        listaNumeros.add(102);
        
        //tamanho lista
        System.out.println("Tamanho Lista: "+ 
                listaNumeros.size());
        
        //percorrendo lista
        listaNumeros.forEach((item)->{
            System.out.println(item);
        });
        
        //soma valores
        int count = 0;
        for (Integer numero : listaNumeros) {
            count = count + numero;
        }
        System.out.println("Total: " + count);
        
        //100?
        if(listaNumeros.contains(100)){
            System.out.println("100 presente");
        }else{
            System.out.println("100 ausente");
        }
        
        
    }
    
}
