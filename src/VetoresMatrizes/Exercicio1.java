package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
//Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que 
// consiga pesquisar dados no vetor, onde o usuário irá digitar um número e o programa deve exibir na tela a 
// posição deste número no vetor. Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” 
// deve ser exibida na tela. Veja os exemplos abaixo:

		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		int x, pesquisa = 0, aux = -1;

		for (x = 0; x < num.length; x++) {
			System.out.println("Digite o numero " + "da posição  " + x);
			num[x] = sc.nextInt();
			
			
		} // até aqui entrando com valores da soma

		System.out.println("Digite o número que você deseja encontrar ");
		pesquisa = sc.nextInt();

		for (x = 0; x < num.length; x++) { // 
			if (pesquisa == num[x]) {
				aux = x;

			}
		}

		if (aux != -1) {
			System.out.println("O número está " + pesquisa + " localizado na posição " + aux);
		} else {
			System.out.println("Não foi encontrado " + pesquisa);
		}

		sc.close();
	}
}
