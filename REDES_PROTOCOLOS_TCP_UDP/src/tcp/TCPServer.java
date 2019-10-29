package tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        System.out.println("==SERVER STARTED==");
        String clientSentence;
        String capitalizedSentence;
        
        //cria socket de aceitação na porta 6789
        ServerSocket welcomeSocket = new ServerSocket(6789);
        
        while(true) {
            
            System.out.println("\nwaiting interaction..");
            
            //espera, no socket de aceitação por contato do cliente
            Socket connectionSocket = welcomeSocket.accept(); 
            
            System.out.println("interaction detected..");
            
            //cria stream de entrada, ligado ao socket
            BufferedReader inFromClient =
                new BufferedReader(
                    new InputStreamReader(
                        connectionSocket.getInputStream()));
            
            //lê linha do socket
            clientSentence = inFromClient.readLine();
            
            System.out.println("sentence received..");
            
            System.out.println("processing..");

            capitalizedSentence = clientSentence.toUpperCase() + '\n';
            
            //cria stream de saída, ligado ao socket
            DataOutputStream outToClient =
                new DataOutputStream(
                        connectionSocket.getOutputStream()); 
            
            //escreve linha para o socket
            outToClient.writeBytes(capitalizedSentence); 
            
            System.out.println();
            
        }//fim do while loop, retorne e espere por outra conexão do cliente
    }
    
}
