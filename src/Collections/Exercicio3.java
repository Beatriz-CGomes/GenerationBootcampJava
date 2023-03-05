package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();

		System.out.println("Quantos números você vai cadastrar? ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("Digite os números que compõem o seu set: " + (i + 1) + " ° ");
			int n = sc.nextInt();
			numeros.add(n); 
		}

		Iterator<Integer> iNumeros = numeros.iterator(); 

		System.out.println("Listando todos os set: ");
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

		sc.close();

	}

}
