import java.util.ArrayList;
import java.util.List;

// Classe que representa uma Floricultura (modelo do domínio)
// ABSTRAÇÃO: representa um sistema real (uma loja de flores)
public class Floricultura {

	// Atributo que armazena várias instâncias de Flor
	// Relação HAS-A (AGREGAÇÃO): uma Floricultura "tem" várias Flores
	private List<Flor> listaFlores;

	// Construtor inicializa a lista
	// Garante que o objeto sempre terá uma coleção válida (evita null)
	public Floricultura() {
		listaFlores = new ArrayList<Flor>();
	}

	// Método de comportamento (AÇÃO da classe)
	// Encapsula a lógica de adicionar uma flor à coleção
	public void adicionarFlor(Flor f) {
		listaFlores.add(f);
	}

	// Getter expõe a lista de flores
	public List<Flor> obterListaFlores() {
		return listaFlores;
	}

	// Método com regra de negócio:
	// Filtra flores por cliente
	// Demonstra uso de coleção + iteração + condição
	public List<Flor> obterFloresPorCliente(String nome) {

		// Nova lista para armazenar o resultado (evita alterar a lista original)
		List<Flor> listaFlorPorCliente = new ArrayList<Flor>();

		// Percorre todas as flores da floricultura
		for (Flor f : listaFlores) {

			// Comparação ignorando maiúsculas/minúsculas
			if (f.getNomeCliente().equalsIgnoreCase(nome)) {

				// Adiciona à lista filtrada
				listaFlorPorCliente.add(f);
			}
		}

		// Retorna o resultado da consulta (sem expor lógica interna)
		return listaFlorPorCliente;

	}

}