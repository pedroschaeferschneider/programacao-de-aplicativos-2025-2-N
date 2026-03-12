
public class Ex1 {

	public static void main(String[] args) {

		// Instância de um objeto de pessoa
		Pessoa p1 = new Pessoa();
		// Atribuição dos valores
		p1.nome = "Henrique";
		p1.sexo = 'M';
		p1.dataNascimento = "11/10/2001";
		p1.estadoCivil = "Solteiro";

		// Sempre tem que mencionar o objeto e o atributo que quer utilizar
		System.out.println("O seu nome é: " + p1.nome);

		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		p2.sexo = 'F';
		p2.dataNascimento = "14/05/1998";
		p2.estadoCivil = "Casada";

		System.out.println("O nome dela é " + p2.nome);

	}

}
