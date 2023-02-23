package POO;

public class ExplicacaoTesteTelefone {

	public static void main(String[] args) {

		Explica1Celular celular = new Explica1Celular();
		Explica1Fixo fixo = new Explica1Fixo();
		Explica1Publico publico = new Explica1Publico();

		Explicacao1 explicacao1 = null;

		int n = (int) (Math.random() * 3.0);

		System.out.println("\nO número escolhido foi: " + n);

		switch (n) {
		case 0:
			explicacao1 = celular;
			break;
		case 1:
			explicacao1 = fixo;
			break;
		case 2:
			explicacao1 = publico;
			break;
		default:
			System.out.println("Invalido");
		}

		if(explicacao1 != null) {
			explicacao1.disca("923224665");
			explicacao1.toca(2);
		}
	}

}
