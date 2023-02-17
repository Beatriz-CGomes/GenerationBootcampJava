package Aula2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		float a, b, c, d, e, f, x, y;

		System.out.println("Entre com valor de A : ");
		a = sc.nextFloat();

		System.out.println("Entre com valor de B : ");
		b = sc.nextFloat();

		System.out.println("Entre com valor de C : ");
		c = sc.nextFloat();

		System.out.println("Entre com valor de D : ");
		d = sc.nextFloat();

		System.out.println("Entre com valor de E : ");
		e = sc.nextFloat();

		System.out.println("Entre com valor de F : ");
		f = sc.nextFloat();

		x = c * e - b * f / (a * e - b * d);
		y = a * f - c * d / (a * e - b * d);
		
		
		System.out.println("Valor de X é " + x);
        System.out.println("Valor de y é " + y);
	}

}
