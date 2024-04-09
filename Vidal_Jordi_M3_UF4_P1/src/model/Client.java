package model;

public class Client extends Person{

	int memberID;
	Amount balance;
	final static int MEMBER_ID = 456;
	final static Amount BALANCE = new Amount(50.0);
	
	public Client(String name) {
		super(name);
		this.memberID = MEMBER_ID;
		this.balance = BALANCE;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public Amount getBalance() {
		return balance;
	}

	public void setBalance(Amount balance) {
		this.balance = balance;
	}
}
