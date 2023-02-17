package Aula1;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		Double salarioB, AdicionalN, 
		SalarioL, HoraExtra, Desconto;
		
		
		System.out.println("Entra com nome do(a) funacionario(a)");
		nome = sc.nextLine();
		
		System.out.println("Entra com salario Bruto");
		salarioB = sc.nextDouble();
		
		System.out.println("Entra com adiconal noturno");
		AdicionalN = sc.nextDouble();
		
		System.out.println("Entra com horas extras");
		HoraExtra = sc.nextDouble();
		
		System.out.println("Entre com os descontos");
		Desconto = sc.nextDouble();
		
		
		SalarioL = salarioB + AdicionalN + (HoraExtra * 5) - Desconto;
		
		System.out.println(" O funcionario(a) " + nome + "tem o salário mensal de : " + SalarioL);
		
		
		
		
		
		
	}

}
 