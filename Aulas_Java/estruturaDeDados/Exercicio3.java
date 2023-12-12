package EstruturaDeDados;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		Set<Integer> Lista = new HashSet<Integer>();
		int valor;

		for (int cont = 0; cont < 10; cont++) {
			System.out.println("\nAdicione um valor:");
			valor = leia.nextInt();
			Lista.add(valor);
		}

		Iterator<Integer> ordena = Lista.iterator();
		System.out.println("\nListar dados do set ordenados: ");
		while (ordena.hasNext()) {
			System.out.println("\n" + ordena.next());
		}

	}

}
