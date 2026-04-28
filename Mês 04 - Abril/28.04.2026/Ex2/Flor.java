// Classe representa um modelo (entidade) do mundo real: uma Flor
// Isso é um exemplo de ABSTRAÇÃO
public class Flor {

	// Atributos privados (ENCAPSULAMENTO)
	// O acesso direto é restrito, sendo feito via métodos getters e setters
	private String nomeFlor;
	private double preco;
	private String nomeCliente;

	// Construtor: método especial usado para inicializar o objeto
	// Garante que o objeto já nasce em um estado válido
	public Flor(String nomeFlor, double preco, String nomeCliente) {
		setNomeFlor(nomeFlor); // uso de setter (reaproveitamento de validação)
		setPreco(preco);
		setNomeCliente(nomeCliente);
	}

	// Getter: fornece acesso controlado ao atributo (ENCAPSULAMENTO)
	public String getNomeFlor() {
		return nomeFlor;
	}

	// Setter: permite modificar o atributo com validação
	// Protege a integridade do objeto (ENCAPSULAMENTO + VALIDAÇÃO)
	public void setNomeFlor(String nomeFlor) {
		if (nomeFlor == null || nomeFlor.isBlank()) {
			throw new IllegalArgumentException("Nome da flor inválida");
		}
		this.nomeFlor = nomeFlor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		// Regra de negócio: preço deve ser positivo
		if (preco <= 0) {
			throw new IllegalArgumentException("Preço inválido");
		}
		this.preco = preco;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		if (nomeCliente == null || nomeCliente.isBlank()) {
			throw new IllegalArgumentException("Nome do cliente inválido");
		}
		this.nomeCliente = nomeCliente;
	}

	// Sobrescrita de método (POLIMORFISMO)
	// toString() já existe em Object, aqui estamos customizando seu comportamento
	@Override
	public String toString() {
		return "Flor [nomeFlor=" + nomeFlor + ", preco=" + preco + ", nomeCliente=" + nomeCliente + "]";
	}

}