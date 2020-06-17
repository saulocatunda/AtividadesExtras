package unifametroAula10.edu.br;

public abstract class Funcionario {
	private String nome;
	private double salario;
	
	
	public void aumentaSalario() {
		
		double salario = (getSalario()*5)/100+getSalario();
		setSalario(salario);
	}
	
	public void aumentaSalario(double porcentagem) {
		double salario = (getSalario()*porcentagem)/100+getSalario();
		setSalario(salario);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	


}
