package Aula4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int idade, sexo, categoria = 0;
		char resp = 0;
		int pessoasBack = 0, mulheresFront = 0, homensMobileQuarenta = 0, mulheresFullStackTrinta = 0;

		System.out.println("/t-- Formulário de pesquisa dos colaboradores --");

		while (resp != 'n') {
			System.out.println("Digite sua idade");
			idade = sc.nextInt();

			System.out.println("Qual o seu sexo? ");
			System.out.println("1 - Masculino");
			System.out.println("2 - Feminino ");
			System.out.println("3 - Outros");
			sexo = sc.nextInt();

			System.out.println("Qual a sua profissão? ");
			System.out.println("1 - Back-end");
			System.out.println("2 - Front-end");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			categoria = sc.nextInt();

			System.out.println("Deseja continuar? (s/n)");
			resp = sc.next().charAt(0);

			if (categoria == 1) {
				pessoasBack++;
			}

			if (sexo == 2 && categoria == 2) {
				mulheresFront++;

			}

			if (sexo == 1 && categoria == 3 && idade > 40) {
				homensMobileQuarenta++;
			}

			if (sexo == 2 && categoria == 4 && idade > 30) {
				mulheresFullStackTrinta++;
			}
		}
		System.out.println("Total de pessoas back-end " + pessoasBack);
		System.out.println("Total de mulheres front-end " + mulheresFront);
		System.out.println("Total de homens Mobile com mais 40 anos " + homensMobileQuarenta);
		System.out.println("Total de mulheres FullStack com mais 30 anos " + mulheresFullStackTrinta);

		sc.close();
	}

}
