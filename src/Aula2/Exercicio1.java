package Aula2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e
		// dias e mostre-a expressa apenas em dias.
		
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int dia, mes, idade, soma;
		
		
		System.out.println("Digite sua idade");
		idade = sc.nextInt();
		
		System.out.println("Digite a quantidade de meses");
		mes = sc.nextInt();
		
		System.out.println("Digite a quantidade de dias");
		dia = sc.nextInt();
		
		
		soma = (idade *365) + (mes*30)+ dia;
		System.out.println("Você tem " + soma + " de vida" );
		
		

	}

}
