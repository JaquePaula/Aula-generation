package loops;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// Lista 1 - Exercicio 1
		
		
		Scanner leia = new Scanner(System.in);
		int num1,num2 ;
		
		System.out.println("Digite o primeiro numero do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o ultimo numero do intervalo: ");
		num2 = leia.nextInt();
		
		if (num1 > num2) {
		System.out.println ("\n Intervalo inválido!");
		} else {
		System.out.println("\nNo intervalo entre " + num1 + " e " + num2 + ":\n");
		}

		for (num1 = num1 + 0; num1 < num2; num1 ++) {
		
		if ((num1 % 3 == 0) && (num1 % 5 == 0)) { 
		
		System.out.println(num1 + " é multiplo de 3 e 5!");
		} else if ((num2 % 3 == 0) && (num2 % 5 == 0))	{
		System.out.println( "é multiplo de 3 e 5" );
		
		
		leia.close();
		
		} 
	}

}
}

