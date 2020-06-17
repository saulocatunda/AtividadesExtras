package unifametro02.edu.br;

public class Endereco {
	String logradouro;
	String numeroCasa;
	String bairro;
	String cidade;
	String estado;
	public Endereco() {

	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String infEndereco() {
		
		return "Rua "+logradouro+ ","+ numeroCasa+" Bairro: "+bairro+" Cidade: "+cidade+" Estado: "+estado;
	}

}
