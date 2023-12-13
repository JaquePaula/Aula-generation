package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha1 {

	public static void main(String[] args) {
		// Lista aula 12 - lista 1 exercicio 1
		
       Stack<String> livros = new Stack<String>();
       Scanner leia = new Scanner(System.in);
       int op;
       
        do {
      
        System.out.println("\n------------------------------");
		System.out.println("\n\t\tMenu livros");
		System.out.println("\n(1) Adicionar livro na pilha");
		System.out.println("\n(2) Listar todos os livros");
		System.out.println("\n(3) Retirar livro da pilha");
		System.out.println("\n(0) Sair");
		System.out.println("\n------------------------------");
		System.out.println("\nEntre com a opção desejada: ");
		op = leia.nextInt();
		
		
		switch (op) {
		case 1:
			leia.nextLine();
			System.out.println("\nDigite o nome do livro: ");
			livros.add(leia.nextLine());
			System.out.println("\nPilha: \n");
			System.out.println(livros);
			System.out.println("\nLivro adicionado!");
			break;
		case 2:
			System.out.println("\nLista de livros na pilha: ");
			System.out.println("\n" + livros);
			break;
		case 3:
			leia.nextLine();
			if (livros.isEmpty() == true) {
				System.out.println("\nA pilha está vazia!");		
			}else {
			System.out.println("\nDigite o nome: ");
			System.out.println("\nNome: " + livros.pop());
			System.out.println("\n" + livros);
			System.out.println ("\nUm livro foi retirado da pilha!");
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
