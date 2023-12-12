package lacosCondicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// lista 1 - Exercicio 4 - Aula 9
		
		
		
		Scanner leia = new Scanner(System.in);
		
		String tipo1, tipo2, tipo3;
		
	
		
		tipo1 = leia.nextLine();
		tipo2 = leia.nextLine();
		tipo3 = leia.nextLine();
		
		
		
		if (tipo1.equalsIgnoreCase("vertebrado") && tipo2.equalsIgnoreCase("ave") && tipo3.equalsIgnoreCase("carnivoro")) {
			System.out.println("Águia");
		} else if (tipo1.equalsIgnoreCase("vertebrado") && tipo2.equalsIgnoreCase("ave") && tipo3.equalsIgnoreCase("onivoro")) {
		    System.out.println("Pomba");
	    } else if (tipo1.equalsIgnoreCase("vertebrado") && tipo2.equalsIgnoreCase("mamifero") && tipo3.equalsIgnoreCase("onivoro")){
	    	System.out.println("Homem");	    	
	    } else if (tipo1.equalsIgnoreCase("vertebrado") && tipo2.equalsIgnoreCase("mamifero") && tipo3.equalsIgnoreCase("herbivoro")){
	    	System.out.println("Vaca");
		}else if (tipo1.equalsIgnoreCase("invertebrado") && tipo2.equalsIgnoreCase("inseto") && tipo3.equalsIgnoreCase("hematógafo")){
	    	System.out.println("Pulga");
		}else if (tipo1.equalsIgnoreCase("invertebrado") && tipo2.equalsIgnoreCase("inseto") && tipo3.equalsIgnoreCase("herbivoro")){
	    	System.out.println("Lagarta");
		}else if (tipo1.equalsIgnoreCase("invertebrado") && tipo2.equalsIgnoreCase("anelídeo") && tipo3.equalsIgnoreCase("hemátofago")){
	    	System.out.println("Sanguessuga");
		}else if (tipo1.equalsIgnoreCase("invertebrado") && tipo2.equalsIgnoreCase("anelídio") && tipo3.equalsIgnoreCase("onivoro")){
	    	System.out.println("Minhoca");
		}else {
	    	System.out.println("Digite uma opção válida");
		}
			
		
		leia.close();
		
		

	}

}
