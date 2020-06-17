package unifametro01.edu.br;

import java.util.Scanner;

public class ExecQuadrado {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double recebe = 0.0;
		Quadrado k1 = new Quadrado();
		System.out.println("Digite o tamanho do lado do quadrado: ");
		recebe = scan.nextInt();
		k1.lado = recebe;
		k1.area();
		k1.comprimento();
		k1.informar();
		k1.desenhar();
		scan.close();
	}
}
