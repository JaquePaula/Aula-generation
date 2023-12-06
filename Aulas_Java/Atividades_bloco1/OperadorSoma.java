package Atividades_bloco1;

import java.util.Scanner;

public class OperadorSoma {

	public static void main(String[] args) {
		// Exercise 1
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Entre com seu salário: ");
		float salario = leia.nextFloat();
		
		System.out.println("\n Entre com abono: ");
		float abono = leia.nextFloat();
		
		float NovoSalario = salario + abono;
		
		System.out.println("\n Seu novo salário é: " + NovoSalario);
		
		leia.close();
		
		

		
		
		

	}

}
