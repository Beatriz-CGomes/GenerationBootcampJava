package POOExercicios1;

public class Funcionario {

	private String nome;
	private int matricula;
	private float salario;
	private int dataInicio;
	private int idade;

	public Funcionario(String nome, int matricula, float salario, int dataInicio, int idade) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.dataInicio = dataInicio;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(int dataInicio) {
		this.dataInicio = dataInicio;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void visualizar() {
		System.out.println("\nO nome do funcionário: " + this.getNome());
		System.out.println("A matricula do funcionário: " + this.getMatricula());
		System.out.println("\nO salario do funcionário: " + this.getSalario());
		System.out.println("A data admissional " + this.getDataInicio());
		System.out.println("A idade do funcionário " + this.idade);
	}

}
