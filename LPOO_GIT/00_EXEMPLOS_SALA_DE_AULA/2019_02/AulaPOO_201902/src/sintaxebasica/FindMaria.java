package sintaxebasica;

import javax.swing.JOptionPane;

public class FindMaria {
    public static void main(String[] args) {
        String nome ;
        int count = 0;
        
        do{
            nome = JOptionPane.showInputDialog(
                        "Informe um nome: \nDigite FIM para sair");
            if(nome.equalsIgnoreCase("Fim")){
                break;
            }
            if(nome.equalsIgnoreCase("Maria")){
                count++;
            }
            
        }while(!nome.equalsIgnoreCase("Fim"));
        
        JOptionPane.showMessageDialog(null, 
                "Maria apareceu " + count + " vez(es).");
    }
}
