package Aula4;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num, soma = 0;

		do {
			System.out.println("Digite um numero");
			num = sc.nextInt();
			if (num >= 0) {
				soma += num;
			}

		} while (num != 0);

		System.out.println("Total de numeros positivos " + soma);
		sc.close();
	}

}
