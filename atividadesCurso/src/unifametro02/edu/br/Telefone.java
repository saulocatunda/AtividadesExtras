package unifametro02.edu.br;
public class Telefone {
	int telefone;
	int ddd;
	Telefone(){
	}
	
	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String infoTel() {
		return String.valueOf(ddd) +"-"+String.valueOf(telefone);
	}
}
