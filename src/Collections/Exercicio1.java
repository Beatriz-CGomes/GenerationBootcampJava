package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ArrayList<String> Cores = new ArrayList<String>();
		String corAd;

		for (int i = 0; i <= 5; i++) {
			System.out.println(" Digite a cor que você deseja inserir ");
			corAd = sc.nextLine();
			Cores.add(corAd);
		}

		System.out.println("Listar todas as cores: " + Cores);
		Collections.sort(Cores);
		System.out.println("Order as cores " + Cores);
		sc.close();
	}

}
