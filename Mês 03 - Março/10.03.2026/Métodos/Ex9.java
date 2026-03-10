import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número");
		int numero = input.nextInt();

		// Chama o método que verifica se o número é par e imprime o resultado (true ou false)
		System.out.println(determinarParOuImpar(numero));

	}

	/**
	 * Verifica se um número inteiro é par ou ímpar.
	 * 
	 * O método utiliza o operador de módulo (%) para verificar
	 * se o resto da divisão por 2 é igual a 0.
	 * 
	 * @param num número inteiro que será analisado
	 * @return true se o número for par, false se for ímpar
	 */
	public static boolean determinarParOuImpar(int num) {
		// Retorna true se o número for divisível por 2 (par), caso contrário retorna false (ímpar)
		return num % 2 == 0;
	}

}