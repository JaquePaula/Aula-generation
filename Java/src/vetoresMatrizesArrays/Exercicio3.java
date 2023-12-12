package vetoresMatrizesArrays;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		int numeros[][] = new int [3][3];
	    int linha, coluna=0, somaP = 0, somaS =0 ;
	    
	    
	    
	    for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
		
		System.out.println("\n Entre com um numero na linha " + linha + " e coluna " + coluna + ":");
		numeros[linha][coluna] = leia.nextInt();	
			}
	    }
		System.out.println("\nElementos da diagonal principal: " + numeros[0][0] + " " + numeros[1][1] + " " + numeros[2][2] );
		System.out.println("\nElementos da diagonal secundária: " + numeros[0][2] + " " + numeros[1][1] + " " + numeros[2][0] );
		

			somaP += numeros [0][0] + numeros [1][1] +numeros [2][2] ;		
			System.out.println("\nSoma dos elementos da diagonal primária: " + somaP);
			somaS += numeros [0][2] + numeros [1][1] +numeros [2][0] ;		
			System.out.println("\nSoma dos elementos da diagonal secundaria: " + somaS);
			System.out.println();
			

	      } 
	    }


	   

