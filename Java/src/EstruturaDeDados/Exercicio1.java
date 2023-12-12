package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String produto;

		Scanner leia = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList();

		// obs: cont começa com 0 e vai até 4, dando um total de 5 cores, por isso
		// usamos o sinal de < e não <=

		for (int cont = 0; cont < 5; cont++) {
			System.out.println("\nAdicione uma cor:");
			produto = leia.nextLine();
			estoque.add(produto);
		}

		System.out.println("\nListar todas as cores: ");
		System.out.println(estoque);

		System.out.println("\nListar todas as cores ordenadas: ");
		Collections.sort(estoque);
		System.out.println(estoque);

	}
}
	



		

	
