package lacosCondicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// lista 1 -Exercicio 3 - Dia 9
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiro;
		
		System.out.println("Digite o Nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		primeiro = leia.nextBoolean();
		
		
		if (idade >=60 && idade <= 69 && primeiro == true) {
			System.out.println(nome + " não está apto(a) para doar sangue! ");
		} else if (idade > 18 && idade < 59){
			System.out.println(nome + " está apto(a) para doar sangue! ");
		} else if (idade <= 17 ){		
			System.out.println(nome + " não está apto(a) para doar sangue! ");
		}else {
			System.out.println(nome + " está apto(a) para doar sangue! ");
		}
		
		
		leia.close();
		
		

	}

}
