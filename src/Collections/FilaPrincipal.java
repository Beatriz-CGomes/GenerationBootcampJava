package Collections;

public class FilaPrincipal {

	public static void main(String[] args) {
		Fila fila = new Fila(3);

		fila.enqueu(10);
		System.out.println("Elemento adicionado na fila " + fila.pegarFim());

		fila.enqueu(20);
		System.out.println("Elemento adicionado na fila " + fila.pegarFim());

		fila.enqueu(30);
		System.out.println("Elemento adicionado na fila " + fila.pegarFim());

		fila.enqueu(40);
		//System.out.println("Elemento adicionado na pilha " + fila.pegarFim());

		fila.denqueu(3);

	}

}
