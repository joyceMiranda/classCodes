package arquivos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SavingObjectInDisk {
    
    public static void main(String[] args) {
        
        String continua = "";
        Scanner scan = new Scanner(System.in);
        
        do{   
            System.out.println(
                    "Deseja inserir um novo aluno? [ok || nok]");
            continua = scan.next();
            if(!continua.equalsIgnoreCase("ok")) break;
            
            System.out.println("Informe a matrícula:");
            String matricula = scan.next();
            System.out.println("Informe o nome:");
            String nome = scan.next();
            Aluno aluno = new Aluno(matricula, nome);

            try{

                //criando stream 
                FileOutputStream fos = 
                    new FileOutputStream("D:\\aluno.dat", true);

                //insere obj no stream
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(aluno);

                System.out.println("Aluno salvo com sucesso!");

                oos.close();
                fos.close();

            }catch(Exception ex){
                System.out.println("Erro: " + ex.toString());
            }
        }while(continua.equalsIgnoreCase("ok"));
    }
    
}
