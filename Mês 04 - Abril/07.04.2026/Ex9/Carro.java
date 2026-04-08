/**
 * Classe que representa um carro com controle de velocidade.
 * 
 * <p>Aplica o conceito de encapsulamento, garantindo que a velocidade
 * nunca assuma valores inválidos através de validações centralizadas
 * no método setter.</p>
 */
public class Carro {

	/**
	 * Velocidade atual do carro.
	 * 
	 * <p>É privada para garantir encapsulamento e só pode ser acessada
	 * ou modificada por meio dos métodos públicos.</p>
	 */
	private int velocidade;

	/**
	 * Construtor da classe Carro.
	 * 
	 * <p>Utiliza o método setter para garantir que a validação da velocidade
	 * seja aplicada já na criação do objeto, evitando duplicação de lógica.</p>
	 *
	 */
	public Carro(int velocidade) {
		setVelocidade(velocidade); // reutiliza validação do setter
	}

	/**
	 * Aumenta a velocidade do carro.
	 * 
	 * <p>Aplica validação para garantir que o aumento esteja dentro de um
	 * intervalo permitido (0 a 19).</p>
	 * 
	 * @param aumento valor a ser somado à velocidade atual
	 * @throws IllegalArgumentException se o aumento for negativo ou maior/igual a 20
	 */
	public void acelerar(int aumento) {
		if (aumento < 0 || aumento >= 20) {
			// Lançamento de exceção para impedir estado inválido
			throw new IllegalArgumentException("Aceleração inválida");
		}
		this.velocidade += aumento;
	}

	/**
	 * Reduz a velocidade do carro.
	 * 
	 * <p>Utiliza o setter para atualizar a velocidade, garantindo que a
	 * validação de valores negativos seja reaproveitada.</p>
	 * 
	 * @param reducao valor a ser subtraído da velocidade atual
	 * @throws IllegalArgumentException se a redução for negativa ou maior/igual a 30
	 */
	public void reduzir(int reducao) {
		if (reducao < 0 || reducao >= 30) {
			// Lançamento de exceção para impedir operação inválida
			throw new IllegalArgumentException("Redução inválida");
		}
		// Usa o setter para garantir validação centralizada
		setVelocidade(velocidade - reducao);
	}

	/**
	 * Retorna a velocidade atual do carro.
	 * 
	 * @return velocidade atual
	 */
	public int getVelocidade() {
		return velocidade;
	}

	/**
	 * Define a velocidade do carro.
	 * 
	 * <p>Este método centraliza a validação da velocidade, garantindo que
	 * nenhum valor negativo seja atribuído.</p>
	 * 
	 * @param velocidade nova velocidade
	 * @throws IllegalArgumentException se a velocidade for negativa
	 */
	public void setVelocidade(int velocidade) {
		if (velocidade < 0) {
			// Garante integridade do objeto
			throw new IllegalArgumentException("Velocidade inválida");
		}
		this.velocidade = velocidade;
	}

	/**
	 * Retorna uma representação textual do objeto.
	 * 
	 * @return string com o estado atual do carro
	 */
	@Override
	public String toString() {
		return "Carro [velocidade=" + velocidade + "]";
	}

}