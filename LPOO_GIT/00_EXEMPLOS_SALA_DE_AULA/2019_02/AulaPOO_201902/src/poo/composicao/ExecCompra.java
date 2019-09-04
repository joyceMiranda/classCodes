package poo.composicao;

import java.util.Scanner;

public class ExecCompra {

    public static void main(String[] args) {
        
        System.out.println("==Sistema de Compras==");
        
        Scanner scan = new Scanner(System.in);
        
        Compra compra = new Compra();
        
        System.out.println("Informe o nome do cliente:");
        compra.cliente = scan.next();
        
        System.out.println("Informe os itens da compra."
                + " - Digite ESC para encerrar.");
        
        ItemCompra item = new ItemCompra();        
        do{
            
            item.compra = compra;
            
            item.produto = new Produto();
            System.out.println("Informe o nome do produto:");
            item.produto.nome = scan.next();
            
            if(item.produto.nome.equalsIgnoreCase("ESC")) break;
            
            System.out.println("Informe a categoria do produto:");
            item.produto.categoria = new Categoria();
            item.produto.categoria.nome = scan.next();           
            
            System.out.println("Informe o valor do produto:");
            item.produto.valor = scan.nextDouble();
                        
        }while(!item.produto.nome.equalsIgnoreCase("ESC"));
        
        
        
        
        
        
    }
    
}
