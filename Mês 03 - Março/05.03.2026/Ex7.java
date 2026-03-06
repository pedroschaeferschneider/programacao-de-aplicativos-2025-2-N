import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número da estação");
		int estacao = input.nextInt();

		if (estacao == 1) {
			// Chama o método para retornar as informações do verão
			System.out.println(retornarVerao());
		} else if (estacao == 2) {
			System.out.println(retornarOutono());
		} else if (estacao == 3) {
			System.out.println(retornarInverno());
		} else if (estacao == 4) {
			System.out.println(retornarPrimavera());
		} else {
			System.out.println("Escolha errada");
		}

	}

	/**
	 * Retorna uma mensagem descrevendo a estação do verão.
	 * 
	 * @return uma String informando que é verão e que o tempo está quente
	 */
	public static String retornarVerao() {
		return "É verão e o tempo está quente";
	}

	/**
	 * Retorna uma mensagem descrevendo a estação do outono.
	 * 
	 * @return uma String informando que é outono e que as folhas estão caindo
	 */
	public static String retornarOutono() {
		return "É outono e as folhas estão caindo";
	}

	/**
	 * Retorna uma mensagem descrevendo a estação do inverno.
	 * 
	 * @return uma String informando que é inverno e que o tempo está frio
	 */
	public static String retornarInverno() {
		return "É inverno e o tempo está frio";
	}

	/**
	 * Retorna uma mensagem descrevendo a estação da primavera.
	 * 
	 * @return uma String informando que é primavera e que as flores estão florindo
	 */
	public static String retornarPrimavera() {
		return "É primavera e as folhas estão florindo";
	}

}