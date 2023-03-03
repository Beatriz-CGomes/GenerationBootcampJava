package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {

		Stack<String> livrosPilhas = new Stack<String>();

		Scanner sc = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("-- TABELA DE LIVROS --- ");
			System.out.println("1 - Adicionar novo livro na pilha");
			System.out.println("2 - Listar todos os livros da Pilha ");
			System.out.println("3 - Retirar um livro da pilha");
			System.out.println("0 - O programa deve ser finalizado");
			opcao = sc.nextInt();

			if (opcao == 1) {
				sc.nextLine();
				System.out.println("Digite o nome do livro que deseja inserir");
				String livronome = sc.nextLine();
				livrosPilhas.push(livronome);
			}

			else if (opcao == 2) {
				sc.nextLine();
				System.out.println("Lista de todos os livros que estão na Pilha " + livrosPilhas);
			}

			else if (opcao == 3) {
				sc.nextLine();

			} else if (livrosPilhas.isEmpty()) {
				System.out.println("A pilah está vazia");
			} else {
				livrosPilhas.pop();
				System.out.println("Lista depois que retirei livros da pilha " + livrosPilhas);
			}

			if (opcao == 4) {
				sc.nextLine();
				System.out.println("O programa da pilha de livros foi finalizado");
			} else {
				System.out.println("Opção invalida!! ");
			}

		} while (opcao != 0);

		sc.close();

	}

}
