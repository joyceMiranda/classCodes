package mapeamento;

public class ExecProduto {
    public static void main(String[] args) {
        GenericDAO dao =
            new GenericDAO<Produto>(ConnectionFactory.getEntityManager());
    
        Categoria categoria = new Categoria("eletronicos");
        Produto produto = new Produto("TV SAMSUNG", categoria);
        
        dao.save(produto);
        dao.closeConnection();
    }
    
}
     
    
   