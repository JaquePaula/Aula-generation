package lacosCondicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// lista 2 - exercicio 5 - Aula 9
		
		 
	int QtdeProduto,op;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("\n\tProdutos            Preço Unitário");
	System.out.println("\n1 - Cachorro Quente          R$:10.00   ");
	System.out.println("\n2 - X-Salada                 R$:15.00    ");
	System.out.println("\n3 - X-Bacon                  R$:18.00   ");
	System.out.println("\n4 - Bauru                    R$:12.00   ");
	System.out.println("\n5 - Refrigerante             R$:8.00   ");
	System.out.println("\n6 - Suco de Laranja          R$:13.00   ");
	System.out.println("\n Código do Produto: ");
	op = leia.nextInt();
	System.out.println("\n Quantidade: ");
	QtdeProduto = leia.nextInt();
	
	switch(op) {
	case 1: 
		System.out.println("\n Produto: Cachorro Quente  \n Valor total: R$" + (10 * QtdeProduto));
		break;
	case 2:
		System.out.println("\n Produto: X-Salada  \n Valor total: R$" + (15 * QtdeProduto));
		break;
	case 3:
		System.out.println("\n Produto: X-Bacon \n Valor total: R$" + (18 * QtdeProduto));
		break;
	case 4:
		System.out.println("\n Produto: Bauru \n Valor total: R$" + (12 * QtdeProduto));
		break;
	case 5:
		System.out.println("\n Produto: Refrigerante \n Valor total: R$" + (8 * QtdeProduto));
		break;
	case 6:
		System.out.println("\n Produto: Suco de Laranja \n Valor total: R$" + (13 * QtdeProduto));
		break;	
		default:
		System.out.println("\n Opção invalida!! ");
		
		leia.close();
		
	}
		
	
	}

}
