package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Explorer {
    
    public static boolean writeFile(String pathFile, 
                                    String text){
        try{
            File file = new File(pathFile);
            if(file.exists()){
                FileWriter fw = new FileWriter(file, true);
                fw.append(text);
                fw.close();
            }
            return true;
        }catch(IOException e){
            System.out.println("Erro ao abrir o arquivo: " + 
                    e.toString());
            return false;
        }
    }
    
    public static boolean createFile(String pathFile){
        
        try{
            File file = new File(pathFile);
            if(file.exists()){
                return false;
            }else{
                file.createNewFile();
                return true;
            }
        }catch(IOException e){
            System.out.println("Erro ao criar o arquivo: " + 
                    e.toString());
            return false;
        }
    }
    
    public static void listContent(String path){
        
        File dir = new File(path);
        
        if(dir.exists() && dir.isDirectory()){

            File[] conteudoDiretorio = dir.listFiles();
            
            for (File file : conteudoDiretorio) {
                if(file.isDirectory()){
                    System.out.print("\n>" + file.getName());
                    System.out.println(" (pasta) ");
                    listContent(file.getPath());
                }else{
                    System.out.print(">>>" + file.getName());
                    System.out.println(" (arquivo) ");
                }
            }
            
        }
    
    }
    
    
    
}
