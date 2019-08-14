package poo;

public class ExecProduto {
    public static void main(String[] args) {
        Produto prod = new Produto();
        prod.codigo = 1;
        prod.nome = "Notebook Samsung";
        prod.valor = 5000.00;
        prod.categoria = new Categoria();
        prod.categoria.nome = "Eletrônicos";
        
        System.out.println("Categoria: " + prod.categoria.nome + 
    "\n * Produto: " + prod.nome + " => Valor: R$ " + prod.valor);
        
    }
}
