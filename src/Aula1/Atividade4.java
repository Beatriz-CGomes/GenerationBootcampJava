package Aula1;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, n4, calculo;

		System.out.println("Entre com primeiro valor ");
		n1 = sc.nextInt();

		System.out.println("Entre com o segundo valor ");
		n2 = sc.nextInt();

		System.out.println("Entre com o terceiro valor ");
		n3 = sc.nextInt();

		System.out.println("Entre com o quarto valor");
		n4 = sc.nextInt();
		
		calculo = (n1 * n2) - (n3 * n4);

		System.out.println("A difreneça do produto n1/n2 e n3/n4 é : " + calculo);
		
	}

}
