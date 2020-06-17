package unifametro01.edu.br;

import java.util.Scanner;

public class ExecTrianguloRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double leraltura, lerbase = 0;
		TrianguloRetangulo tr1 = new TrianguloRetangulo();
		System.out.println("Seja bem vindo!");
		System.out.println("\nDigite a altura do Triangulo Retangulo: ");
		leraltura = scan.nextDouble();
		tr1.altura = leraltura;
		System.out.println("\nDigite a base do Triangulo Retangulo: ");
		lerbase = scan.nextDouble();
		tr1.base = lerbase;
		tr1.area();
		tr1.comprimento();
		scan.close();
		tr1.informar();
	}
}
