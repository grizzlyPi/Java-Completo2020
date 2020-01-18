package entities;

public class User {
	
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
    // *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/
    // - - - - - - - - C O N S T R U C T O R S - - - - - - - - - -  
	// - - - - - - - -  O V E R L O A D I N G  - - - - - - - - - -   
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public User(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
	
	public User(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
    // *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/ 
    // - - - - - -  G E T T E R S / S E T T E R S  - - - - - - - - 
	// - - - - - - -  E N C A P S U L A T I O N  - - - - - - - - -  
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public int getNumber() {
		return accountNumber;
	}
	
	public String getHolder() {
		return accountHolder;
	}

	public void setHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // - - - - - -  O R D I N A R Y   M E T H O D S  - - - - - - - 
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}
	
	public String toString() {
		return ("Account "
				+ getNumber()
				+ ", "
				+ "Holder: "
				+ getHolder()
				+ ", "
				+ "Balance: "
				+ "$ "
				+ String.format("%.2f", getBalance()));
	}
	
}