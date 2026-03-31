
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
	 * Calcula o imposto com base na renda anual.
	 * 
	 * @return valor do imposto devido
	 */
	public double calcularImposto() {
		if (rendaAnual >= 0 && rendaAnual <= 4000) {
			return 0;
		} else if (rendaAnual <= 9000) {
			return rendaAnual * 0.058;
		} else if (rendaAnual <= 25000) {
			return rendaAnual * 0.15;
		} else if (rendaAnual <= 35000) {
			return rendaAnual * 0.275;
		} else {
			return rendaAnual * 0.3;
		}
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
	 */
	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			System.out.println("Erro, nome inválido");
		} else {
			this.nome = nome;
		}
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
	 */
	public void setCpf(String cpf) {
		if (cpf == null || cpf.length() != 11) {
			System.out.println("Erro, cpf inválido");
		} else {
			this.cpf = cpf;
		}
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
	 */
	public void setUf(String uf) {
		if (uf == null || uf.length() != 2) {
			System.out.println("Erro, uf inválido");
		} else {
			this.uf = uf;
		}
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
	 */
	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual < 0) {
			System.out.println("Erro, renda anual inválida");
		} else {
			this.rendaAnual = rendaAnual;
		}
	}

	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", cpf=" + cpf + ", uf=" + uf + ", rendaAnual=" + rendaAnual + "]";
	}

}
