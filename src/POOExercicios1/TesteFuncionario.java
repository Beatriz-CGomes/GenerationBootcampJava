package POOExercicios1;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario fun1 = new Funcionario("Poliana", 123, 4000.0f, 12122012, 30);
		Funcionario fun2 = new Funcionario("Beatriz", 124, 4500.0f, 13122011, 28);

		fun1.visualizar();
		fun2.visualizar();

	}
}
