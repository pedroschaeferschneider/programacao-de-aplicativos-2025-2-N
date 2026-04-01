
public class Contribuinte {

	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;

	public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setRendaAnual(rendaAnual);
	}

	/**
	 * Calcula a alíquota de imposto com base na renda anual do contribuinte <br>
	 * 
	 * Pode ser private pois é somente usado na classe Contribuinte
	 *
	 * @return Alíquota correspondente à renda anual
	 * 
	 */
	private double calcularAliquota() {
		if (rendaAnual <= 4000) {
			return 0;
		} else if (rendaAnual <= 9000) {
			return 0.058;
		} else if (rendaAnual <= 25000) {
			return 0.15;
		} else if (rendaAnual <= 35000) {
			return 0.27;
		}
		return 0.3;
	}

	/**
	 * Calcula o valor do imposto devido pelo contribuinte. O cálculo é feito
	 * multiplicando a renda anual pela alíquota correspondente.
	 *
	 * @return Valor do imposto a ser pago
	 */
	public double calcularImposto() {
		return calcularAliquota() * rendaAnual;
	}

	/**
	 * Retorna o nome do contribuinte.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome do contribuinte.
	 * 
	 * <p>
	 * Validação simples para evitar valores nulos ou vazios.
	 * </p>
	 * 
	 * @param nome Nome a ser definido
	 * @throws IllegalArgumentException se o nome for nulo ou vazio
	 */
	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome;
	}

	/**
	 * Retorna o CPF do contribuinte.
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Define o CPF do contribuinte.
	 * 
	 * <p>
	 * Validação básica: deve conter exatamente 11 caracteres.
	 * </p>
	 * 
	 * @param cpf CPF a ser definido
	 * @throws IllegalArgumentException se o CPF for nulo ou não tiver 11 caracteres
	 */
	public void setCpf(String cpf) {
		if (cpf == null || cpf.length() != 11) {
			throw new IllegalArgumentException("Erro, cpf inválido");
		}
		this.cpf = cpf;
	}

	/**
	 * Retorna a UF (estado).
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * Define a UF do contribuinte.
	 * 
	 * <p>
	 * Validação: deve conter exatamente 2 caracteres.
	 * </p>
	 * 
	 * @param uf Estado (UF)
	 * @throws RuntimeException se a UF for nula ou não tiver 2 caracteres
	 */
	public void setUf(String uf) {
		if (uf == null || uf.length() != 2) {
			throw new RuntimeException("Erro, uf inválido");
		}
		this.uf = uf;
	}

	/**
	 * Retorna a renda anual.
	 */
	public double getRendaAnual() {
		return rendaAnual;
	}

	/**
	 * Define a renda anual do contribuinte.
	 * 
	 * <p>
	 * Validação: não pode ser negativa.
	 * </p>
	 * 
	 * @param rendaAnual valor da renda
	 * @throws IllegalArgumentException se a renda anual for negativa
	 */
	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual < 0) {
			throw new IllegalArgumentException("Erro, renda anual inválida");
		}
		this.rendaAnual = rendaAnual;
	}

	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", cpf=" + cpf + ", uf=" + uf + ", rendaAnual=" + rendaAnual + "]";
	}

}
