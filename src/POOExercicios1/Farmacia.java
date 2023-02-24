package POOExercicios1;

public class Farmacia {

	private String nome;
	private float preco;
	private int dataValidade;
	private String emailFarmacia;
	private String endereço;

	public Farmacia(String nome, float preco, int dataValidade, String emailFarmacia, String endereço) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.emailFarmacia = emailFarmacia;
		this.endereço = endereço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(int dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getEmailFarmacia() {
		return emailFarmacia;
	}

	public void setEmailFarmacia(String emailFarmacia) {
		this.emailFarmacia = emailFarmacia;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public void visualizar() {
		System.out.println("O nome da farmacia: " + this.getNome());
		System.out.println("O preço de um remedio " + this.getPreco());
		System.out.println("A validade de um remedio " + this.getDataValidade());
		System.out.println("O email da farmacia " + this.getEmailFarmacia());
		System.out.println("O endereço da farmacia " + this.getEndereço());
	}

}
