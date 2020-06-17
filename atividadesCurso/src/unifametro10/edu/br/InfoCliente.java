package unifametro10.edu.br;
// Não encontrei essa classe InfoCliente de aula passada, então estou criando.
public abstract class InfoCliente {
	protected String nome;
	protected int idade;
	protected long cpf;

	protected abstract String dadosCliente();

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	protected long getCpf() {
		return cpf;
	}

	protected void setCpf(long cpf) {
		this.cpf = cpf;
	}
		
	
	
	
}
