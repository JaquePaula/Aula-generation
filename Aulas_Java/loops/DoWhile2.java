package loops;

import java.util.Scanner;

public class DoWhile2 {
	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	    int num, soma = 0;
		
		do{
			System.out.println("\nDigite um numero: ");
			num = leia.nextInt();
			
			if (num > 0 ) {
				soma = soma + num; 
			}	
		 
		}
	    while(num != 0);
	    System.out.println("\nA soma dos numeros positivos é:" + soma);		
	
	    leia.close();
	    
	
	}
}

