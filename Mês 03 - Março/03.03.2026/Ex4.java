
public class Ex4 {

	public static void main(String[] args) {

		int vetor[] = { 8, 14, 2, 16, -5, 0 };

		obterMaiorValor(vetor);
		obterMenorValor(vetor);
		obterMedia(vetor);
	}

	/**
	 * Encontra e exibe o maior valor presente no vetor.
	 * 
	 * @param vetor - array de inteiros para procurar o maior valor
	 */
	public static void obterMaiorValor(int vetor[]) {

		int maiorValor = Integer.MIN_VALUE;

		// Ou

		// int maiorValor = vetor[0];

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}

		System.out.println(maiorValor);

	}

	/**
	 * Encontra e exibe o menor valor presente no vetor.
	 * 
	 * @param vetor - array de inteiros para procurar o menor valor
	 */
	public static void obterMenorValor(int vetor[]) {

		int menorValor = Integer.MAX_VALUE;

		// Ou

		// int menorValor = vetor[0];

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
		}

		System.out.println(menorValor);

	}

	/**
	 * Calcula e exibe a média aritmética dos valores presentes no vetor.
	 * 
	 * @param vetor - array de inteiros para calcular a média
	 */
	public static void obterMedia(int vetor[]) {

		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		double media = soma / vetor.length;

		System.out.println(media);

	}

}
