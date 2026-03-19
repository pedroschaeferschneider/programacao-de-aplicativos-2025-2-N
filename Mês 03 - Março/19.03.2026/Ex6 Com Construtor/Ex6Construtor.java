
public class Ex6Construtor {
	public static void main(String[] args) {

		// Aqui estamos criando um objeto da classe MercadoConstrutor.
		// O operador "new" chama o construtor da classe.

		// Estrutura da chamada:
		// new MercadoConstrutor(nome, qtdMacas, precoMacas, qtdLaranjas, precoLaranjas)

		// Ou seja, estamos passando todos os dados necessários já no momento da criação
		// do objeto.

		// Criação da unidade de Blumenau
		MercadoConstrutor unidadeBlumenau = new MercadoConstrutor("Giassi", 500, 8.7, 400, 9.25);

		// Criação da unidade de Joinville
		MercadoConstrutor unidadeJoinville = new MercadoConstrutor("Angeloni", 600, 8.9, 300, 10.25);

		// Criação da unidade de Florianopolis
		MercadoConstrutor unidadeFlorianopolis = new MercadoConstrutor("Bistek", 700, 7.7, 500, 11.25);

		MercadoConstrutor listaMercados[] = { unidadeBlumenau, unidadeJoinville, unidadeFlorianopolis };

		// Quem teve a maior receita vendendo maçãs?
		double maiorReceitaMacas = 0;
		MercadoConstrutor mercadoMaiorReceitaMacas = null;

		for (int i = 0; i < listaMercados.length; i++) {
			if (listaMercados[i].obterReceitaMacas() > maiorReceitaMacas) {
				maiorReceitaMacas = listaMercados[i].obterReceitaMacas();
				mercadoMaiorReceitaMacas = listaMercados[i];
			}
		}

		System.out.println(mercadoMaiorReceitaMacas.nomeMercado);

		// Quem teve a menor receita vendendo laranjas?

		double menorReceitaLaranjas = Double.MAX_VALUE;
		MercadoConstrutor mercadoMenorReceitaLaranjas = null;

		for (int i = 0; i < listaMercados.length; i++) {
			if (listaMercados[i].obterReceitaLaranjas() < menorReceitaLaranjas) {
				menorReceitaLaranjas = listaMercados[i].obterReceitaLaranjas();
				mercadoMenorReceitaLaranjas = listaMercados[i];
			}
		}

		System.out.println(mercadoMenorReceitaLaranjas.nomeMercado);

	}

}
