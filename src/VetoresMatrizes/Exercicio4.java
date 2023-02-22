package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		float[] notas = new float[4];
		float n1, n2, n3, n4, somaNotas;
		String nome;

		for (int alunos = 0; alunos < 4; alunos++) {
			System.out.println("Digite nome do(a) aluno(a)");
			nome = sc.nextLine();
			System.out.println("Entre com a primeira nota");
			n1 = sc.nextFloat();
			System.out.println("Entre com a nota dois");
			n2 = sc.nextFloat();
			System.out.println("Entre com a nota tres");
			n3 = sc.nextFloat();
			System.out.println("Entre com a nota quatro");
			n4 = sc.nextFloat();
		}

	}

}
