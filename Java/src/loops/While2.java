package loops;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// 
		
		
		Scanner leia = new Scanner (System.in);
	    int idade, idade21 = 0, idade50 = 0;
		
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
			
		while(idade >= 0) {
			
		   if (idade < 21) { 
			idade21++;
		} if(idade>50) { 
			idade50++;
		}	
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		}	
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + idade21);
        System.out.println("Qntde de pessoas com idade acima de 50 anos: " + idade50 + "\n");	
		
		leia.close();
	}
      	}
	


