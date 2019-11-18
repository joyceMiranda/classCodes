package tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        
        System.out.println("==CLIENT STARTED==");
        
        String sentence;
        String modifiedSentence;
        
        do{
            //cria stream de entrada
			System.out.print("\nINPUT TEXT: ");

            BufferedReader inFromUser = 
                    new BufferedReader(new InputStreamReader(System.in));

            sentence = inFromUser.readLine(); 
            
            if(sentence.equalsIgnoreCase("EXIT")) break;
            
            //cria socket, conecta ao servidor
            Socket clientSocket = new Socket("localhost", 6789);

            //cria stream de saída ligado ao socket
            DataOutputStream outToServer =
                    new DataOutputStream(clientSocket.getOutputStream());

            //envia linha para o servidor
            outToServer.writeBytes(sentence + '\n');
            
            //cria stream de entrada ligado ao socket
            BufferedReader inFromServer =  new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));

            modifiedSentence = inFromServer.readLine();

            System.out.println("OUTPUT FROM SERVER: " + modifiedSentence);
            
            clientSocket.close(); 

        }while(!sentence.equalsIgnoreCase("EXIT"));
    }
}
