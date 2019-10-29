package io;

import java.io.File;

public class ListFiles {
    
    public static void main(String[] args) {
        
        File dir = new File("D:\\");
        
        if(dir.exists() && dir.isDirectory()){
            File[] conteudoDiretorio = dir.listFiles();
            
            for (File file : conteudoDiretorio) {
                System.out.print("=>" + file.getName());
                if(file.isDirectory()){
                    System.out.println(" (pasta) ");
                }else{
                    System.out.println(" (arquivo) ");
                }
            }
            
        }
        
    }
    
}
