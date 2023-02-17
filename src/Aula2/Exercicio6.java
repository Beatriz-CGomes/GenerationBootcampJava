package Aula2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y1, y2, d;
		
		System.out.println("Qual valor de x1");
		x1 = sc.nextDouble();
		
		System.out.println("Qual valor de x2");
		x2 = sc.nextDouble();
		
		System.out.println("Qual valor de y1");
		y1 = sc.nextDouble();
		
		System.out.println("Qual valor de y2");
		y2 = sc.nextDouble();
		
		d = ((x2-x1)*2)+((y2-y1)*2);
		
		System.out.println("O valor da distância é " + d);
	}

}
