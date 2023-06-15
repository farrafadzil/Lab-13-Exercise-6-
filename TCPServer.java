// TCPServer.java
import java.io.*;
import java.net.*;

public class TCPServer {
    private int port;
    private Translator translator;
    
    public TCPServer(int port) {
        this.port = port;
        this.translator = new Translator();
    }
    
    public void start() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started. Waiting for client connections...");
            
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());
                
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                
                String text = reader.readLine();
                String targetLanguage = reader.readLine();
                
                // Translate the text
                String translatedText = translator.translate(text, targetLanguage);
                
                // Send the translated response back to the client
                writer.println(translatedText);
                
                // Close the connections
                reader.close();
                writer.close();
                clientSocket.close();
                
                System.out.println("Request processed.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        TCPServer server = new TCPServer(9999); // Replace with the desired server port
        server.start();
    }
}
