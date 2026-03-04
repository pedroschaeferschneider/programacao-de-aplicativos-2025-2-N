
public class ExemploMetodoComRetorno {

	/**
	 * Método para retornar a divisão dos valores passados como parâmetro <br>
	 * Não tem a responsabilidade de imprimir esses valores, essa responsabilidade
	 * fica na main
	 * 
	 * @param numerador   - O numerador da divisão
	 * @param denominador - O denominador da divisão
	 * @return O resultado da divisão
	 */
	public static double dividirValores(double numerador, double denominador) {
		double retorno = numerador / denominador;
		return retorno;
	}

	public static void main(String[] args) {

		double numerador = 8;
		double denominador = 2;

		double resultado = dividirValores(numerador, denominador);

		System.out.println(resultado);

		// Ou

		System.out.println(dividirValores(numerador, denominador));

	}

}
