package POO;

public class TesteFiguras {

	public static void main(String[] args) {

		Quadrado figi1 = new Quadrado(10, "Quadrado1");
		Retangulo figi2 = new Retangulo(12, 14, "Retangulo");

		System.out.println(figi1.getNome() + " : " + figi1.getDiagonal());
		System.out.println(figi2.getNome() + " : " + figi2.getDiagonal());
	}

}
