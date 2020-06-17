package unifametroAula10.edu.br;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		int opcao;
		Scanner scan = new Scanner(System.in);
		
		Funcionario gerente = new Gerente();
		Funcionario programador = new Programador();
		Funcionario analista = new AnalistaDeSistema();
		gerente.setSalario(2000);
		programador.setSalario(2000);
		analista.setSalario(2000);

		System.out.println("Deseja imprimir quais dados?");
		System.out.println("Digite 1 para Gerente.");
		System.out.println("Digite 2 para Programador");
		System.out.println("Digite 3 para Analista");
		opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("O salário do gerente é: "+gerente.getSalario());
			break;
		case 2:
			System.out.println("O salário do programador é: "+programador.getSalario());
			break;
		case 3:
			System.out.println("O salário do analista é: "+analista.getSalario());
		}

		System.out.println("\nQual opção deseja executar?");
		System.out.println("Aumentar salário do Gerente.");
		System.out.println("Aumentar salário do Programador");
		System.out.println("Aumentar salário do Analista");
		opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			gerente.aumentaSalario();
			System.out.println("Novo salario do gerente: "+gerente.getSalario());
			break;
		case 2:
			programador.aumentaSalario();
			System.out.println("Novo salario do programador: "+programador.getSalario());
			break;
		case 3:
			analista.aumentaSalario();
			System.out.println("Novo salario do analista: "+analista.getSalario());
			break;
		}
		scan.close();

	}

}
