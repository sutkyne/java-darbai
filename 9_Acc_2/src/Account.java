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
	dateCreated.setTime(dateCreated.getTime());
}

public Account(int id, double balance, double annualInterestRate) {
	super();
	this.id = id;
	this.balance = balance;
	this.annualInterestRate = annualInterestRate;
	dateCreated.setTime(dateCreated.getTime());
}

}
