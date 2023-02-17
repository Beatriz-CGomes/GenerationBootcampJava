package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Explicacao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner sc = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList();

		do {

			System.out.println("-------------------------");
			System.out.println("1 - Deseja adicionar produtos ao estoque?");
			System.out.println("2 - Deseja remover produtos do estoque?");
			System.out.println("3 - Deseja atualizar ´produtos do estoque?");
			System.out.println("4 - Deseja mostra produtos do estoque?");
			System.out.println("0 - Deseja sair do sistema do estoque?");
			System.out.println("-------------------------");
			op = sc.nextInt();

			switch (op) {
			case 1:
				sc.nextLine();
				System.out.println("Digite o produto que deseja adicionar ao estoque");
				String produto = sc.nextLine();
				estoque.add(produto);
				break;
		
			case 2:
				sc.nextLine();
				System.out.println("Digite o produto que deseja remover do estoque");
				String produtor = sc.nextLine();
				if (estoque.contains(produtor)) {
					estoque.remove(produtor);
				} else {
					System.out.println("Produto inexistente");
				}
				break;
		
			case 3:
				sc.nextLine();
				System.out.println("Digite o produto que deseja atualizar do estoque");
				String verificar = sc.nextLine();
				System.out.println("Digite o nome do produto que entrará no lugar do " + verificar);
				String novo = sc.nextLine();
				if (estoque.contains(verificar)) {
					estoque.remove(verificar);
					estoque.add(novo);
				} else {
					System.out.println("Produto não existe");
				}
				break;
		
			case 4:
				System.out.println("Os produtos do estoque são ");
				System.out.println(estoque);
				break;
			
			case 0:
				System.out.println("Muito obrigada por utilizar nosso sistema!!");
				break;
		
			default:
				System.out.println("Opção invalida");
				break;
			}

		} while (op != 0);

		sc.close();

	}

}
