package ExerciciosExtras;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crie um programa que leia um número do teclado até que encontre um número
		// igual a zero.
// No final, mostre a soma dos números digitados.(DO...WHILE)

		Scanner sc = new Scanner(System.in);
		int numero, soma = 0;
		do {
			System.out.println("Digite um numero ");
			numero = sc.nextInt();
			soma += numero;
		} while (numero != 0);

		System.out.println("Total da soma dos numeros " + soma);

		sc.close();
	}

}
