package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int op;

		Queue<String> filaBanco = new LinkedList<String>();
		System.out.println(" ----Tabela do Cliente do Banco Bea ---- ");
		do {

			System.out.println("\n1 - Adicionar um novo cliente inserindo o nome");
			System.out.println("\n2 -  Listar todos os Clientes na fila");
			System.out.println("\n3 -  Chamar (retirar) uma pessoa da fila ");
			System.out.println("\n0 -  O programa deve ser finalizado");
			System.out.println("-------------------------");
			System.out.println("Por favor, escolha uma das opçõe!");
			op = sc.nextInt();

			switch (op) {
			case 1:
				sc.nextLine();
				System.out.println("\nInsira o nome do novo cliente");
				String nome = sc.nextLine();
				filaBanco.add(nome);
				break;

			case 2:
				sc.nextLine();
				System.out.println("\nTodos os clientes que estão na fila " + filaBanco);
				break;

			case 3:

				if (filaBanco.isEmpty()) {
					System.out.println("A lista está vazia ");
				} else {
					filaBanco.poll();
					System.out.println("\nLista depois de retirar uma pessoa  " + filaBanco);
				}

				break;

			case 0:
				System.out.println("\nMuito obrigada por confiar no nosso Banco !!");
				break;

			default:
				System.out.println("Opção invalida");
				break;
			} // final do

		} while (op != 0);
		sc.close();
	}

}
