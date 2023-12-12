package javaNaVeia;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float media[] = new float[4];
		String nomes[] = new String [4];
		float n1, n2, n3,mediaGeral,somaMedia=0;
		int x;
		
		Scanner leia = new Scanner (System.in);
		for (x=0;x<4;x++) { //x = x + 1
			System.out.println("\n Entre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\n Entre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\n Entre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1 + n2 + n3)/3 ;
			System.out.println("Media aluno" + x + "foi de " + media[x]);
			
			somaMedia += media[x];
			
			mediaGeral = somaMedia/x;  // depois do loop for o x esta valendo 4
			
			System.out.println("Media geral foi de: " + mediaGeral);
			
			
			
		
		}
		
		

	}

}
