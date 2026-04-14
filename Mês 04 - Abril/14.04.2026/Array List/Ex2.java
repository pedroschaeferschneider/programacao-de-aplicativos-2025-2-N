// Importa a classe ArrayList (lista dinâmica que cresce automaticamente)
import java.util.ArrayList;

// Importa a classe Collections (possui métodos utilitários para listas, como ordenar e inverter)
import java.util.Collections;

// Importa a interface List (boa prática: usar a interface ao invés da implementação direta)
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {

		// Cria uma lista de números inteiros
		// ArrayList é uma implementação da interface List
		List<Integer> lista = new ArrayList<>();

		// Adiciona elementos à lista na ordem desejada
		lista.add(1);
		lista.add(5);
		lista.add(-4);
		lista.add(3);
		lista.add(8);
		lista.add(6);

		// Inverte a ordem dos elementos da lista
		// O primeiro vira o último, o segundo vira o penúltimo, etc.
		Collections.reverse(lista);

		// Exibe a lista no console
		// Os elementos aparecem entre colchetes, na nova ordem invertida
		System.out.println(lista);

	}

}