public class Aeronave {

	// Atributos da classe definidos como PRIVATE:
	// Isso é encapsulamento → os dados não podem ser acessados diretamente de fora
	private String modelo;
	private int passageiros;
	private double velMax;
	private double capCombustivel;
	private double queimaCombustivel;

	// Construtor da classe
	// Em vez de acessar diretamente os atributos, usamos os SETTERS
	// Isso garante que as validações sejam aplicadas desde a criação do objeto
	public Aeronave(String modelo, int passageiros, double velMax, double capCombustivel, double queimaCombustivel) {
		setModelo(modelo);
		setPassageiros(passageiros);
		setVelMax(velMax);
		setCapCombustivel(capCombustivel);
		setQueimaCombustivel(queimaCombustivel);
	}

	/**
	 * Método que calcula a autonomia (tempo de voo)
	 * Aqui usamos diretamente os atributos da própria classe
	 */
	public double calcularAutonomia() {
		return capCombustivel / queimaCombustivel;
	}

	/**
	 * Calcula a distância máxima que a aeronave pode percorrer
	 * Reutiliza outro método → boa prática (evita repetição de lógica)
	 */
	public double calcularDistancia() {
		return velMax * calcularAutonomia();
	}

	// ===== GETTERS =====
	// Permitem acessar os atributos de forma CONTROLADA (leitura)

	public String getModelo() {
		return modelo;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public double getVelMax() {
		return velMax;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public double getQueimaCombustivel() {
		return queimaCombustivel;
	}

	// ===== SETTERS =====
	// Permitem alterar os atributos com VALIDAÇÃO (proteção dos dados)

	public void setModelo(String modelo) {
		// Validação: impede valor nulo ou vazio
		if (modelo == null || modelo.isBlank()) {
			System.out.println("Erro, modelo inválido");
		} else {
			this.modelo = modelo;
		}
	}

	public void setPassageiros(int passageiros) {
		// Não permite valores negativos
		if (passageiros < 0) {
			System.out.println("Erro, quantidade de passageiros não pode ser negativa");
		} else {
			this.passageiros = passageiros;
		}
	}

	public void setVelMax(double velMax) {
		// Velocidade deve ser positiva
		if (velMax <= 0) {
			System.out.println("Erro, velocidade máxima inválida");
		} else {
			this.velMax = velMax;
		}
	}

	public void setCapCombustivel(double capCombustivel) {
		if (capCombustivel <= 0) {
			System.out.println("Erro, capacidade de combustível inválida");
		} else {
			this.capCombustivel = capCombustivel;
		}
	}

	public void setQueimaCombustivel(double queimaCombustivel) {
		if (queimaCombustivel <= 0) {
			System.out.println("Erro, queima inválida");
		} else {
			this.queimaCombustivel = queimaCombustivel;
		}
	}

	// Método que representa o objeto como texto
	// Muito útil para debug e impressão
	@Override
	public String toString() {
		return "Aeronave [modelo=" + modelo + 
			   ", passageiros=" + passageiros + 
			   ", velMax=" + velMax +
			   ", capCombustivel=" + capCombustivel + 
			   ", queimaCombustivel=" + queimaCombustivel + "]";
	}

}