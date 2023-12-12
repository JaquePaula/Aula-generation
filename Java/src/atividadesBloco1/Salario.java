package atividadesBloco1;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// Exercise 3 Dia 8
		
		Scanner leia = new Scanner (System.in);
				
		System.out.println("\n Entre com seu salário bruto: ");
		float salarioB = leia.nextFloat();
				
		System.out.println("\n Entre com seu adicional noturno: ");
		float adicionalN = leia.nextFloat();
				
		System.out.println("\n Entre com suas horas extras: ");
		float horasE = leia.nextFloat();
				
		System.out.println("\n Entre com descontos: ");
		float descontos = leia.nextFloat();
				
				
		float salarioLiquido = (salarioB + adicionalN + (horasE * 5)) - descontos;
				
		System.out.println("\n Seu salário liquido é: " + salarioLiquido);

		
		leia.close();
	}

}
