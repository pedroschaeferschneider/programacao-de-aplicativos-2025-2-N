
// Importa a classe ArrayList (lista dinâmica)
import java.util.ArrayList;

// Importa a classe Collections (métodos prontos como menor e maior valor)
import java.util.Collections;

// Importa a interface List (boa prática)
import java.util.List;

// Importa a classe Scanner (usada para ler dados do teclado)
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

		// Cria uma lista para armazenar números inteiros
		List<Integer> lista = new ArrayList<>();

		// Cria um objeto Scanner para ler entradas do usuário
		Scanner input = new Scanner(System.in);

		// Pede ao usuário para digitar um número
		System.out.println("Insira o número");
		int numero = input.nextInt();

		// Enquanto o número for diferente de 0, continua o loop
		// O 0 funciona como "sentinela" (valor que encerra a entrada)
		while (numero != 0) {

			// Adiciona o número digitado na lista
			lista.add(numero);

			// Pede outro número
			System.out.println("Insira o número");
			numero = input.nextInt();
		}

		// Encontra o menor elemento da lista
		int menorElemento = Collections.min(lista);

		// Encontra o maior elemento da lista
		int maiorElemento = Collections.max(lista);

		// Variável para armazenar a soma dos elementos
		double soma = 0;

		// Percorre a lista usando índice (for tradicional)
		for (int i = 0; i < lista.size(); i++) {

			// get(i) pega o elemento na posição i
			soma += lista.get(i);
		}

		// Calcula a média (soma dividida pela quantidade de elementos)
		double media = soma / lista.size();

		// Exibe os resultados
		System.out.println("Menor elemento: " + menorElemento);
		System.out.println("Maior elemento: " + maiorElemento);
		System.out.println("Média: " + media);

	}

}