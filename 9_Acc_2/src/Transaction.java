import java.util.Date;

public class Transaction {
	private Date transactionDate;
	private char typeOfTransaction; // w for withdrawal, d for deposit
	private double transactionAmmount;
	private double balance;
	private String descriptionOfTransaction = "";

	public Transaction(char typeOfTransaction, double transactionAmmount, double balance, String descriptionOfTransaction) {
		this.transactionDate = new Date();
		this.typeOfTransaction = typeOfTransaction;
		this.transactionAmmount = transactionAmmount;
		this.balance = balance;
		this.descriptionOfTransaction = descriptionOfTransaction;

	}



	public Date getTransactionDate() {
		return transactionDate;
	}



	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}



	public char getTypeOfTransaction() {
		return typeOfTransaction;
	}



	public void setTypeOfTransaction(char typeOfTransaction) {
		this.typeOfTransaction = typeOfTransaction;
	}



	public double getTransactionAmmount() {
		return transactionAmmount;
	}



	public void setTransactionAmmount(double transactionAmmount) {
		this.transactionAmmount = transactionAmmount;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public String getDescriptionOfTransaction() {
		return descriptionOfTransaction;
	}



	public void setDescriptionOfTransaction(String descriptionOfTransaction) {
		this.descriptionOfTransaction = descriptionOfTransaction;
	}



	@Override
	public String toString() {
		return "Transaction [typeOfTransaction=" + typeOfTransaction + ", transactionAmmount=" + transactionAmmount
				+ ", newBalance=" + balance + ", transactionDate=" + transactionDate + ", descriptionOfTransaction="
				+ descriptionOfTransaction + "]";
	}

}
