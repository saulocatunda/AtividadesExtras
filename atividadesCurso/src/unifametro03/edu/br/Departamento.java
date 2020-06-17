package unifametro03.edu.br;

public class Departamento {
	//Atributos
	private int codigo;
	private String nome;
	// Construtor sem parametro
	protected Departamento(){

	}
	//Construtor com parametro
	protected Departamento(int codigo, String nome) {
		this.setCodigo(codigo);
		this.setNome(nome);
	}

	//Metodos de acesso
	protected int getCodigo() {
		return codigo;
	}
	protected void setCodigo(int codigo) {
		if (codigo >= 0) {
			this.codigo = codigo;
		} else {
			System.out.println("Código deve ser um número natural.");
			this.encerrarDep();

		}

	}
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		if (nome.length() != 0 && nome != null) {
			this.nome = nome;
		} else {
			System.out.println("Nome do departamento inválido (O campo não pode estar vazio ou nulo)");	
		this.encerrarDep();
		}

	} 
	@Override
	//Retorno
	public String toString(){

		return " Código do Departamento: "+codigo+"."+" Nome do Depepartamento: "+nome;
	}
	public void encerrarDep() {
		System.out.println("\nEncerrando programa.");
		System.exit(0);
	}
}
