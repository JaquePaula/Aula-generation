package lacosCondicionais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float num1,num2;
		int op;
		
		
		System.out.println("Digite o 1º numero: ");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o 2º numero: ");
		num2 = leia.nextFloat();
		
		System.out.println("Operação: ");
		op = leia.nextInt();
		
		
		switch(op) {
		case 1: 
		    System.out.println("\n" + num1 + " + " + num2 + " = " + (num1 + num2));
		    break;
		case 2: 
		    System.out.println("\n" + num1 + " - " + num2 + " = " + (num1 - num2));
		    break;
		case 3: 
		    System.out.println("\n" + num1 + " x " + num2 + " = " + (num1 * num2));
		    break;
		case 4: 
		    System.out.println("\n" + num1 + " / " + num2 + " = " + (num1 / num2));
		    break;
		    
		default:
			System.out.println("\n\n Opção invalida (Digite uma operação de 1 a 4)!! ");	
	       	}
			
			leia.close();

	}

}
