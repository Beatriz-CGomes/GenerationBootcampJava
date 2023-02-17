package Aula3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá ler o tipo de operação a 
// ser realizada com base na tabela abaixo (número inteiro entre 1 e 3) e o valor a ser depositado ou sacado 
// (somente nas opções 2 e 3). Considere que um saque só pode ser realizado caso haja saldo suficiente. 
// Ao final de cada operação, exiba o novo Saldo na tela. A variável saldo (float), será inicializada com o
// valor de R$ 1000.00. Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int op;
		float saldo = 1000;
		float saque, depo;

		System.out.println("\tBem-vindo ao banco Gen - clique na opção que desejar");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Deposito");
		op = sc.nextInt();



		switch (op) {
		case 1:
			System.out.println("O saldo da sua conta é de " + saldo);
			break;
		case 2:
			System.out.println("Quanto voce deseja sacar? ");
			saque = sc.nextFloat();
			saldo -= saque;
			System.out.println("O valor atual da sua conta é de " + saldo);
			break;
		case 3:
			System.out.println("Quanto voce deseja depositar? ");
			depo = sc.nextFloat();
			saldo += depo;
			System.out.println("O valor atual da sua conta é de " + saldo);
			break;
		default:
			System.out.println("Opção Invalida");
			break;
		}

		sc.close();
	}

}
