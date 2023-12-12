package javaNaVeia;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		/*
		 * 
		 * Operador logico E &&
		  Entrada1    Entrada2     Saída
		  v             v            V 
		  v             f            F
		  f             v            F
		  f             f            F
		 
		 
		 
		Operador logico OU ||
		 
		 Entrada1    Entrada2     Saída
		  v             v            V 
		  v             f            V
		  f             v            V
		  f             f            F
		 */
		
		float n1,n2,n3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println ("Entre com a nota 1: ");
		n1 = leia.nextFloat();
		
		System.out.println ("Entre com a nota 2: ");
		n2 = leia.nextFloat();
		
		System.out.println ("Entre com a nota 3: ");
		n3 = leia.nextFloat();
		
		media = (n1 + n2 + n3)/3;
		
		System.out.println("Média aritmética: " + media);
		
		
		
		if(media >=7 && media <=10) {
			System.out.println("Vocë foi aprovado!");	
		} else if (media >=5 && media<7) {
			
			// aqui também se enquandra como laço condicional
			
			if (media >=6 && media <7) {
				System.out.println("Vou te dar uma chance");	
				System.out.println("Me entregue um trabalho para ser avaliado");	
			} else
			System.out.println("Vocë ficou de exame!");	
		} else if (media >=0 && media <5){
			System.out.println("Vocë foi reprovado!");
		} else {
			System.out.println("Média invalida");
		}

	}

}


