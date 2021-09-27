package exe13;

public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		for(int i = 0; i < bank.clients.length; i++) {
			Client client = new Client();
			client.setNumber(i+1);
			client.setBalance(100);
			client.setType("poupança");
			bank.addClient(client);
		}
		
		bank.clients[3].setType("corrente");
		
		bank.clients[0].setName("Luiz");
		bank.clients[1].setName("Henrique");
		bank.clients[2].setName("Fabiana");
		bank.clients[3].setName("Luciana");
		
		bank.withdraw(4, 30);
		bank.deposit("Luiz", 34);
		
		for(int i = 0; i < bank.clients.length; i++) {
			bank.clients[i].updateBalance();
		}
		
		bank.showBalance(4);
		
		for(int i = 0; i < bank.clients.length; i++) {
			System.out.println("----------");
			System.out.println(bank.clients[i].getName());
			System.out.println(bank.clients[i].getNumber());
			System.out.println(bank.clients[i].getBalance());
			System.out.println(bank.clients[i].getType());
			
		}
		
	}
	
}