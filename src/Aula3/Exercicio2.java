package Aula3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo. Veja os exemplos abaixo:

		Scanner sc = new Scanner(System.in);

		int numero;
		System.out.println("Digite um numero");
		numero = sc.nextInt();

		if (numero % 2 == 0 && numero >= 0) {
			System.out.println("Número é par e positivo");
		} else if (numero % 2 != 0 && numero > 0) {
			System.out.println("Número é impar e positivo");
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("Número é par e negativo");
		} else if (numero % 2 != 0 && numero < 0) {
			System.out.println("Número é impar e negativo");
		} else {
			System.out.println("opções invalidas ");
		}

		sc.close();
	}
}
