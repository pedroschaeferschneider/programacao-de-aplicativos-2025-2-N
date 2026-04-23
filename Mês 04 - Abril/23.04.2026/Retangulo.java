
public class Retangulo {

	private double altura;

	private double largura;

	public Retangulo(double altura, double largura) {
		setAltura(altura);
		setLargura(largura);
	}

	/**
	 * Calcula a área do retângulo.
	 *
	 * <p>
	 * Este método é utilizado como critério de comparação em operações como "maior
	 * área".
	 *
	 * @return área do retângulo
	 */
	public double obterArea() {
		return largura * altura;
	}

	/**
	 * Calcula o perímetro do retângulo.
	 *
	 * <p>
	 * Também é utilizado como critério de comparação, por exemplo para encontrar o
	 * retângulo com maior perímetro.
	 *
	 * @return perímetro do retângulo
	 */
	public double obterPerimetro() {
		return (largura + altura) * 2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("Altura inválida");
		}
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if (largura <= 0) {
			throw new IllegalArgumentException("Largura inválida");
		}
		this.largura = largura;
	}

	@Override
	public String toString() {
		return "Retangulo [altura=" + altura + ", largura=" + largura + "]";
	}

}