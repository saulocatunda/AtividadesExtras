package unifametroAula10.edu.br;

public class Gerente extends Funcionario {

	
	public Gerente() {
		
	}
	public void aumentaSalario() {
		
		double salario = (getSalario()*10)/100+getSalario();
		setSalario(salario);
	}
	
}
