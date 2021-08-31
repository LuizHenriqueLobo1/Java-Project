package MainCliente;

import java.net.*;
import java.io.*;

public class Client {
	
	public static Socket client;
	
	public static void main(String[] args) {
		try {
			client = new Socket("localhost", 3334);
		} catch(IOException ex) {
			System.out.println("Falha na conexão com o servidor.");
		}
	}
	
}