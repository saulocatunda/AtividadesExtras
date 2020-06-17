package unifametroAula10.edu.br;

public class Programador extends Funcionario  {
	
	public Programador() {
		
	}
	
	public void aumentaSalario() {
		
		double salario = (getSalario()*20)/100+getSalario();
		setSalario(salario);
	}

}
