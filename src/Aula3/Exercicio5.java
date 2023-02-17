package Aula3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro 
//de 1 a 6) e a quantidade comprada deste item (número inteiro). A seguir, mostre na tela o valor total 
		// da conta e o nome do produto que foi comprado.

		Scanner sc = new Scanner(System.in);

		int quantidade;
		int pedido, soma;

		System.out.println("\tLanchonete da Gen");
		System.out.println(" Seleciona o seu pedido ");
		System.out.println("\n1 - Cachorro Quente R$ 10,00 ");
		System.out.println("\n2 - X-Salada R$ 15,00 ");
		System.out.println("\n3 - X-Bacon R$18,00 ");
		System.out.println("\n4 - Bauro R$12,00 ");
		System.out.println("\n5 - Refrigerante R$ 8,00");
		System.out.println("\n6 -  Suco R$ 13,00");
		pedido = sc.nextInt();

		System.out.println("Entre com a quantidade");
		quantidade = sc.nextInt();

		switch (pedido) {
		case 1:
			soma = quantidade * 10;
			System.out.println("Cachorro Quente " + " R$ " + soma );
			break;
		case 2:
			soma = quantidade * 15;
			System.out.println("X-Salada " + " R$ " + soma);
			break;
		case 3:
			soma = quantidade * 18;
			System.out.println("X-Bacon" + " R$ " + soma);
			break;
		case 4:
			soma = quantidade * 12;
			System.out.println("Bauro " + " R$ " + soma );
			break;
		case 5:
			soma = quantidade * 8;
			System.out.println("Refrigerante" + " R$ " + soma);
			break;
		case 6:
			soma = quantidade * 13;
			System.out.println("Suco" + " R$ " + soma );
			break;
		default:
			System.out.println("Pedido invalido");
			break;
		}
		sc.close();
	}
}
