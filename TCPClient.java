// TCPClient.java
import java.io.*;
import java.net.*;

public class TCPClient {
    private String serverIP;
    private int serverPort;
    
    public TCPClient(String serverIP, int serverPort) {
        this.serverIP = serverIP;
        this.serverPort = serverPort;
    }
    
    public void connect() {
        try {
            Socket socket = new Socket(serverIP, serverPort);
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader responseReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            while (true) {
                // Get English text and target language from the user
                System.out.print("Enter English text (or 'exit' to quit): ");
                String text = reader.readLine();
                if (text.equalsIgnoreCase("exit")) {
                    break;
                }
                
                System.out.print("Enter target language (e.g., 'Bahasa Malaysia', 'Arabic', 'Korean'): ");
                String targetLanguage = reader.readLine();
                
                // Send request to the server
                writer.println(text);
                writer.println(targetLanguage);
                
                // Receive and display the translated response
                String translatedText = responseReader.readLine();
                System.out.println("Translated text: " + translatedText);
                System.out.println();
            }
            
            // Close the connections
            reader.close();
            writer.close();
            responseReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        TCPClient client = new TCPClient("localhost", 9999); // Replace with the actual server IP and port
        client.connect();
    }
}
