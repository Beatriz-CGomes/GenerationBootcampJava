package Aula4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e 
// mostre na tela quantos números são pares e quantos número são ímpares.
// Veja o exemplo abaixo:

		Scanner sc = new Scanner(System.in);

		int num;
		int pares = 0;
		int impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println(" Digite " + i + " º número");
			num = sc.nextInt();
			if (num % 2 == 0) {
				pares++;
			} else if (num % 2 != 0) {
				impar++;
			}
		}

		System.out.println("Total de números pares " + pares);
		System.out.println("Total de números pares " + impar);
		sc.close();
	}

}
