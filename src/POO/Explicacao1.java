package POO;

public abstract class Explicacao1 {

	private String tipo;

	abstract public void disca(String numero);

	abstract public void toca(int numeroToqueTelefone);

	public Explicacao1(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
