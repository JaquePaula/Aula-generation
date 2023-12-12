package javaNaVeia;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\t Menu de Emoções");
		System.out.println("\n1 - Gratidão");
		System.out.println("\n2 - Amor ");
		System.out.println("\n3 - Felicidade");
		System.out.println("\n4 - Contentamento");
		System.out.println("\n5 - Orgulho");
		System.out.println("\n Digite a sua opção: ");
		
		op = leia.nextInt();
		
		
		switch(op) {
		case 1: // o case pode ser número, pode ser palavra.. so é necessario criar mais de uma variavel caso tenha mais de um tipo
			System.out.println("\n Sentimento de Gratidão");
			break;
		case 2:
			System.out.println("\n Sentimento de Amor ");
			break;
		case 3:
			System.out.println("\n Sentimento de Felicidade ");
			break;
		case 4:
			System.out.println("\n Sentimento de Contentamento");
			break;
		case 5:
			System.out.println("\n Sentimento de Orgulho");
			break;
			default:
			System.out.println("\n Opção invalida!! ");
			
			
		}
		
		
		
		

	}

}
