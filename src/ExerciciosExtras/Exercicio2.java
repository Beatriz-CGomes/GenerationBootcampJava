package ExerciciosExtras;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		Scanner sc = new Scanner(System.in);

		int n1, n2;
		int par = 0;
		int impar = 0;

		System.out.println("Digite a quantidade de numeros a serem imprimidos");
		n2 = sc.nextInt();

		for (int i = 1; i <= n2; i++) {
			System.out.println("Digite um numero");
			n1 = sc.nextInt();
			if (n1 % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.println("Numeros pares " + par);
		System.out.println("Numeros pares " + impar);

		sc.close();
	}

}
