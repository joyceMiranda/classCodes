package dra_jpa_hibernate.relacionamento.OneToOne.cascade;

import jpa.basics.daogenerico.*;
import jpa.basics.connectionfactory.ConnectionFactory;

public class TesteGenericDAO {
    public static void main(String[] args) {
        
        GenericDAO<Governador_Cascade> governadorDAO = 
                new GenericDAO<>
                    (ConnectionFactory.getEntityManager());
        
        Governador_Cascade governador = new Governador_Cascade("Fulaninho");
        
        GenericDAO<Estado_Cascade> pessoaDAO = 
                new GenericDAO<>
                    (ConnectionFactory.getEntityManager());
        
        Estado_Cascade estado = 
                new Estado_Cascade("Amazonas", governador);
        pessoaDAO.save(estado);
        
        ConnectionFactory.closeEntityFactory();
        
        
    }
}
