package curso_java.entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;

	public BusinessAccount(Integer number, String holder, Double loanLimit) {
		super(number, holder);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return this.loanLimit;
	}
	
	public void loan(Double loan) throws Exception {
		if(loan <= this.loanLimit) {
			this.deposit(loan);
			System.out.println("Emprestimo feito com sucesso");
		}else {
			throw new Exception("Limite não permitido!");
		}
	}
	
	
}
