package POOExercicios1;

public class TesteFarmacia {

	public static void main(String[] args) {
		Farmacia farma1 = new Farmacia("Dipirona", 10.0f, 10112022, "farmacia@hotmail.com", "Rua das flores");
		Farmacia farma2 = new Farmacia("Neusadina", 40.0f, 11122012, "farmacia@gmail.com", "Rua das cavernas");

		farma1.visualizar();
		farma2.visualizar();
	}

}
