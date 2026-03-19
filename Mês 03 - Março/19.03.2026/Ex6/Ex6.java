
public class Ex6 {

	public static void main(String[] args) {

		// Criação da unidade de Blumenau
		Mercado unidadeBlumenau = new Mercado();

		unidadeBlumenau.nomeMercado = "Giassi";
		unidadeBlumenau.qtdMacasVendidas = 500;
		unidadeBlumenau.precoMacas = 8.7;
		unidadeBlumenau.qtdLaranjasVendidas = 400;
		unidadeBlumenau.precoLaranjas = 9.25;

		// Criação da unidade de Joinville
		Mercado unidadeJoinville = new Mercado();

		unidadeJoinville.nomeMercado = "Angeloni";
		unidadeJoinville.qtdMacasVendidas = 600;
		unidadeJoinville.precoMacas = 8.9;
		unidadeJoinville.qtdLaranjasVendidas = 300;
		unidadeJoinville.precoLaranjas = 10.25;

		// Criação da unidade de Florianopolis
		Mercado unidadeFlorianopolis = new Mercado();

		unidadeFlorianopolis.nomeMercado = "Bistek";
		unidadeFlorianopolis.qtdMacasVendidas = 700;
		unidadeFlorianopolis.precoMacas = 7.7;
		unidadeFlorianopolis.qtdLaranjasVendidas = 500;
		unidadeFlorianopolis.precoLaranjas = 11.25;

		Mercado listaMercados[] = { unidadeBlumenau, unidadeJoinville, unidadeFlorianopolis };

		// Quem teve a maior receita vendendo maçãs?
		double maiorReceitaMacas = 0;
		Mercado mercadoMaiorReceitaMacas = null;

		for (int i = 0; i < listaMercados.length; i++) {
			if (listaMercados[i].obterReceitaMacas() > maiorReceitaMacas) {
				maiorReceitaMacas = listaMercados[i].obterReceitaMacas();
				mercadoMaiorReceitaMacas = listaMercados[i];
			}
		}

		System.out.println(mercadoMaiorReceitaMacas.nomeMercado);

		// Quem teve a menor receita vendendo laranjas?

		double menorReceitaLaranjas = Double.MAX_VALUE;
		Mercado mercadoMenorReceitaLaranjas = null;

		for (int i = 0; i < listaMercados.length; i++) {
			if (listaMercados[i].obterReceitaLaranjas() < menorReceitaLaranjas) {
				menorReceitaLaranjas = listaMercados[i].obterReceitaLaranjas();
				mercadoMenorReceitaLaranjas = listaMercados[i];
			}
		}

		System.out.println(mercadoMenorReceitaLaranjas.nomeMercado);
		
		

	}

}
