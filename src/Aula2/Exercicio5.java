package Aula2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		double peso1 = 2;
		double peso2 = 3;
		double peso3 = 5;
		
		System.out.println("Entra com a primeira nota ");
		nota1 = sc.nextDouble();
		
		System.out.println("Entra com a segunda nota ");
		nota2 = sc.nextDouble();
		
		System.out.println("Entra com a terceira nota ");
		nota3 = sc.nextDouble();
		
		media = ((nota1 * peso1)+(nota2 * peso2)+(nota3 * peso3))/10;
		
		System.out.println("A media do aluno(a) é: " + media);

	}

}
