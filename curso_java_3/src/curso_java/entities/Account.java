package curso_java.entities;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void withdraw(Double amount) throws Exception {
		if (this.getBalance() - amount < 0) {
			throw new Exception("Montante menor que zero");
		} else {
			this.setBalance(this.getBalance() - amount);
		}
	}

	public void deposit(Double amount) {
		this.setBalance(amount + this.getBalance());
	}
	
}
