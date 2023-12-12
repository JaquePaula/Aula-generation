package loops;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		/* while -> executar enquanto uma condição for verdadeira
		o while checa a condição antes de executar 
		*/
		
	
        Scanner leia = new Scanner (System.in);
        
		
		int resultado, opcao;
		
		System.out.println("\nCalculadora que so multiplica por 5");
		System.out.println("\nDigite um numero diferente de 0: ");
		opcao = leia.nextInt();
		
		while(opcao != 0) {
			resultado = opcao * 5;
			System.out.println("\nO resultado da multiplicação é: " + resultado);
			
			System.out.println("\nEntre com outro numero ou digite 0 para sair!");
			opcao = leia.nextInt();
			
			System.out.println("\nObrigada por usar a calculadora!");
			
	
			leia.close();
			
			
		}

	}

}
