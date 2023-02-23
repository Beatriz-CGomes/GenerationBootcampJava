package POO;

public class Explica1Celular extends Explicacao1 {

	public Explica1Celular() {
		super("Número de telefone");
	}

	@Override // sobrescrevendo o metado da subclasse
	public void toca(int codigoToque) {

		switch (codigoToque) {
		case 1:
			System.out.println("tãtãranran tãtã");
			break;
		case 2:
			System.out.println("Blim blim blim");
			break;
		case 3:
			System.out.println("Parãrã Parãrã Parãrã");
			break;
		case 4:
			System.out.println("Pirim pirim pirim, alguém ligou pra mim!!");
			break;
		default:
			System.out.println("Chamada a cobrar");
			break;
		}
	}

	@Override
	public void disca(String nomeDoContato) {
		System.out.println("Quem é está ligando é: " + nomeDoContato);
	}

}
