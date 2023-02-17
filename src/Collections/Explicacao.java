package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Explicacao {

	public static void main(String[] args) {

		List<Integer> minhaLista = new ArrayList<Integer>();

		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(3);
		minhaLista.add(12);
		minhaLista.add(22);

		for (Integer listaElementos : minhaLista) {

			System.out.println(listaElementos);
		}

		System.out.println("Removendo um elemento da lista");
		System.out.println();

		minhaLista.remove(2);

		for (Integer listaElementos : minhaLista) {

			System.out.println(listaElementos);
		}

		System.out.println();

		for (int i = 0; i < minhaLista.size(); i++) {
			System.out.println("Elemento: " + minhaLista.get(i));
		}

		Collections.sort(minhaLista);
		System.out.println("Depois de ordenado vai ficar assim -- ");
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(4);
		meuSet.add(3);
		meuSet.add(12);
		meuSet.add(15);
		meuSet.add(17);
		
	Iterator<Integer> iMeuSet = meuSet.iterator();
		
	while(iMeuSet.hasNext()) {
		System.out.println(iMeuSet.next());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
