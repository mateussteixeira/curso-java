package curso_alturas.application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas? ");
		int quantityPessoas = sc.nextInt();
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		for (int i = 1; i <= quantityPessoas; i++) {
			System.out.println("Dados da " + i + "a pessoa:");
			Pessoa pessoa = new Pessoa();
			System.out.print("Nome: ");
			pessoa.setName(sc.next());
			System.out.print("Idade: ");
			pessoa.setIdade(sc.nextInt());
			System.out.print("Altura: ");
			pessoa.setAltura(sc.nextDouble());
			pessoas.add(pessoa);
		}

		Double sum = pessoas.stream().mapToDouble(pessoa -> pessoa.getAltura()).sum();

		System.out.println("As alturas somadas tem " + sum);

		ArrayList<Pessoa> pessoasComMenos = new ArrayList<Pessoa>();

		pessoas.forEach(pessoa -> {
			if (pessoa.getIdade() < 16) {
				pessoasComMenos.add(pessoa);
			}
		});

		System.out.println("Pessoas com menos de 16 anos: " + (pessoasComMenos.size() * 100.0f) / pessoas.size());
		
		pessoasComMenos.forEach(pessoa -> System.out.println(pessoa.getName()));
	}

}
