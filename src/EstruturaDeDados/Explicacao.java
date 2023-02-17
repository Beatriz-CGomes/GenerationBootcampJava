package EstruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Explicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> fila = new LinkedList<Integer>();

		for (int i = 0; i <= 10; i++) {
			fila.add(i);
		}

		System.out.println("Elementos da fila: " + fila);

		System.out.println("Removendo elemento da fila: " + fila.remove(5));

		System.out.println("Depois de removido:  " + fila);

		System.out.println("Adicionando elementos na fila " + fila.add(11));

		System.out.println("Elementos da fila depois de adicionado: " + fila);

		System.out.println("Pegar o primeiro elemento da fila " + fila.peek());

		System.out.println("Pegar o tamanho da fila: " + fila.size());

		System.out.println("Verificar elementos da fila: " + fila.contains(8));

		System.out.println("Exbir e retirar o primeiro elemento da fila: " + fila.poll());

		Iterator<Integer> inter = fila.iterator(); // usando Iterator pq a Queue não permite o uso do hasNext

		while (inter.hasNext()) { // hasNext para percorrer todas as posições da lista
			System.out.println(inter.next()); // .next mostra toda a fila
		}

		System.out.println("Limpar a fila: ");
		fila.clear(); // limpar toda a fila

		System.out.println("Verificar se a fila está vazia " + fila.isEmpty()); // traz um verdade ou falso, dependendo
																				// da situação da fila.

		// fim
	}

}
