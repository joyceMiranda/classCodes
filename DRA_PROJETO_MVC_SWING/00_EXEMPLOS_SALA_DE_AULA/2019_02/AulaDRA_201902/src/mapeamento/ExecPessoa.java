/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.hibernate.mapping.Collection;

/**
 *
 * @author mdsjo
 */
public class ExecPessoa {
    public static void main(String[] args) {
        
        GenericDAO<Pessoa> dao = 
            new GenericDAO<>(
                ConnectionFactory.getEntityManager());
        
        Pessoa p = 
            new Pessoa("Fulana", 
                new GregorianCalendar(2019, 9, 9),
                Genero.FEMININO);
        
        List<String> telefones = new ArrayList<>();
        telefones.add("00 000-000");
        telefones.add("11 111-111");
        
        p.setTelefones(telefones);
        
        Endereco endereco = 
                new Endereco("Rua dos bobos", 0, "00000-000");
        p.setEndereco(endereco);
        
        dao.save(p);
        dao.closeConnection();
    }
}
