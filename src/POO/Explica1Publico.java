package POO;

public class Explica1Publico extends Explicacao1 {

	public Explica1Publico() {
		super("Telefone público");
	}

	@Override
	public void toca(int numToques) {

		for (int i = 0; i < numToques; i++) {
			System.out.println("Piririm Piririm");
		}
	}

	@Override
	public void disca(String numero) {
		if (numero.charAt(0) == '9' || numero.charAt(0) == '8') {
			System.out.println("Este tipo de telefone não liga para celular");
		} else {
			System.out.println("\nDiscando: " + numero);
		}
	}
}
