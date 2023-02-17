package Aula2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int ano, mes, dia, dias;
		
		System.out.println("Digite a idade em dias");
		dias = sc.nextInt();
		
		ano = (dias /365);
		mes = (dias % 365)/30;
		dia = (dias % 365)%30;
		
		System.out.println("A idade em anos " + ano + " anos " + mes +  " meses " +  " e dias é  " +  dia);
		
		
	}

}
