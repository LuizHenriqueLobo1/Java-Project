package exe13;

public class Account {

	int number;
	double balance;
	String type;
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void updateBalance() {
		if(this.type.equals("corrente"))
			this.balance--;
		else if(this.type.equals("poupança"))
			this.balance += (this.balance / 100);
		else
			System.out.println("Tipo de conta inválido");
	}
	
}