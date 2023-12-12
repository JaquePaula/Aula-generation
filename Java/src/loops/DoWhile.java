package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*  
	   executar enquanto uma condição for verdadeira
	    a diferença entre o while e o do-while é que o do-while executa pelo menos uma vez
	    executa primeiro e pergunta a condiçao depois
		
		 */
		
		
		 Scanner leia = new Scanner (System.in);
	     int resultado, opcao;
			
	     
	     do {
			System.out.println("\nCalculadora que so multiplica por 5");
			System.out.println("\nDigite um numero: ");
			opcao = leia.nextInt();
			resultado = opcao * 5;
			System.out.println("\nO resultado da multiplicação é: " + resultado);
			System.out.println("\nEntre com outro numero ou digite 0 para sair!");
			opcao = leia.nextInt();
				
			
				
	    }while(opcao != 0) ;
		System.out.println("\nObrigada por usar a calculadora!");
		
		leia.close();

	}
}


