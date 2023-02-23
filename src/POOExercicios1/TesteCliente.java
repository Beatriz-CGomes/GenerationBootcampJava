package POOExercicios1;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Poliana", 456989090, " Rua das flores n° 10 ", 12121994, 9888888);
		Cliente cliente2 = new Cliente("Mariana", 349089090, " Rua Cachoeira n°11 ", 123232132, 232132321);

		cliente1.visualizar();
		cliente2.visualizar();

	}

}
