
public class CreditAccount extends DebitAccount {

	private double borrowLimit;
	private double balance;

//DebitAccount d =new DebitAccount(super.getNumber(), super.getName(), super.getBalance());
	public CreditAccount(DebitAccount a, double balance, double borrowLimit) {
		super(a.getNumber(), a.getName());
		this.borrowLimit = borrowLimit;
		this.balance = balance;
	}

	public void borrowMoney(double ammount) {
		if (ammount <= this.borrowLimit) {
			this.balance += ammount;
			System.out.println("Your balance has successfully increased \n Balance: " + this.balance);
		} else {
			System.out.println("Unable to borrow, the limit is: " + this.borrowLimit);
		}
	}


	@Override
	public void cashWithdrawal(double ammount) {
		// TODO Auto-generated method stub
		if (balance>=ammount&&ammount>0) {
			balance -= ammount;
			System.out.println("Cash withrawn succesfully \n Balance: "+balance);
		} else {
			System.out.println("The amount is too great to withdraw \n Not enough balance \n Balance: "+balance);
		}
	}

	@Override
	public void topUpBalance(double ammount) {
		// TODO Auto-generated method stub
		if (ammount > 0) {
			balance += ammount;
			System.out.println("Balance topped up successfully \n Balance: "+balance);
		}
	}

	@Override
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		this.balance=balance;
	}

	@Override
	public String toString() {
		return "CreditAccount [Number= " + getNumber() + ", Name=" + getName() + "\n borrowLimit= " + borrowLimit
				+ ", balance=" + this.balance + "]";
	}

}
