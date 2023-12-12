package javaNaVeia;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		String nome = "Jaqueline Paula";
		int idade = 25;
		float altura = (float) 1.54;
	
		System.out.println("\n Meu nome é: " + nome );
		System.out.println("\n Eu tenho: " + idade + " anos de vida") ;
		System.out.println("\n Eu tenho: " + altura + " metros de altura") ;
		
		
		
		System.out.println("\n Entre com seu nome: ");
		nome = leia.nextLine();
		System.out.println("\n Entre com sua idade") ;
		idade = leia.nextInt() ;
		System.out.println("\n Entre com altura") ;
		altura = leia.nextFloat();
		
		
		System.out.println("\n Meu nome é: " + nome );
		System.out.println("\n Eu tenho: " + idade + " anos de vida") ;
		System.out.println("\n Eu tenho: " + altura + " metros de altura") ;
		
		
		leia.close();
		
		
		

	}

}
