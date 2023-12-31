package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// adicionando valores no ArrayList
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		// Lendo o número digitado pelo usuario
		System.out.println("\nDigite o número que você deseja encontrar: ");
		int n = leia.nextInt();

		// verificando a posição
		int posicao = numeros.indexOf(n);

		if (posicao != -1) {
			System.out.printf("O número %d está localizado na posição %d", n, posicao);
		} else {
			System.out.printf("\nO número %d não foi encontrado!!!", n);
		}

	}

}
