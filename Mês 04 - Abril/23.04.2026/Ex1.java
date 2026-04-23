
public class Ex1 {

	public static void main(String[] args) {

		// Criação de instâncias de Retangulo com diferentes dimensões
		Retangulo r1 = new Retangulo(4, 5);
		Retangulo r2 = new Retangulo(2, 6);
		Retangulo r3 = new Retangulo(3, 8);
		Retangulo r4 = new Retangulo(1, 23);

		// Instancia o coletâneo, responsável por armazenar e comparar retângulos
		ColetaneoDeRetangulos c1 = new ColetaneoDeRetangulos();

		// Adiciona os retângulos à coleção
		c1.adicionarRetangulo(r1);
		c1.adicionarRetangulo(r2);
		c1.adicionarRetangulo(r3);
		c1.adicionarRetangulo(r4);

		// Utiliza a lógica de comparação baseada em área
		System.out.println(c1.obterRetanguloMaiorArea());

		// Utiliza a lógica de comparação baseada em perímetro
		System.out.println(c1.obterRetanguloMaiorPerimetro());
	}

}
