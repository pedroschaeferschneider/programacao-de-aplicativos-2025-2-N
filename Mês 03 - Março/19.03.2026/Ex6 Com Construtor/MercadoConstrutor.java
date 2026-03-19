
public class MercadoConstrutor {

	String nomeMercado;
	int qtdMacasVendidas;
	double precoMacas;
	int qtdLaranjasVendidas;
	double precoLaranjas;

	/**
	 * Construtor da classe.
	 * 
	 * Responsável por inicializar o objeto com os valores necessários no momento da
	 * criação.
	 * 
	 * O "this" é utilizado para diferenciar os atributos da classe dos parâmetros
	 * do construtor (que têm o mesmo nome).
	 * 
	 * Exemplo: this.nomeMercado = nomeMercado; → o atributo da classe recebe o
	 * valor passado como parâmetro.
	 */
	public MercadoConstrutor(String nomeMercado, int qtdMacasVendidas, double precoMacas, int qtdLaranjasVendidas,
			double precoLaranjas) {

		this.nomeMercado = nomeMercado;
		this.qtdMacasVendidas = qtdMacasVendidas;
		this.precoMacas = precoMacas;
		this.qtdLaranjasVendidas = qtdLaranjasVendidas;
		this.precoLaranjas = precoLaranjas;
	}

	/**
	 * Calcula a receita obtida com a venda de maçãs.
	 * 
	 * Fórmula: quantidade * preço unitário
	 */
	public double obterReceitaMacas() {
		return qtdMacasVendidas * precoMacas;
	}

	/**
	 * Calcula a receita obtida com a venda de laranjas.
	 */
	public double obterReceitaLaranjas() {
		return qtdLaranjasVendidas * precoLaranjas;
	}

	/**
	 * Calcula a receita total do mercado, somando a receita de maçãs e laranjas.
	 */
	public double obterReceitaTotal() {
		return obterReceitaLaranjas() + obterReceitaMacas();
	}
}
