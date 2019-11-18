package tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("==SERVER UP==");
        
        /*criando socket de aceitacao para TCP na porta 6789 */
        ServerSocket welcomeSocket = 
                new ServerSocket(6789);
        
        //loop para aguardar solicitacao do cliente
        while(true){
            
            System.out.println("aguardando interação...");
            
            //servidor fica aguardando interacao
            Socket connectionSocket = welcomeSocket.accept();
            
            //cria stream de entreda ligado ao socket
            //recupera stream de entrada do socket
            //e joga no buffer para manipulação
            BufferedReader inFromClient = 
                new BufferedReader(
                    new InputStreamReader(
                        connectionSocket.getInputStream()));

            System.out.println("interação detectada..");
            
            System.out.println("processando...");
            
            //processamento realizado pelo servidor
            //lê sentença de entrada do cliente
            String clientSentence = inFromClient.readLine();
            
            System.out.println("sentença recebida.." + clientSentence);
            
            String capitalizedSentence = clientSentence.toUpperCase() + "\n";
                  
            //criando stream de saída, ligado ao socket
            DataOutputStream outToClient = 
                    new DataOutputStream(
                            connectionSocket.getOutputStream());
            
            System.out.println("escrevendo saída no cliente...");

            //escreve linha no socket
            outToClient.writeBytes(capitalizedSentence);
            
            //System.out.println();
            
        }
        
    }
    
}
