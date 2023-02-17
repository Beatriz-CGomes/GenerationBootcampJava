package Aula3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características de um 
// tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda para a direita		
		Scanner sc = new Scanner(System.in);

		System.out.println("\tDigite o tipo de animal que você deseja ");
		String palavra1 = sc.next();
		String palavra2 = sc.next();
		String palavra3 = sc.next();

		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("É uma aguia");
				} else {
					System.out.println("é uma pomba");
				}
			} else {

				if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("É um ser humano");
				} else {
					System.out.println("É uma vaca");
				}
			}
		} else {
			if (palavra2.equalsIgnoreCase("inseto")) {
				if (palavra3.equalsIgnoreCase("hematofogo")) {
					System.out.println("é uma pulga");
				} else {
					System.out.println("É uma largata");
				}
			} else {
				if (palavra3.equalsIgnoreCase("hematofogo")) {
					System.out.println("é uma sanguesuga");
				} else {
					System.out.println("é uma minhoca");
				}
			}
		}

		sc.close();
	}

}
