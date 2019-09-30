package mapeamento;

import java.util.ArrayList;

public class ExecTime {
    public static void main(String[] args) {
        GenericDAO<TimeFutebol> dao =
                new GenericDAO(
                        ConnectionFactory.getEntityManager());
        
        ArrayList<Atleta> atletas = new ArrayList();
        atletas.add(new Atleta("Neymar"));
        atletas.add(new Atleta("GabiGol"));
        atletas.add(new Atleta("Messi"));
        
        TimeFutebol time = new TimeFutebol("Barcelona", atletas);
        
        dao.save(time);
        dao.closeConnection();


        
    }
}
