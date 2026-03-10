import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe a primeira nota");
		double nota1 = input.nextDouble();

		System.out.println("Informe a segunda nota");
		double nota2 = input.nextDouble();

		System.out.println("Informe a terceira nota");
		double nota3 = input.nextDouble();

		// Chama o método para calcular a média das três notas
		double media = calcularMedia(nota1, nota2, nota3);

		// Exibe o resultado da média
		System.out.println("A média é: " + media);

	}

	/**
	 * Calcula a média aritmética de três notas.
	 * 
	 * O cálculo é feito somando as três notas e dividindo o
	 * resultado por 3.
	 * 
	 * @param nota1 primeira nota informada
	 * @param nota2 segunda nota informada
	 * @param nota3 terceira nota informada
	 * @return valor da média das três notas
	 */
	public static double calcularMedia(double nota1, double nota2, double nota3) {
		// Retorna a média aritmética das três notas
		return (nota1 + nota2 + nota3) / 3;
	}

}