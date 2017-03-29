import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private double withdraw = 0;
	private double deposit = 0;
	private double total = 0;
	private double monthly = 0;
	private Date date = new Date();
	
	public Account() {
		
	}
	
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public java.util.Date getDate() {
		return this.date;
	}
	
	public double getWithdraw() {
		return this.withdraw;
	}
	
	public void setWithdraw(double newWithdraw) {
		withdraw = newWithdraw;
	}
	
	public double getDeposit() {
		return this.deposit;
	}
	
	public void setDeposit(double newDeposit) {
		deposit = newDeposit;
	}
	
	public double getTotal(double balance, double deposit, double withdraw) {
		return this.total;
	}
	
	public void setTotal(double newTotal) {
		total = balance - withdraw + deposit;
	}
	
	public double getMonthly(double total) {
		return this.monthly;
	}
	
	public void setMonthly(double newMonthly) {
		monthly = total * .045 /12;
	}
	
	public String toString() {
		return "Banking Account Information\n" + "\nYour Customer ID # " + id + "\nStarting Balance $" +
				balance + "\nAnnual Interest Rate " + annualInterestRate + "%" + "\nWithdraw Amount $" + 
				withdraw + "\nDeposite Amount $" + deposit + "\nSubtotal $" + total + "\nMonthly Interest $" +
				Math.round(monthly * 100.0) / 100.0 + "\n" + "\n" + "As of " + date;
	}

}
