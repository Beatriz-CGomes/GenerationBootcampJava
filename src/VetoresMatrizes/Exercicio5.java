package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		/// Resolvendo o mesmo problema apenas com vetores. 
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serão cadastrados? ");
		int num = sc.nextInt();

		String[] nomes = new String[num];
		double[] nota1 = new double[num];
		double[] nota2 = new double[num];
		double[] nota3 = new double[num];
		double[] nota4 = new double[num];
		double[] somaMedia = new double[num];

		for (int i = 0; i < num; i++) {
			System.out.println("Entre com dados do aluno " + (i + 1) + " ° ");
			sc.nextLine();
			System.out.println("Nome: ");
			nomes[i] = sc.nextLine();

			System.out.println("Nota 1: ");
			nota1[i] = sc.nextDouble();

			System.out.println("Nota 2: ");
			nota2[i] = sc.nextDouble();

			System.out.println("Nota 3: ");
			nota3[i] = sc.nextDouble();

			System.out.println("Nota 4: ");
			nota4[i] = sc.nextDouble();
		}

		System.out.println("Soma dos alunos é: ");
		for (int i = 0; i < num; i++) {
			somaMedia[i] = nota1[i] + nota2[i] + nota3[i] + nota4[i];
			somaMedia[i] = somaMedia[i] / 4;
			System.out.println(nomes[i] + " : " + somaMedia[i]);

		}

		sc.close();
	}

}
