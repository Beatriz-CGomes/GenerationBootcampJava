package Aula3;

import java.util.Scanner;

public class Exercicio3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;
		boolean doar;

		System.out.println("Digite seu nome");
		nome = sc.nextLine();

		System.out.println("Digite sua idade");
		idade = sc.nextInt();

		System.out.println("É sua primeira doação? (true/false) ");
		doar = sc.nextBoolean();

		if (idade >= 18 && idade <= 59) {
			System.out.println(nome + ", Você está apto para doar");

		} else if (idade >= 60 && idade <= 69) {
			if (doar == true) {
				System.out.println(nome + "; Você não está apto a dor");
			} else {
				System.out.println(nome + ", Você está apto a doar por não ser sua primeira doação ");
			}
		} else {
			System.out.println(nome + ", Você não pode doar por conta da sua idade");
		}
		
		sc.close();
	}
}