package poo.heranca;

public class ExecAtleta {

    public static void main(String[] args) {
        AtletaFutebol af = new AtletaFutebol();
        af.setNomeAtleta("Léo Moura");
        af.setClube("Flamengo");
        af.setSalario(300000.00);
        af.setTempoContrato(12);
        System.out.println(
                "Atleta: " + af.getNomeAtleta() + "\n" +
                "Salário: " + af.getSalario()+ "\n" +
                "Tempo Contrato: " + af.getTempoContrato()+ "\n" +
                "Valor Contrato: " + af.calcValorContrato() 
        );
        
        AtletaAtletismo aa = new AtletaAtletismo();
        aa.setNomeAtleta("Sandro Viana");
        aa.setModalidade("Maratonista");
        aa.setSalario(50000.00);
        aa.setTempoContrato(12);
        System.out.println(
                "\nAtleta: " + aa.getNomeAtleta() + "\n" +
                "Salário: " + aa.getSalario()+ "\n" +
                "Tempo Contrato: " + aa.getTempoContrato()+ "\n" +
                "Valor Contrato: " + aa.calcValorContrato()
        );
    }
    
}
