package Atividades_bloco1;

import java.util.Scanner;

public class diferenca {

	public static void main(String[] args) {
		// Exercise 4
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Entre com N1: ");
		float n1 = leia.nextFloat();
		
		System.out.println("\n Entre com N2: ");
		float n2 = leia.nextFloat();
		
		System.out.println("\n Entre com N3: ");
		float n3 = leia.nextFloat();
		
		System.out.println("\n Entre com N4: ");
		float n4 = leia.nextFloat();
		
		
		float diferenca = ((n1 * n2) - (n3 * n4));
		
		System.out.println("\n A diferença é: " + diferenca);
		
		leia.close();

	}

}
