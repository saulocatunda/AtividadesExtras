package unifametro02.edu.br;
public class Cliente {
	String nome;
	DataNascimento dataCliente;
	String rg, cpf;
	Endereco enderecoCliente;
	Telefone telefoneCliente;

	public Cliente() {
		this.dataCliente = new DataNascimento();
		this.enderecoCliente = new Endereco();
		this.telefoneCliente = new Telefone();
	}
	public Cliente(String nome,DataNascimento dataCliente,String rg, String cpf, Endereco enderecoCliente, Telefone telefoneCliente){
		this.nome = nome;
		this.dataCliente = dataCliente;
		this.cpf = cpf;
		this.rg = rg;
		this.enderecoCliente = enderecoCliente;
		this.telefoneCliente = telefoneCliente;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public DataNascimento getDataCliente() {
		return dataCliente;
	}
	public void setDataCliente(DataNascimento dataCliente) {
		this.dataCliente = dataCliente;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(Endereco enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public Telefone getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(Telefone telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String imprimirPessoa() {
		return "Nome: " + nome + " Data: "+ dataCliente.infData() + " RG: " +rg+ " CPF: " +cpf+ " Endereço: " + enderecoCliente.infEndereco() +" Telefone: "+ telefoneCliente.infoTel();
	}
}
