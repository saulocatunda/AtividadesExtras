package unifametro08.edu.br;

public class Gerente extends Funcionario {

	@Override
	public void aumentarSalario() {
		double salario = getSalario() + (getSalario()* 10)/100;
		setSalario(salario);
	}
}
