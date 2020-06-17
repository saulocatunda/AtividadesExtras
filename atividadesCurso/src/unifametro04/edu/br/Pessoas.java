package unifametro04.edu.br;

public class Pessoas {
	private String nome;
	private int idade;
	public static int contador = 0;
	public Pessoas(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
		contador++;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Pessoas.contador = contador;
	}
	
}
