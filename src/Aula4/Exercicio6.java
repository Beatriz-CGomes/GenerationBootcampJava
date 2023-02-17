package Aula4;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num;
		int quant = 0;
		int soma;
		int p = 0;

		do {
			System.out.println("Digite um numero");
			num = sc.nextInt();

			if (num % 3 == 0) {
				p += num;
				quant++;
			}
		}

		while (num != 0);
		soma = p / quant;

		System.out.println("A media de todos os numeros multiplos de 3 é " + soma);

		sc.close();
	}

}
