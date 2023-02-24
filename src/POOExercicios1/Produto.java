package POOExercicios1;

public class Produto {

	private String nome;
	private String genero;
	private float valor;
	private String estado;
	private String tipoVideoGame;

	// Construtor
	public Produto(String nome, String genero, float valor, String estado, String tipoVideoGame) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.valor = valor;
		this.estado = estado;
		this.tipoVideoGame = tipoVideoGame;
	}

	// Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipoVideoGame() {
		return tipoVideoGame;
	}

	public void setTipoVideoGame(String tipoVideoGame) {
		this.tipoVideoGame = tipoVideoGame;
	}

	public void Visualizar() {
		System.out.println("O nome do jogo: " + this.getNome());
		System.out.println("O genero do jogo: " + this.getGenero());
		System.out.println("O valor do jogo: " + this.getValor());
		System.out.println("O estado que o jogo se encontra é: " + this.getEstado());
		System.out.println("O tipo de mídia: " + this.getTipoVideoGame());
	}

}
