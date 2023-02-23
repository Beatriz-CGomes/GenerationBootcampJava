package POOExercicios1;

public class Cliente {

	private String nome;
	private int cpf;
	private String endereço;
	private int aniversario;
	private int telefone;

	// construtor
	public Cliente(String nome, int cpf, String endereço, int aniversario, int telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereço = endereço;
		this.aniversario = aniversario;
		this.telefone = telefone;
	}

	// get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	// Métodos Visualizar

	public void visualizar() {
		System.out.println("\nNome do cliente: " + this.nome);
		System.out.println("\nCPF do cliente: " + this.cpf);
		System.out.println("\nEndereço do cliente: " + this.endereço);
		System.out.println("\nAniversário do cliente: " + this.aniversario);
		System.out.println("\nTelefone do cliente: " + this.telefone);
	}

}
