import java.util.Date;

public class Account {
private int id;
private double balance;
private double annualInterestRate;
private Date dateCreated;
public Account() {
	id=0;
	balance = 0;
	annualInterestRate=0;
	dateCreated.setTime(dateCreated.getTime());

}

public Account(int id, double balance) {
	super();
	this.id = id;
	this.balance = balance;
	dateCreated= new Date();
}

public Account(int id, double balance, double annualInterestRate) {
	super();
	this.id = id;
	this.balance = balance;
	this.annualInterestRate = annualInterestRate;
	dateCreated= new Date();
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}


public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public double getAnnualInterestRate() {
	return annualInterestRate;
}

public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}

public Date getDateCreated() {
	return dateCreated;
}
public double getMonthlyInterestRate(){
	return getAnnualInterestRate()/1200;
}
public double getMonthlyInterest(){
	return getMonthlyInterestRate()*getBalance();
}
public void withdrawal(double ammount) {
	if (this.balance>=ammount&&ammount>0) {
		this.balance -= ammount;
		System.out.println("Withdrawal succesfull \n Balance: "+this.balance);
	} else {
		System.out.println("The amount is too great to withdraw \n Not enough balance \n"+this.balance);
	}

}
 public void deposit(double ammount) {
	 if (ammount > 0) {
			this.balance += ammount;
			System.out.println("Deposit successfull \n"+this.balance);
		}else {
			System.out.println("Ammount must be possitive");
		}

 }

@Override
public String toString() {
	return "Account [balance=" + balance  + ", getMonthlyInterest()="
			+ getMonthlyInterest() + ", dateCreated=" + dateCreated+ "]";
}
 
}
