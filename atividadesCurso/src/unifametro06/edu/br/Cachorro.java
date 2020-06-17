package unifametro06.edu.br;

public class Cachorro {
	private String nome, raca;
	
	
	public Cachorro(String nome, String raca) {
		super();
		this.setNome(nome);
		this.setRaca(raca);
	}
	public void latir() {
		
	}
	public void dormir() {
		
	}
	public void comer() {
		
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getRaca() {
		return raca;
	}
	private void setRaca(String raca) {
		this.raca = raca;
	}
	
}
