package ExerciciosExtras;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos 
// de uma região. Para tanto, a cada uma das pessoas era perguntado: idade, identificação de gênero 
//(1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa 
// e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
///calcule e mostre: (WHILE)

		Scanner sc = new Scanner(System.in);
		int idade, sexo, op;
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, pessoasNervosasIdo = 0,
				pessoasCalmasMenores = 0, limitePessoas = 0;

		System.out.println("Pesquisa de caracteristicas psicologicas");

		while (limitePessoas <= 149) {
			System.out.println("Digite a sua idade");
			idade = sc.nextInt();

			System.out.println("Digite sua identificação de genero");
			System.out.println("1 - Feminino ");
			System.out.println("2 - Masculino ");
			System.out.println("3 - Outros");
			sexo = sc.nextInt();

			System.out.println("Escolha uma das opções abaixo ");
			System.out.println("1 - Calma ");
			System.out.println("2 - Nervosa ");
			System.out.println("3 - Agressiva ");
			op = sc.nextInt();

			if (op == 1) {
				pessoasCalmas++;
			}
			if (sexo == 1 && op == 2) {
				mulheresNervosas++;
			}
			if (sexo == 2 && op == 3) {
				homensAgressivos++;
			}
			if (op == 2 && idade > 40) {
				pessoasNervosasIdo++;
			}
			if (op == 1 && idade < 18) {
				pessoasCalmasMenores++;
			} limitePessoas++;
		}
		System.out.println("Total de pessoas calmas " + pessoasCalmas);
		System.out.println("Total de mulheres Nervosas " + mulheresNervosas);
		System.out.println("Total de homens agressivos " + homensAgressivos);
		System.out.println("Total de pessoas nervosas acima de 40 anos " + pessoasNervosasIdo);
		System.out.println("Total de pessoas calmas menor de 18 anos " + pessoasCalmasMenores);

		sc.close();

	}

}
