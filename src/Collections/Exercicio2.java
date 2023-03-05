package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Digite o número que deseja encontrar");
		int n = sc.nextInt();

		int verificacao = numeros.indexOf(n);

		if (verificacao != -1) {
			System.out.println("O número " + n + "está localizado na posicação " + verificacao);
		} else {
			System.out.println(" Número não encontrado ");
		}

		sc.close();
	}

}
