package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serão cadastrados? ");
		int num = sc.nextInt();

		System.out.println("Quantas notas serão cadastradas? ");
		int numNotas = sc.nextInt();

		double notas[][] = new double[num][numNotas];
		double[] somaMedia = new double[numNotas];
		String[] nomes = new String[num];

		System.out.println("Entre com dados do aluno ");

		for (int i = 0; i < num; i++) {

			System.out.print("Nome: " + (i + 1) + " ° ");
			sc.next();
			nomes[i] = sc.nextLine();

			for (int j = 0; j < numNotas; j++) {

				System.out.println("Entre com as notas do aluno: " + (j + 1) + " ° ");
				notas[i][j] = sc.nextDouble();
			}

		}

		System.out.println("A média do aluno é:  ");

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < numNotas; j++) {
				somaMedia[i] += (notas[i][j]) / numNotas;

			}

			System.out.println(nomes[i] + " : " + somaMedia[i]);

			if (somaMedia[i] >= 6.75) {
				System.out.println("Parabéns, " + nomes[i] + " você foi aprovado ");
				System.out.println("-------------------------");
			} else if (somaMedia[i] >= 5.50 && somaMedia[i] <= 6.74) {
				System.out.println(nomes[i] + " você está recuperação ");
				System.out.println("-------------------------");
			} else {
				System.out.println(nomes[i] + " você foi reprovado ");
				System.out.println("-------------------------");
			}
		}
		sc.close();
	}

}
