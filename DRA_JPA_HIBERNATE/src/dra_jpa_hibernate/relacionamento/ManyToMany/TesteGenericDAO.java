package dra_jpa_hibernate.relacionamento.ManyToMany;

import dra_jpa_hibernate.relacionamento.ManyToOne.*;
import dra_jpa_hibernate.relacionamento.OneToMany.Funcionario_ManyToOne;
import java.util.ArrayList;
import java.util.Collection;
import jpa.basics.daogenerico.*;
import jpa.basics.connectionfactory.ConnectionFactory;

public class TesteGenericDAO {
    public static void main(String[] args) {
        
        GenericDAO<Livro> pedidoDAO = 
                new GenericDAO<>
                    (ConnectionFactory.getEntityManager());
        
        Collection<Autor> autores = new ArrayList<>();
        autores.add(new Autor("Fulano"));
        autores.add(new Autor("Beltrano"));
        autores.add(new Autor("Ciclano"));
        
        Livro livro = new Livro("XYZ", autores);
        
        pedidoDAO.save(livro);
        
        ConnectionFactory.closeEntityFactory();
        
        
    }
}
