package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		int soma = 0;
		String impares = "", pares = "";

		// Entrada e som
		for (int i = 0; i < num.length; i++) {
			System.out.println("Entre com os numeros");
			num[i] = sc.nextInt();
			soma += num[i];
		}

		// Impares
		for (int i = 0; i < num.length; i++) {
			if (i % 2 != 0) {
				impares += num[i] + " ";
			}

			// Pares
			if (num[i] % 2 == 0) {
				pares += num[i] + " ";

			}
		}

		// media

		int media = 0;

		for (int i = 0; i < num.length; i++) {
			media += (soma) / 10;
		}

		System.out.println("Número das indices impares " + impares);
		System.out.println("Elementos pares: " + pares);
		System.out.println("A soma total " + soma);
		System.out.printf("A média: %.2f" , media);

		sc.close();

	}

}
