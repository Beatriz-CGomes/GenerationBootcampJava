package Aula1;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		Double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite o nome do Aluno(a) ");
	    nome = sc.next();
		
		System.out.println("\nDigite a primeira  nota: ");
		nota1 = sc.nextDouble();
		
		System.out.println("\nDigite a segunda  nota: ");
		nota2 = sc.nextDouble();
		
		System.out.println("\nDigite a terceira nota: ");
		nota3 = sc.nextDouble();
		
		System.out.println("\nDigite a quarta nota: ");
		nota4 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média final do aluno(a) " + nome + " é de: " + media);
		
		
		

	}

}
