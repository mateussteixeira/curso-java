package curso_java;

import curso_java.entities.Account;
import curso_java.entities.BusinessAccount;

public class Main {
	public static void main(String[] args) throws Exception {

		Account acc = new BusinessAccount(1001, "Marcos", 100.0);
		acc.deposit(200.0);
		((BusinessAccount) acc).loan(200.0);
	}
}