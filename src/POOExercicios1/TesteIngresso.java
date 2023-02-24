package POOExercicios1;

public class TesteIngresso {

	public static void main(String[] args) {
		Ingressos ingressos1 = new Ingressos(33.0f, "Titãs", 1010, "Ação", 1);
		Ingressos ingressos2 = new Ingressos(35.0f, "Batman", 1130, "Aventura", 2);

		ingressos1.Visualizar();
		ingressos2.Visualizar();
	}

}
