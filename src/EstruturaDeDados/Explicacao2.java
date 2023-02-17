package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Explicacao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pilha o ultimo que entra é o primeiro que sai
		Scanner sc = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();
		String nome;

		pilha.push("Prato Verde"); // push adicionar empurrar
		pilha.push("Prato Branco");
		pilha.push("Prato Azul");
		pilha.push("Prato Amarelo");

		System.out.println("Digie a pilha que deseja inserir");
		nome = sc.next();

		for (int i = 0; i <= 9; i++) {
			pilha.add(nome);

		}

		System.out.println("Retirar elemento da pilha " + pilha.pop());

		System.out.println("Elemento do topo da pilha  " + pilha.peek());

		System.out.println("Adicionar elemento na pilha " + pilha.push("Prato Roxo"));

		// fim
	}

}
