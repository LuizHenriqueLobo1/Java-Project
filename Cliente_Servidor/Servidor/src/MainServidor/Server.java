package MainServidor;

import java.net.*;
import java.io.*;

public class Server {
	
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(3334);
			System.out.println("Servidor inicado.");
			
			Socket client = server.accept();
			System.out.println("Cliente conectado.");
			System.out.println("IP do cliente: " + client.getInetAddress().getHostAddress());
			
			server.close();
		} catch(IOException ex) {
			System.out.println("Erro ao criar servidor.");
		}
		
	}
	
}