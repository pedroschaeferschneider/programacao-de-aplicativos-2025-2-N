import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por manter uma coleção de objetos {@link Retangulo} e
 * fornecer operações de comparação entre eles.
 *
 * <p>
 * Esta classe encapsula a lógica de agregação e comparação, permitindo
 * identificar retângulos com base em critérios específicos, como:
 * <ul>
 * <li>Maior perímetro</li>
 * <li>Maior área</li>
 * </ul>
 *
 * <p>
 * Ou seja, ela atua como um "serviço de comparação", centralizando regras que
 * evitam espalhar lógica de busca/comparação pelo restante do sistema.
 */
public class ColetaneoDeRetangulos {

	/**
	 * Lista interna que armazena os retângulos.
	 */
	private List<Retangulo> listaRetangulos;

	public ColetaneoDeRetangulos() {
		listaRetangulos = new ArrayList<>();
	}

	/**
	 * Adiciona um novo retângulo à coleção.
	 *
	 * @param r Retângulo a ser adicionado
	 */
	public void adicionarRetangulo(Retangulo r) {
		listaRetangulos.add(r);
	}

	/**
	 * Retorna a lista completa de retângulos.
	 * 
	 * @return lista de retângulos
	 */
	public List<Retangulo> obterLista() {
		return listaRetangulos;
	}

	/**
	 * Encontra o retângulo com o maior perímetro na coleção.
	 *
	 * <p>
	 * A comparação é feita iterando sobre todos os elementos e utilizando o método
	 * {@code obterPerimetro()} de cada retângulo.
	 *
	 * <p>
	 * Este método ilustra claramente o papel da classe como responsável por
	 * realizar comparações entre objetos {@link Retangulo}.
	 *
	 * @return o retângulo com maior perímetro ou {@code null} se a lista estiver
	 *         vazia
	 */
	public Retangulo obterRetanguloMaiorPerimetro() {

		double maiorPerimetro = Double.MIN_VALUE;
		Retangulo retMaiorPerimetro = null;

		for (Retangulo r : listaRetangulos) {
			// Comparação baseada no perímetro do retângulo
			if (r.obterPerimetro() > maiorPerimetro) {
				maiorPerimetro = r.obterPerimetro();
				retMaiorPerimetro = r;
			}
		}

		return retMaiorPerimetro;
	}

	/**
	 * Encontra o retângulo com a maior área na coleção.
	 *
	 * <p>
	 * A comparação é feita percorrendo todos os retângulos e utilizando o método
	 * {@code obterArea()}.
	 *
	 * <p>
	 * Assim como o método de perímetro, este reforça a responsabilidade da classe
	 * como um mecanismo de comparação baseado em critérios específicos.
	 *
	 * @return o retângulo com maior área ou {@code null} se a lista estiver vazia
	 */
	public Retangulo obterRetanguloMaiorArea() {

		double maiorArea = Double.MIN_VALUE;
		Retangulo retMaiorArea = null;

		for (Retangulo r : listaRetangulos) {
			// Comparação baseada na área do retângulo
			if (r.obterArea() > maiorArea) {
				maiorArea = r.obterArea();
				retMaiorArea = r;
			}
		}

		return retMaiorArea;
	}

}