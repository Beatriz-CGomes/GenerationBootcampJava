package Aula4;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num, media = 0, quantidade = 0, total = 0;

		do {
			System.out.println("Digite um numero");
			num = sc.nextInt();
			if (num % 3 == 0) {
				quantidade++;
				media = +num;
			}
		} while (num != 0);

		total = media / quantidade;
		System.out.println("Total de numeros multiplos de três " + total);

		sc.close();

	}
}
