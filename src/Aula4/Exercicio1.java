package Aula4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.println("Digite o primeiro número do intervalo:");
		num1 = sc.nextInt();

		System.out.println("Digite o último número do intervalo:");
		num2 = sc.nextInt();

		for (int i = 0; i <= num2; i++) {
			if (num1 > num2) {
				System.out.println("intervalo é inválido");
			}
			if (num2 % 3 == 0 && num2 % 5 == 0) {
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Multiplos de 3 e 5 " + i);
			}
		}

		sc.close();
	}

}
