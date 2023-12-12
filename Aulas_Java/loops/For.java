package loops;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// for -> executar um certo número de vezes
		
		Scanner leia = new Scanner (System.in);
		
		
		String nome;
		int contador;
		
		System.out.println("\nAs vagas são limitadas, inscreva-se ja!!");
		
		//operadores unários
		
		// começa, onde termina, e quanto irá somar
		
		
		for (contador = 1; contador < 4; contador++) {
		System.out.println("\nVocê foi o " + contador + "! Digite seu nome: ");
		nome = leia.nextLine();
		
		}
		
		
		System.out.println("\nVagas esgotadas!!");
		
		
		
		
		
		

	}

}
