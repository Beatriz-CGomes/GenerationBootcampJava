package POOExercicios1;

public class TesteProduto {

	public static void main(String[] args) {

		Produto product1 = new Produto("Fifa", "Esporte", 218.9f, "Novo", "X-box");
		Produto product2 = new Produto("Homem Aranha", "Ação", 300.0f, "Novo", "PlayStation 5");

		product1.Visualizar();
		product2.Visualizar();
	}

}
