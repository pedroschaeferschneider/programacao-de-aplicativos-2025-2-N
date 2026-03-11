public class ExemploPOO {

	public static void main(String[] args) {

		// Criação do primeiro objeto da classe Veiculo
		Veiculo v1 = new Veiculo();
		v1.modelo = "Honda City"; // Define o modelo do veículo
		v1.comprimento = 4.2; // Define o comprimento do veículo em metros
		v1.passageiros = 5; // Define a quantidade de passageiros
		v1.velMax = 190; // Define a velocidade máxima
		v1.cor = "Vermelho"; // Define a cor do veículo

		// Criação do segundo objeto da classe Veiculo
		Veiculo v2 = new Veiculo();
		v2.modelo = "Volkswagen Gol"; // Define o modelo do veículo
		v2.comprimento = 3.9; // Define o comprimento do veículo em metros
		v2.passageiros = 5; // Define a quantidade de passageiros
		v2.velMax = 170; // Define a velocidade máxima
		v2.cor = "Verde"; // Define a cor do veículo

		// Estrutura condicional para comparar qual veículo possui maior velocidade
		// máxima
		if (v1.velMax > v2.velMax) {
			// Caso o primeiro veículo seja mais rápido
			System.out.println("O " + v1.modelo + " é mais rápido");
		} else {
			// Caso o segundo veículo seja mais rápido
			System.out.println("O " + v2.modelo + " é mais rápido");
		}
	}

}