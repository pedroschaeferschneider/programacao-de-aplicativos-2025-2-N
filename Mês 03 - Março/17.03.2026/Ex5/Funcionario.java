/**
 * Classe que representa um funcionário de uma empresa. Armazena informações
 * básicas como identificação, nome e salário, além de fornecer operações
 * relacionadas ao salário e nome completo.
 */
public class Funcionario {

	String identificacao;

	String nome;

	String sobrenome;

	double salario;

	/**
	 * Calcula o salário anual do funcionário com base no salário mensal.
	 *
	 * @return o salário anual (salário mensal multiplicado por 12)
	 */
	public double obterSalarioAnual() {
		return salario * 12;
	}

	/**
	 * Retorna o nome completo do funcionário.
	 *
	 * @return uma String contendo o nome e sobrenome concatenados
	 */
	public String obterNomeCompleto() {
		return nome + " " + sobrenome;
	}

	/**
	 * Aplica um aumento percentual ao salário do funcionário.
	 *
	 * @param - percentualAumento percentual de aumento a ser aplicado (ex: 10 para
	 *          10%)
	 */
	public void modificarSalario(double percentualAumento) {
		double aumento = salario * percentualAumento / 100;
		double salarioFinal = salario + aumento;
		salario = salarioFinal;
	}

}