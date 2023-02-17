package Aula1;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		//Exercicio 1
		
		String nome;
		float Salario, abono;
		float novoSalario;

		System.out.println("Digite o nome do funcionario(a) ");
		nome = sc.next();

		System.out.println("\nDigite o salario:  ");
		Salario = sc.nextFloat();

		System.out.println("\nDigite o abono salarial: ");
		abono = sc.nextFloat();

		novoSalario = Salario + abono;

		System.out.println("O novo salario  do(a) funcionario(a) " + nome + "é de: " + novoSalario);

		System.out.println(
				"---------------------------------------------------------------------------------------------");

		//Exercicio 2
		String name;
		float nota1, nota2, nota3, nota4, media;

		System.out.println("Digite o nome do Aluno(a) ");
		name = sc.next();

		System.out.println("\nDigite a primeira  nota: ");
		nota1 = sc.nextFloat();

		System.out.println("\nDigite a segunda  nota: ");
		nota2 = sc.nextFloat();

		System.out.println("\nDigite a terceira nota: ");
		nota3 = sc.nextFloat();

		System.out.println("\nDigite a quarta nota: ");
		nota4 = sc.nextFloat();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A média final do aluno(a) " + nome + " é de: " + media);
		
		System.out.println(
				"---------------------------------------------------------------------------------------------");

		
		//Exercicio 3
		
		String nomes;
		float salarioB, AdicionalN, 
		SalarioL, HoraExtra, Desconto;
		
		
		System.out.println("Entra com nome do(a) funacionario(a)");
		nomes = sc.nextLine();
		
		System.out.println("Entra com salario Bruto");
		salarioB = sc.nextFloat();
		
		System.out.println("Entra com adiconal noturno");
		AdicionalN = sc.nextFloat();
		
		System.out.println("Entra com horas extras");
		HoraExtra = sc.nextFloat();
		
		System.out.println("Entre com os descontos");
		Desconto = sc.nextFloat();
		
		
		SalarioL = salarioB + AdicionalN + (HoraExtra * 5) - Desconto;
		
		System.out.println(" O funcionario(a) " + nome + "tem o salário mensal de : " + SalarioL);
		
		
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		
		//Exercicio 4
		
		int n1, n2, n3, n4, calculo;

		System.out.println("Entre com primeiro valor ");
		n1 = sc.nextInt();

		System.out.println("Entre com o segundo valor ");
		n2 = sc.nextInt();

		System.out.println("Entre com o terceiro valor ");
		n3 = sc.nextInt();

		System.out.println("Entre com o quarto valor");
		n4 = sc.nextInt();
		
		calculo = (n1 * n2) - (n3 * n4);

		System.out.println("A difreneça do produto n1/n2 e n3/n4 é : " + calculo);

	}

}
