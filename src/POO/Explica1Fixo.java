package POO;

public class Explica1Fixo extends Explicacao1 {

	public Explica1Fixo() {
		super("Telefone Fixo");
	}

	@Override
	public void toca(int numToques) {
		for (int i = 0; i < numToques; i++) {
			System.out.println("Triiiiiiim Triiiiim Triiiim");
		}
	}

	@Override
	public void disca(String numero) {
		System.out.println("\nDiscando: " + numero);
	}

} // end
