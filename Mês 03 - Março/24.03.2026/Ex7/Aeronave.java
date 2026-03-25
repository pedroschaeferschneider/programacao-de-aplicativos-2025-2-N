public class Aeronave {

	// Atributos da classe
	String modelo;
	int passageiros;
	double velMax;
	double capCombustivel;
	double queimaCombustivel;

	// Construtor da classe, responsável por inicializar os atributos
	public Aeronave(String modelo, int passageiros, double velMax, double capCombustivel, double queimaCombustivel) {
		this.modelo = modelo;
		this.passageiros = passageiros;
		this.velMax = velMax;
		this.capCombustivel = capCombustivel;
		this.queimaCombustivel = queimaCombustivel;
	}

	/**
	 * Calcula a autonomia da aeronave (tempo máximo de voo).
	 *
	 * @return Autonomia da aeronave, obtida pela divisão entre a capacidade de
	 *         combustível e a taxa de consumo (capCombustivel / queimaCombustivel)
	 */
	public double calcularAutonomia() {
		return capCombustivel / queimaCombustivel;
	}

	/**
	 * Calcula a distância máxima que a aeronave pode percorrer.
	 *
	 * @return Distância máxima, calculada como o produto da velocidade máxima pela
	 *         autonomia
	 */
	public double calcularDistancia() {
		return velMax * calcularAutonomia();
	}

	@Override
	public String toString() {
		return "Aeronave [modelo=" + modelo + ", passageiros=" + passageiros + ", velMax=" + velMax
				+ ", capCombustivel=" + capCombustivel + ", queimaCombustivel=" + queimaCombustivel + "]";
	}

}