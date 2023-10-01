package Collections;

public class Pilha {

	private int tamanhoMaximo;
	private int[] pilha;
	private int topo;

	public Pilha(int s) {
		tamanhoMaximo = s;
		pilha = new int[s];
		topo = -1; // valor negativo para ter certeza que não terá nenhum dado no código
	}

	public void push(int item) {
		if (topo == tamanhoMaximo - 1) {
			System.out.println("A pilha está cheia, não consigo add mais nada");
		} else {
			topo++;
			pilha[topo] = item;
		}
	}

	public void pop() {
		if (topo == -1) {
			System.out.println("A pilha está vazia não tem nada para deletar");
		} else {
			System.out.println("Elemento retirado da pilha " + pilha[topo]);
			topo--;
		}
	}

	public int peek() {
		return pilha[topo];
	}

}
