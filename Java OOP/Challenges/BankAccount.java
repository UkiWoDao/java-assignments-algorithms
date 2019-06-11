package challenge1;

public class BankAccount {
	public static int globalNumber = 1;
	private int accountNumber, balance = 0, customerPhone;
	private String customerName, customerEmail;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber() {
		// create unique id automatically
		this.accountNumber = globalNumber++;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getCustomerPhone() {
		return customerPhone;
	}
	
	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerEmail() {
		return customerEmail;
	}
	
	public void setCustomerEmail(String customerEmail) {
		// mail validation is complicated but we can make sure to screen out some invalid forms
		// say all email addresses need to have "@" and ".com" 
		
		// index of non existing array elements is -1
		if(customerEmail.contains(".com") == false || customerEmail.indexOf("@") == -1){
			System.out.println("Please provide a valid e-mail address");
		} else {
			this.customerEmail = customerEmail;
		}
	}
	
	public void depositFunds(int funds) {
		balance += funds;
	}
	
	public void withdrawFunds(int funds) {
		// check if funds are 0 - the earlier we stop an inconsequential request the 
		// better and check if we are trying to withdraw more finds than are available
		if(funds != 0 && funds < balance) {
			balance -= funds;
		} else {
			System.out.println("Invalid request");
		}
	}
}
