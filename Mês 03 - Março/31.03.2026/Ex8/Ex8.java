
public class Ex8 {

	public static void main(String[] args) {

		Contribuinte c1 = new Contribuinte("Joãozinho", "11111111111", "SC", 2000);
		Contribuinte c2 = new Contribuinte("Maria", "11111111111", "SC", 5000);
		Contribuinte c3 = new Contribuinte("Ana", "11111111111", "SC", 10000);
		Contribuinte c4 = new Contribuinte("Jobson", "11111111111", "SC", 27000);
		Contribuinte c5 = new Contribuinte("Roberto", "11111111111", "SC", 50000);

		Contribuinte vetorContribuintes[] = { c1, c2, c3, c4, c5 };

		double maiorImpostoAPagar = 0;
		Contribuinte contribuinteMaiorImposto = null;

		for (int i = 0; i < vetorContribuintes.length; i++) {
			if (vetorContribuintes[i].calcularImposto() > maiorImpostoAPagar) {
				maiorImpostoAPagar = vetorContribuintes[i].calcularImposto();
				contribuinteMaiorImposto = vetorContribuintes[i];
			}
		}

		System.out.println(contribuinteMaiorImposto);

		double totalImpostoArrecadado = 0;

		for (int i = 0; i < vetorContribuintes.length; i++) {
			totalImpostoArrecadado += vetorContribuintes[i].calcularImposto();
		}

		System.out.println(totalImpostoArrecadado);

	}

}
