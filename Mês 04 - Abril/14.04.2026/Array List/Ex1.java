
// Importa a classe ArrayList (uma lista dinâmica, que pode crescer automaticamente)
import java.util.ArrayList;

// Importa a interface List (boa prática: programar usando a interface)
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {

		// Cria uma lista de números inteiros (Integer)
		// ArrayList é uma implementação da interface List
		// Os <> indicam o tipo de dado armazenado (neste caso, Integer)
		List<Integer> lista = new ArrayList<>();

		// Adiciona elementos à lista
		// Os valores são inseridos na ordem em que aparecem
		lista.add(1);
		lista.add(5);
		lista.add(-4);
		lista.add(3);
		lista.add(8);
		lista.add(6);

		// Ordena a lista
		// O "null" indica que será usada a ordem natural dos elementos (crescente)
		lista.sort(null);

		// Imprime a lista no console
		// O Java automaticamente mostra os elementos entre colchetes
		System.out.println(lista);

	}

}