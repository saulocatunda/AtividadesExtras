package unifametro08.edu.br;

public class Programador extends Funcionario {
	public void aumentarSalario() {
		double salario = getSalario() + (getSalario()* 20)/100;
		setSalario(salario);
	}
}
