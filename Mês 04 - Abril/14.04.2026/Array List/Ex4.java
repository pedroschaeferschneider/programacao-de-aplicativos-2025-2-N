
// Importa a classe ArrayList (lista dinâmica que pode crescer)
import java.util.ArrayList;

// Importa a interface List (boa prática: usar a interface)
import java.util.List;

// Importa a classe Scanner (para ler dados do teclado)
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		// Cria uma lista de números inteiros
		List<Integer> lista = new ArrayList<>();

		// Adiciona alguns valores à lista
		lista.add(1);
		lista.add(5);
		lista.add(-4);
		lista.add(3);
		lista.add(8);
		lista.add(6);

		// Cria um Scanner para ler a entrada do usuário
		Scanner input = new Scanner(System.in);

		// Pergunta qual valor o usuário quer buscar
		System.out.println("Insira o valor que você quer saber o índice");
		int numero = input.nextInt();

		// Procura o índice do número na lista
		// indexOf() retorna a posição do elemento (começa em 0)
		// Se não encontrar, retorna -1
		int indice = lista.indexOf(numero);

		// Verifica se o número foi encontrado
		if (indice != -1) {
			// Se encontrou, mostra o índice
			System.out.println("O valor " + numero + " está no índice " + indice);
		} else {
			// Se não encontrou, informa ao usuário
			System.out.println("O valor não está na lista");
		}

	}

}