package Aula3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String), 
//o Código do Cargo do Colaborador (número inteiro de 1 a 6) e 
//o Salário (número float). A seguir, mostre na tela o Nome do Colaborador, 
// o Cargo e o novo Salário reajustado.

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String nome;
		int cargo;
		float salario, p;

		System.out.println("Digite o nome do colaborador");
		nome = sc.nextLine();

		System.out.println("\n\t-- Tabela de reajuste salarial -- ");
		System.out.println("\n1 - Gerente - 10% ");
		System.out.println("\n2 - Vendedor - 7%");
		System.out.println("\n3 - Supervisor -  9% ");
		System.out.println("\n4 - Motorista - 6%");
		System.out.println("\n5 - Estoquista - 5%");
		System.out.println("\n6 - Tecnico de TI - 8% ");
		System.out.println("Entra com código do cargo");
		cargo = sc.nextInt();

		System.out.println("Digite o salario do colaborador");
		salario = sc.nextFloat();

		switch (cargo) {
		case 1:
			p = (salario * 10) / 100 + salario;
			System.out.println(nome + " Gerente " + p);
			break;
		case 2:
			p = (salario * 7) / 100 + salario;
			System.out.println(nome + " Vendedor " + p);
			break;
		case 3:
			p = (salario * 9) / 100 + salario;
			System.out.println(nome + " Supervisor " + p);
			break;
		case 4:
			p = (salario * 6) / 100 + salario;
			System.out.println(nome + " Motorista " + p);
			break;
		case 5:
			p = (salario * 5) / 100 + salario;
			System.out.println(nome + " Estoquista " + p);
			break;
		case 6:
			p = (salario * 6) / 100 + salario;
			System.out.println(nome + " Tecnico de TI " + p);
			break;
		default:
			System.out.println("Cargo invalido para reajuste salarial");
			break;

		}

		sc.close();

	}

}
