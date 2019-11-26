package socket_tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("SERVER UP..");
        
        //criando socket de aceitacao em uma dtmda porta
        ServerSocket serverSocket = 
                new ServerSocket(6789);
        
        while(true){
            
            System.out.println("aguardando interação...");
            
            //server waiting connection
            Socket connectionSocket =  serverSocket.accept();
            
            System.out.println("requisicao recebida..");

            //criar stream de entrada conectado ao socket
            BufferedReader inFromClient =
                    new BufferedReader(
                        new InputStreamReader(
                                connectionSocket.getInputStream()));
            
            //recebendo sentença do cliente
            String clientSentence = inFromClient.readLine();
            
            System.out.println("sentença recebida: " + clientSentence);
            
            System.out.println("processando...");
            
            String capitalized = clientSentence.toUpperCase() + "\n";
            
            //criando stream de saída ligado ao socket
            DataOutputStream outToClient =
                    new DataOutputStream(
                            connectionSocket.getOutputStream());
            
            //escrever saída no cliente
            outToClient.writeBytes(capitalized);
        }
        
    }
    
}
