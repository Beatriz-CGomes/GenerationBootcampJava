package POOExercicios1;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curse1 = new Curso("Inglês ", "Rua das conquistas ", 10, "Sábado ", 120.0f);
		Curso curse2 = new Curso("Francês ", "Rua das conquistas ", 11, "Sexta ", 140.0f);
		
		curse1.visualizar();
		curse2.visualizar();
	}

}
