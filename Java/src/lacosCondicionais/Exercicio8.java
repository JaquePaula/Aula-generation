package lacosCondicionais;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// lista 2 - exercicio 8 - Aula 9
		
		
		float saldo = 1000 ;
		Scanner leia = new Scanner(System.in);
		int op;
		float saque,deposito;
		
		System.out.println("Código da Operação           Operação ");
		System.out.println("       1                      Saldo ");
		System.out.println("       2                      Saque ");
		System.out.println("       3                     Depósito ");
		System.out.println("\nOperação: ");
		op = leia.nextInt();
		
		
		switch(op) {
		case 1: 
		    System.out.println("Operação - Saldo \n\n Saldo: R$" + saldo);
		    break;
		case 2: 
			System.out.println("Valor: ");
			saque = leia.nextFloat();
			if (saque > saldo) {
		    System.out.println("Operação - Saque\n\nSaldo: insuficiente");
			}else {
			System.out.println("Operação - Saque\n\nNovo Saldo: R$" + (saldo - saque));
			}
		    break;
		case 3: 
			System.out.println("Valor: R$");
			deposito = leia.nextFloat();
			System.out.println("Operação - Depósito\nNovo Saldo: R$" + (saldo + deposito));
		    break;
		    default:
			System.out.println("\n\n Opção invalida! (Digite uma operação de 1 a 3)!! ");	
	       	}
			
			leia.close();

	}

}
