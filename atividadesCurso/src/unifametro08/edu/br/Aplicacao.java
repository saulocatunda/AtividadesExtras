package unifametro08.edu.br;

import java.util.Scanner;
/**
 * 
 * @author saulo
 * Exercício 1 - Aula 9 - LPOO
 */
public class Aplicacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int entrada;

		//Instancias
		Funcionario f1 = new Gerente();
		Funcionario f2 = new Programador();
		//Salário base
		f1.setSalario(5000);
		f2.setSalario(5000);
		f1.setNome("Eliane");
		f2.setNome("Saulo");

		System.out.println("Digite a opção desejada.");
		System.out.println("1 - Imprimir dados Gerente."
				+ "\n2 - Imprimir dados Programador."
				+ "\n3 - Aumentar salário do Gerente."
				+ "\n4 - Aumentar salário do Programador.");
		entrada = scan.nextInt();
		if ( entrada >= 1 && entrada <= 4) {
			switch (entrada) {
			case 1: {
				System.out.println("O gerente se chama: "+f1.getNome()+".");
				break;
			}
			case 2: {
				System.out.println("O programador se chama: "+f2.getNome()+".");
				break;
			}
			case 3: {
				System.out.println("O salário do gerente passou de: "+f1.getSalario()+",");
				f1.aumentarSalario();
				System.out.println("para: "+f1.getSalario()+".");
				break;
			}
			case 4: {
				System.out.println("O salário do programador passou de: "+f2.getSalario()+",");
				f2.aumentarSalario();
				System.out.println("para: "+f2.getSalario()+".");
				break;
			}
			
			}
			scan.close();
		}
	}
}
