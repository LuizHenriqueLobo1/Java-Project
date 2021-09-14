package exe13;

public class Bank {
	
	Client[] clients = new Client[4];

	public void withdraw(int number, double amount) {
		for(int i = 0; i < clients.length; i++) {
			if(clients[i].getNumber() == number) {
				clients[i].setBalance(clients[i].getBalance() - amount);
			}
		}
	}
	
	public void deposit(String name, double amount) {
		for(int i = 0; i < clients.length; i++) {
			if(clients[i].getName().equals(name)) {
				clients[i].setBalance(clients[i].getBalance() + amount);
			}
		}
	}
	
	public void showBalance(int number) {
		for(int i = 0; i < clients.length; i++) {
			if(clients[i].getNumber() == number) {
				System.out.println("Saldo da conta " + number + ": " + clients[i].getBalance());
			}
		}
	}
	
}