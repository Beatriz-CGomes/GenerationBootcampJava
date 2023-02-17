package Aula3;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples.
//O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código da operação
//matemática (número inteiro de 1 a 4). A seguir, mostre na tela o resultado da operação entre os 2 números.
// Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!

		Scanner sc = new Scanner(System.in);

		float num1, num2, soma;
		int op;

		System.out.println("Digite o primeiro numero");
		num1 = sc.nextFloat();

		System.out.println("Digite o segundo numero");
		num2 = sc.nextFloat();

		System.out.println("\n\t -- Com base na tabela qual operação matemática você deseja realizar -- ");
		System.out.println("1 - Soma ");
		System.out.println("2 - Subtração ");
		System.out.println("3 - Divisão ");
		System.out.println("4 - Multiplicação ");
		op = sc.nextInt();

		switch (op) {
		case 1:
			soma = num1 + num2;
			System.out.println("O resultado da operação " + soma);
			break;
		case 2:
			soma = num1 - num2;
			System.out.println("O resultado da operação " + soma);
			break;
		case 3:
			soma = num1 * num2;
			System.out.println("O resultado da operação " + soma);
			break;
		case 4:
			soma = num1 / num2;
			System.out.println("O resultado da operação " + soma);
			break;
		default:
			System.out.println("Operação invalida");
			break;

		}

		sc.close();
	}

}
