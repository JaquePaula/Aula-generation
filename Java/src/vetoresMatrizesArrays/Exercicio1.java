package vetoresMatrizesArrays;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// lista 1 - Exercicio 1 - Aula 11
		
		Scanner leia = new Scanner(System.in);
		
		int [] numeros = {2,5,1,3,4,9,7,8,10,6};
		int contador, digite;	
		
		System.out.println("Digite o número que você deseja encontrar: ");
		digite = leia.nextInt();
		
	
		for (contador = 0; contador < 10; contador++) {
			if (numeros[contador] == digite) {
				System.out.println("O número " + digite + " está localizado na posição " + contador);
			}
	
			if(digite > numeros.length || digite <= 0) {
				System.out.println("O número " + digite +  " não foi encontrado!");
				break;
				
			} leia.close();
		} 
	}
}



	