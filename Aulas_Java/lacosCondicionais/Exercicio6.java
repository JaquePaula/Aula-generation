package lacosCondicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// lista 2 - exercicio 6 - Aula 9
		
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int cargo;
		float salario;
		
		System.out.println("\nNome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Cargo: ");
		cargo = leia.nextInt();
	
		
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		
		switch(cargo) {
		case 1: 
		    System.out.println("\nNome Do Colaborador:" + nome + "\n\nCargo: Gerente" + "\n\nSalário: R$"+ (salario + (0.10 * salario)));
		    break;
		case 2: 
		     System.out.println("\nNome Do Colaborador:" + nome + "\n\nCargo: Vendedor" + "\n\nSalário: R$"+ (salario + (0.07 * salario)));
		    break;
		case 3: 
			System.out.println("\nNome Do Colaborador:" + nome + "\nC\nargo: Supervisor" + "\n\nSalário: R$"+ (salario + (0.09 * salario)));
			break;
		case 4: 
			System.out.println("\nNome Do Colaborador:" + nome + "\n\nCargo: Motorista" + "\n\nSalário: R$"+ (salario + (0.06 * salario)));
			break;
		case 5: 
			System.out.println("\nNome Do Colaborador:" + nome + "\n\nCargo: Estoquista" + "\n\nSalário: R$"+ (salario + (0.05 * salario)));
			break;
		case 6: 
			System.out.println("\nNome Do Colaborador:" + nome + "\n\nCargo: Técnico de TI" + "\n\nSalário: R$"+ (salario + (0.08 * salario)));
			break;
		default:
		System.out.println("\n\n Opção invalida (Digite um cargo de 1 a 6)!! ");	
       	}
		
		leia.close();
		

      }
}
