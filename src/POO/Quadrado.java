package POO;

public class Quadrado extends BaseFigura implements Figuras {

	Quadrado(double lado, String nome) {
		super(lado, lado, nome);
		nomeClasse = "Quadrado";
	}

	public double getDiagonal() {
		return Math.sqrt(2) * lado1;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

} // fim
