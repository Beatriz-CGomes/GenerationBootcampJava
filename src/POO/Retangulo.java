package POO;

public class Retangulo extends BaseFigura implements Figuras {

	Retangulo(double lado1, double lado2, String nome) {
		super(lado1, lado2, nome);
		nomeClasse = "Retangulo";
	}

	public double getDiagonal() {
		return Math.sqrt(2) * lado1 * lado2;
	}
}
