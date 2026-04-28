public class Ex2 {

	public static void main(String[] args) {

		// Criação de objetos (INSTANCIAÇÃO)
		// Cada "new Flor(...)" cria uma instância da classe Flor
		// ABSTRAÇÃO: estamos representando flores do mundo real como objetos
		Flor f1 = new Flor("Margarida", 10, "Ana");
		Flor f2 = new Flor("Rosa", 30, "Ana");
		Flor f3 = new Flor("Tulipa", 10, "Henrique");
		Flor f4 = new Flor("Cannabis", 100, "Turma de DESI 2025/2");
		Flor f5 = new Flor("Girassol", 15, "Gabriel");

		// Criação de um objeto Floricultura
		// Esse objeto será responsável por gerenciar várias flores
		Floricultura floricultura = new Floricultura();

		// Associação entre objetos
		// Estamos adicionando objetos Flor dentro da Floricultura
		// Relação HAS-A: Floricultura "tem" várias Flores
		floricultura.adicionarFlor(f1);
		floricultura.adicionarFlor(f2);
		floricultura.adicionarFlor(f3);
		floricultura.adicionarFlor(f4);
		floricultura.adicionarFlor(f5);

		// Chamada de método (ENVIO DE MENSAGEM entre objetos)
		// Estamos pedindo para a floricultura retornar apenas as flores de um cliente
		// específico
		// Isso demonstra ENCAPSULAMENTO: não sabemos como a lista é filtrada
		// internamente
		System.out.println(floricultura.obterFloresPorCliente("Gabriel"));

	}

}