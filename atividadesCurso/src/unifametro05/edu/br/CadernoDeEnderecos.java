package unifametro05.edu.br;

public class CadernoDeEnderecos {
	//Atributos
	String nomePessoa;
	double telefonePessoa;
	String emailPessoa;
	String enderecoPessoa;

	//Construtores, com e sem parametros
	public CadernoDeEnderecos(String nomePessoa, double telefonePessoa, String emailPessoa, String enderecoPessoa) {

		this.nomePessoa = nomePessoa;
		this.telefonePessoa = telefonePessoa;
		this.emailPessoa = emailPessoa;
		this.enderecoPessoa = enderecoPessoa;
	}

	public CadernoDeEnderecos() {

	}
	//Métodos get e set
	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public double getTelefonePessoa() {
		return telefonePessoa;
	}

	public void setTelefonePessoa(double telefonePessoa) {
		this.telefonePessoa = telefonePessoa;
	}

	public String getEmailPessoa() {
		return emailPessoa;
	}

	public void setEmailPessoa(String emailPessoa) {
		this.emailPessoa = emailPessoa;
	}

	public String getEnderecoPessoa() {
		return enderecoPessoa;
	}

	public void setEnderecoPessoa(String enderecoPessoa) {
		this.enderecoPessoa = enderecoPessoa;
	}






}
