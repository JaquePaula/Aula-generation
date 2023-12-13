package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila1 {

	public static void main(String[] args) {
		// Lista aula 12 - lista 1 exercicio 1
		
		
		Queue<String> banco = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int op;

		do {

			System.out.println("\n------------------------------");
			System.out.println("\n\t\tMenu Banco");
			System.out.println("\n(1) Adicionar cliente na fila");
			System.out.println("\n(2) Listar todos os clientes");
			System.out.println("\n(3) Retirar cliente da fila");
			System.out.println("\n(0) Sair");
			System.out.println("\n------------------------------");
			System.out.println("\nEntre com a opção desejada: ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do cliente: ");
				banco.add(leia.nextLine());
				System.out.println("\nFila: \n");
				System.out.println(banco);
				System.out.println("\nCliente adicionado!");
				break;
			case 2:
				System.out.println("\nLista de clientes na fila: ");
				System.out.println("\n" + banco);
				break;
			case 3:
				leia.nextLine();
				if (banco.isEmpty() == true) {
					System.out.println("\nA fila está vazia!");		
				}else {
				System.out.println("\nDigite o nome: ");
				System.out.println("\nNome: " + banco.remove());
				System.out.println("\n" + banco);
				System.out.println ("\nO cliente foi chamado!");
				}
				break;
			case 0:
				leia.nextLine();
				System.out.println("Programa Finalizado!");
				break;
			default: 
				System.out.println("Opção invalida!");
				break;
			}

		} while (op != 0 );
		

		leia.close();

	}

}
