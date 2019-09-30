package mapeamento;

public class ExecEstadoGov {
    public static void main(String[] args) {
        
        GenericDAO dao = 
            new GenericDAO<Estado>(
                    ConnectionFactory.getEntityManager());
        
        Governador gov = new Governador("Beltrano");
        Estado estado = new Estado("AM", gov);
        
        dao.save(estado);
        dao.closeConnection();
        
    }
    
}
