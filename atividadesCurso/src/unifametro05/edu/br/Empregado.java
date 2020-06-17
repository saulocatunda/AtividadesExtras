package unifametro05.edu.br;

public class Empregado {
	//Atributos
	String nomeEmpregado;
	String depEmpregado;
	int horasTrabMes;
	double salPerHour;
	double salPerHour2;

	//Construtor com parametros
	public Empregado(String nomeEmpregado, String depEmpregado, int horasTrabMes, double salPerHour) {
		super();
		this.nomeEmpregado = nomeEmpregado;
		this.depEmpregado = depEmpregado;
		this.horasTrabMes = horasTrabMes;
		this.salPerHour = salPerHour;
	}

	//Construtor sem parametros
	public Empregado() {

	}
	//Métodos

	public String getNomeEmpregado() {
		return nomeEmpregado;
	}

	public void setNomeEmpregado(String nomeEmpregado) {
		this.nomeEmpregado = nomeEmpregado;
	}

	public String getDepEmpregado() {
		return depEmpregado;
	}

	public void setDepEmpregado(String depEmpregado) {
		this.depEmpregado = depEmpregado;
	}

	public int getHorasTrabMes() {
		return horasTrabMes;
	}

	public void setHorasTrabMes(int horasTrabMes) {
		this.horasTrabMes = horasTrabMes;
	}

	public double getSalPerHour() {
		return salPerHour;
	}

	public void setSalPerHour(double salPerHour) {
		this.salPerHour = salPerHour;
	}

	//Mostrar dados
	public String mDadosEmpregado() {
		return " Nome: "+nomeEmpregado+". Departamento: "+depEmpregado+". Horas trabalhadas (mês): "+horasTrabMes+". Salário por hora: "+salPerHour+".";
	}
	//Calcular salário mensal
	public String calcularSalario1Mes () {

		return " Salário mensal do empregado é: "+(salPerHour * horasTrabMes);
	}
	//Calculr salário mensal 2
	public String calcularSalario2Mes () {

		return " Salário mensal do empregado é: "+(salPerHour2 * horasTrabMes);
	}


}
