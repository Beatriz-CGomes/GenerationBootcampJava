package Collections;

public class Fila {

	private int tamanhoMaximo;
	private int[] fila;
	private int inicio;
	private int fim;
	private int total;

	public Fila(int s) {
		tamanhoMaximo = s;
		fila = new int[s];
		inicio = 0;
		fim = -1;
		total = 0;
	}

	public int pegarInicio() {
		return fila[inicio];
	}

	public int pegarFim() {
		return fila[fim];
	}

	public boolean checarCheio() {
		return total == tamanhoMaximo;
	}

	public boolean checarVazia() {
		return total == 0;
	}

	public void enqueu(int item) {
		if (checarCheio()) {
			System.out.println("A fila está cheia, não consigo add mais nada");
		} else {
			fim++;
			fila[fim] = item;
			total++;
		}
	}

	public void denqueu(int item) {
		if (checarVazia()) {
			System.out.println("A fila está vazia, não temos nada para remover");
		} else {
			System.out.println("Item removido da fila  " + fila[inicio]);
			inicio++;
			total--;
		}
	}

}
