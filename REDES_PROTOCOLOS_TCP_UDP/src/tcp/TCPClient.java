package socket_tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    
    public static void main(String[] args) throws IOException {
        System.out.println("CLIENT UP..");
        String sentence = "";
        do{            
            Scanner scan = new Scanner(System.in);            
            System.out.print("\nINPUT TEXT: ");
            sentence = scan.nextLine();
            
            if(sentence.equalsIgnoreCase("exit")) break;
            
            //criando socket de conexao com o servidor
            Socket clientSocket = new Socket("10.100.37.62", 6789);
            
            //criando stream de saída ligado ao socket
            DataOutputStream outToServer = 
                    new DataOutputStream(
                            clientSocket.getOutputStream());
            
            //enviando linha pro server
            outToServer.writeBytes(sentence + "\n");
            
            //criando stream de entrada ligado ao socket
            BufferedReader inFromServer =
                    new BufferedReader(
                        new InputStreamReader(
                                clientSocket.getInputStream()));
            
            //recuperando resposta do server
            String capitalizedSentence = inFromServer.readLine();
            
            System.out.println("OUTPUT SERVER: " + capitalizedSentence);
            
            clientSocket.close();
            
        }while(!sentence.equalsIgnoreCase("exit"));
    }
    
}
