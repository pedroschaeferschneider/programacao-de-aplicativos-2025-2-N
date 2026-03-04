
public class ExemploMetodoComRetorno {

	public static double dividirValores(double numerador, double denominador) {
		double retorno = numerador / denominador;
		return retorno;
	}

	public static void main(String[] args) {

		double numerador = 8;
		double denominador = 2;

		double resultado = dividirValores(numerador, denominador);

		System.out.println(resultado);

	}

}
