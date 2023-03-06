package Aula1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int B, A, SOMA;

		System.out.println("Valor para A: ");
		A = sc.nextInt();

		System.out.println("Valor para B:");
		B = sc.nextInt();

		SOMA = A + B;

		System.out.println(SOMA);
		sc.close();
	}

}
