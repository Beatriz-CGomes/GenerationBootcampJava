package ExerciciosExtras;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Escrever um programa que receba vários números inteiros no teclado. 
		// E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)
		
	Scanner sc = new Scanner(System.in);	
	
	int numero, soma = 0, quantidade = 0, somaTotal = 0;
	
	do {
		System.out.println("Digite um numero ");
		numero = sc.nextInt();
		if(numero % 3 == 0) {
			quantidade++;
			soma =+ numero;
		}
	} while( numero != 0);
	
	somaTotal = soma/quantidade;
	System.out.println("Multiplos de 3 " + somaTotal);
	sc.close();
	
	}

}
