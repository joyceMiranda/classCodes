package io;

public class ExecExplorer {
    
    public static void main(String[] args) {
        
        System.out.println("<< LISTANDO CONTEÚDO DE UM DIRETÓRIO >>");
        
        String path = "D:\\Google Drive\\Material de Aula\\LPOO\\";
        
        Explorer.listContent(path);
        
        System.out.println("\n\n<< CRIANDO ARQUIVO EM UM DIRETÓRIO >>");

        boolean criou = 
                Explorer.createFile(path + "teste.txt");
        
        if(criou){
            System.out.println("Arquivo Criado!");
        }else{
            System.out.println("ERRO: "
                    + "Não foi possível criar o arquivo!");
        }
        
        System.out.println("\n\n<< ESCREVENDO EM UM ARQUIVO >>");
        
        boolean escreveu = Explorer.writeFile(path + "teste.txt",
                "!!AULA TOP POO 222!!");
        
        if(escreveu){
             System.out.println("Escrita OK!");
        }else{
             System.out.println("ERRO: Escrita NOT OK!");
        }
        
        
        

        
    }
    
}
