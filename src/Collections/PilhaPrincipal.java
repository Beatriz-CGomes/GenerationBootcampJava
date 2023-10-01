package Collections;

public class PilhaPrincipal {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(3);

		pilha.push(10);
		System.out.println("Elemento adicionado na pilha " + pilha.peek());

		pilha.push(20);
		System.out.println("Elemento adicionado na pilha " + pilha.peek());

		pilha.push(30);
		System.out.println("Elemento adicionado na pilha " + pilha.peek());

		pilha.push(40);
		System.out.println("Elemento adicionado na pilha " + pilha.peek());

		pilha.pop();
	}

}
