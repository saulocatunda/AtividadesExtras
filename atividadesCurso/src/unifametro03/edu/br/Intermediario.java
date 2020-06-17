package unifametro03.edu.br;

import java.util.Scanner;

public class Intermediario {
	Scanner scanEnt = new Scanner(System.in);
	Scanner scanDep = new Scanner(System.in);
	Scanner scanFun = new Scanner(System.in);
	Departamento dep = new Departamento();
	Funcionario fun = new Funcionario();
	Departamento depEspecial = new Departamento(55,"Unifametro");
	boolean funcionamento = true;
	//Atributos
	int especial;
	//Construtor sem parametro
	protected Intermediario() {	
	}
	
	public void receber() {
		System.out.println("A qual departamento o funcionário vai pertencer? \n Especial: 1 - Personalizado: 2 \n Digite o número correspondente.");
		especial = scanEnt.nextInt();
		if (especial == 1) {
			fun.setDepar(depEspecial);
		} else if (especial == 2) {
			System.out.print("Digite o nome do departamento do Funcionário: \n");
			dep.setNome(scanDep.nextLine());
			System.out.print("Digite o codigo do Departamento do Funcionário: \n");
			dep.setCodigo(scanDep.nextInt());
			fun.setDepar(dep);
		}  else {
			this.informarErro();
		}
		System.out.print("Digite o nome do funcionário: \n");
		fun.setNome(scanFun.nextLine());
		System.out.print("Digite a matricula do funcionário: \n");
		fun.setMatricula(scanFun.nextInt());
		
	}

	public String informarDados() {
		return fun.toString();
	}
	public void informarErro() {
		System.out.println("Parametro errado!");
	}

}
