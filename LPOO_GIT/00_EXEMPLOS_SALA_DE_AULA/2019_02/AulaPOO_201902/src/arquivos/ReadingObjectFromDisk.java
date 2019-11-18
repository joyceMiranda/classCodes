
package arquivos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ReadingObjectFromDisk {
    
    public static void main(String[] args) {
        
        try {
            //carregar arquivo
            FileInputStream fis =
                    new FileInputStream("D:\\aluno.dat");
            while(fis.available() > 0){
                ObjectInputStream ois = 
                        new ObjectInputStream(fis);
                Aluno aluno = (Aluno) ois.readObject();
                System.out.println("Aluno: " + 
                        aluno.getMatricula() + " - " + aluno.getNome());
            }
           
            
            
        } catch(Exception ex){
            System.out.println("Erro: " + ex.toString());
        }
        
    }
    
}
