package atividadesBloco1;

import java.util.Scanner;

public class OperadorDivisao {

	public static void main(String[] args) {
		// Exercise 2 Dia 8
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Entre com sua nota 1: ");
		float nota1 = leia.nextFloat();
		
		System.out.println("\n Entre com sua nota 2: ");
		float nota2 = leia.nextFloat();
		
		System.out.println("\n Entre com sua nota 3: ");
		float nota3 = leia.nextFloat();
		
		System.out.println("\n Entre com sua nota 4: ");
		float nota4 = leia.nextFloat();
		
		
		float media = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.println("\n Sua média é: " + media);
		
		leia.close();

	}

}
