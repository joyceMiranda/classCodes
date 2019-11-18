package tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("==CLIENT UP==");
        String sentence = "";
        do{
            //solicitando info do cliente
            System.out.print("\nINPUT TEXT: ");
            
            Scanner scan = new Scanner(System.in);
            sentence = scan.nextLine();
            
            if(sentence.equalsIgnoreCase("exit")) break;
            
            //cria socket, conecta servidor
            Socket clientSocket = new Socket("192.168.43.7", 6789);
            
            //cria stream de saída ligado ao socket
            DataOutputStream outToServer = 
                    new DataOutputStream(clientSocket.getOutputStream());
            
            //envia linha para o servidor
            outToServer.writeBytes(sentence + "\n");
            
            //cria stream de entrada, ligado ao socket
            //recuperar retorno do servidor
            BufferedReader inFromServer = 
                new BufferedReader(
                    new InputStreamReader(
                        clientSocket.getInputStream()));
            
            String modifiedSentence = inFromServer.readLine();
            
            System.out.println("\nOUTPUT SERVER: " + modifiedSentence);
            
            clientSocket.close();
            
            
        }while(!sentence.equalsIgnoreCase("exit"));
        
    }
    
}
