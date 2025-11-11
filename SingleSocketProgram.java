
// Save as SingleSocketProgram.java
import java.io.*;
import java.net.*;

class Server extends Thread {
    public void run() {
        try {
            ServerSocket ss = new ServerSocket(9999);
            System.out.println("Server started. Waiting for client...");

            Socket s = ss.accept();
            System.out.println("Client connected!");

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String msgFromClient = dis.readUTF();
            System.out.println("Message from client: " + msgFromClient);

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello Client, message received!");

            dis.close();
            dos.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println("Server Error: " + e);
        }
    }
}

class Client extends Thread {
    public void run() {
        try {
            // Wait a bit so the server has time to start first
            Thread.sleep(1500);

            Socket s = new Socket("localhost", 9999);
            System.out.println("Client started and connected to server!");

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello Server, this is the Client!");

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String msgFromServer = dis.readUTF();
            System.out.println("Message from server: " + msgFromServer);

            dis.close();
            dos.close();
            s.close();
        } catch (Exception e) {
            System.out.println("Client Error: " + e);
        }
    }
}

public class SingleSocketProgram {
    public static void main(String[] args) {
        Server server = new Server();
        Client client = new Client();

        server.start();  // start server thread
        client.start();  // start client thread
    }
}
