import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter out;
    private Scanner in;
    public SimpleServer(int port) throws IOException  {
        serverSocket = new ServerSocket(port);
        System.out.println("Server started and listening on port "+port);
    }
    public void acceptClient() {
    }
    public String receiveMessage() {
        return "";
    }
    public void sendMessage(String message) {
    }
    public void close() {
    }
    public static void main(String[] args) {
        try{
        SimpleServer dimple = new SimpleServer(8888);
    }
        catch(Exception e){}
    }
}
