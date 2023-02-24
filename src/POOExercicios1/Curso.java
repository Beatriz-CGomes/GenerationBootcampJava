package POOExercicios1;

public class Curso {

	private String idiomas;
	private String endereço;
	private int horario;
	private String diasSemana;
	private float precoMensal;

	public Curso(String idiomas, String endereço, int horario, String diasSemana, float precoMensal) {
		super();
		this.idiomas = idiomas;
		this.endereço = endereço;
		this.horario = horario;
		this.diasSemana = diasSemana;
		this.precoMensal = precoMensal;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public String getDiasSemana() {
		return diasSemana;
	}

	public void setDiasSemana(String diasSemana) {
		this.diasSemana = diasSemana;
	}

	public float getPrecoMensal() {
		return precoMensal;
	}

	public void setPrecoMensal(float precoMensal) {
		this.precoMensal = precoMensal;
	}

	public void visualizar() {
		System.out.println("\nDigite seu curso: " + this.getIdiomas());
		System.out.println("\nO endereço do curso: " + this.getEndereço());
		System.out.println("\nO horario do curso " + this.getHorario());
		System.out.println("\nDia da semana do curso " + this.getDiasSemana());
		System.out.println("\nO valor mensal do curso " + this.getPrecoMensal());
	}

}
