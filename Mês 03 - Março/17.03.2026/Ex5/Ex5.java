
public class Ex5 {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.identificacao = "8185185";
		f1.nome = "Kléber";
		f1.sobrenome = "Da Silva";
		f1.salario = 4000;

		System.out.println(
				"O funcionário " + f1.obterNomeCompleto() + " terá um salário anual de R$" + f1.obterSalarioAnual());

		System.out.println("Salário atual R$" + f1.salario);
		// Chama o método que modifica o salário
		f1.modificarSalario(5);
		System.out.println("Novo salário: R$" + f1.salario);

	}

}
