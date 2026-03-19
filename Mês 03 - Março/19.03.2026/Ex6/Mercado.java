/**
 * Representa um mercado que vende frutas e armazena informações sobre
 * quantidade vendida e preços.
 */
public class Mercado {

	String nomeMercado;
	int qtdMacasVendidas;
	double precoMacas;
	int qtdLaranjasVendidas;
	double precoLaranjas;

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
     * Calcula a receita total do mercado,
     * somando a receita de maçãs e laranjas.
     */
    public double obterReceitaTotal() {
        return obterReceitaLaranjas() + obterReceitaMacas();
    }

}
