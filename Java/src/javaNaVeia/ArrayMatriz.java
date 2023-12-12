package javaNaVeia;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		/* linha x coluna
		 * 
		 * O/0     0/1 
		 * 1/0     1/1
		 * 2/0     2/1	  
		 */
		
		int numeros[][] = new int [3][2];
		int contPares= 0, somaImpar=0, linha,coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				//linha 0 e coluna 0
				System.out.println("\n Entre com um numero na linha " + linha + " e coluna " + coluna);
				numeros[linha][coluna] = leia.nextInt();
				
				if (numeros [linha][coluna] % 2 == 0) {
					contPares++;
				}else {
					somaImpar += numeros [linha][coluna];
					
				}
				
				
			}
		}
		System.out.println("\nEu tenho: " + contPares + " numeros pares...");
		System.out.println("\nA soma dos impares é: " + somaImpar);
		
		

	}

}
