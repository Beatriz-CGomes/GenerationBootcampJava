package POOExercicios1;

public class Ingressos {

	private float valorIngresso;
	private String nomeFilme;
	private int horarioFilme;
	private String genero;
	private int assento;

	public Ingressos(float valorIngresso, String nomeFilme, int horarioFilme, String genero, int assento) {
		super();
		this.valorIngresso = valorIngresso;
		this.nomeFilme = nomeFilme;
		this.horarioFilme = horarioFilme;
		this.genero = genero;
		this.assento = assento;
	}

	public float getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(float valorIngresso) {
		this.valorIngresso = valorIngresso;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public int getHorarioFilme() {
		return horarioFilme;
	}

	public void setHorarioFilme(int horarioFilme) {
		this.horarioFilme = horarioFilme;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}

	public void Visualizar() {
		System.out.println("O valor do ingresso: " + this.getValorIngresso());
		System.out.println("O nome do filme: " + this.getNomeFilme());
		System.out.println("O horário do filme: " + this.horarioFilme);
		System.out.println("O genero do filme " + this.getGenero());
		System.out.println("O assento do filme " + this.getAssento());
	}

}
