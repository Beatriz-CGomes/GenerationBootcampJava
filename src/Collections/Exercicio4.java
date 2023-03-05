package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();

		System.out.println("Quantos números serão cadastrados ? ");
		int cad = sc.nextInt();

		for (int i = 0; i < cad; i++) {
			System.out.println("Digite o número que copõem o seu set: " + (i + 1) + " º ");
			int numS = sc.nextInt();
			numeros.add(numS);
		}

		System.out.println("Digite o número que deseja encontrar");
		int n = sc.nextInt();

		if (numeros.contains(n)) {
			System.out.println("O número " + n + " foi encontrado");
		} else {
			System.out.println("O número " + n + " não foi encontrado");
		}

		sc.close();
	}

}
