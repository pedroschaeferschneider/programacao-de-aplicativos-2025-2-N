/**
 * Representa um círculo e fornece operações relacionadas ao cálculo de suas
 * propriedades geométricas.
 */
public class Circulo {

	double raio;

	/**
	 * Calcula a área do círculo com base no raio informado.
	 *
	 * @return área do círculo
	 */
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}

}
