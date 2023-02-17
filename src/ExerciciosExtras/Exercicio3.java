package ExerciciosExtras;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
// Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

		Scanner sc = new Scanner(System.in);

		int idade;
		int idadeMenor = 0, idadeMaior = 0;

		System.out.println("Digite a sua idade");
		idade = sc.nextInt();

		while (idade >= 0) {
			if (idade < 21) {
				idadeMenor++;
			
			} if (idade > 50) {
				idadeMaior++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos " + idadeMenor);
		System.out.println("Total de pessoas com mais de 50 anos " + idadeMaior);

		sc.close();

	}

}
