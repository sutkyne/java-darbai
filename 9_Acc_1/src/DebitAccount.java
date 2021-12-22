
public class DebitAccount {
private int number;
private String name;
private double balance;

public DebitAccount(int number, String name) {
	super();
	this.number = number;
	this.name = name;
}

public DebitAccount(int number, String name, double balance) {
	super();
	this.number = number;
	this.name = name;
	this.balance = balance;
}

public void cashWithdrawal(double ammount) {
	if (balance>=ammount&&ammount>0) {
		balance -= ammount;
		System.out.println("Cash withrawn succesfully \n Balance: "+balance);
	} else {
		System.out.println("The amount is too great to withdraw \n Not enough balance "+this.balance);
	}

}
 public void topUpBalance(double ammount) {
	 if (ammount > 0) {
			balance += ammount;
			System.out.println("Balance topped up successfully "+this.balance);
		}else {
			System.out.println("Ammount must be possitive");
		}

 }

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public int getNumber() {
	return number;
}

public String getName() {
	return name;
}

@Override
public String toString() {
	return "DebitAccount [number=" + number + ", name=" + name + ", balance=" + balance + "]";
}

}
