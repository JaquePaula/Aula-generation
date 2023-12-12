package lacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		// lista 1 -Exercicio 1 - Aula 9
		
		float A,B,C;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o número A: ");
		A = leia.nextFloat();
		System.out.println("Digite o número B: ");
		B = leia.nextFloat();
		System.out.println("Digite o número C: ");
		C = leia.nextFloat();
		
		if(A + B == C){
			System.out.println ("A soma de A+B é igual a C.");
		} else if ((A + B) > C) {
			System.out.println("A soma de A + B é Maior do que C.");
		}else {
			System.out.println("A soma de A + B é Menor do que C. ");
		}
		
		leia.close();
		
	}

}
