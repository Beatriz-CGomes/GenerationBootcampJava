package Aula2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double A, B, C, D;
		double R,S;

		System.out.println("Entre com valor A ");
		A = sc.nextDouble();

		System.out.println("Entre com valor B ");
		B = sc.nextDouble();

		System.out.println("Entre com valor C ");
		C = sc.nextDouble();

		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		
		D = (R + S) / 2;

	}

}
