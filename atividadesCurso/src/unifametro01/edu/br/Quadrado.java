package unifametro01.edu.br;

public class Quadrado {
	// Atributo
	double lado, area, comprimento = 0;
	// M�todos
	public double area() {
		area = lado * lado;
		return area;
	}
	public double comprimento() {
		// Considerando que o quadrado tem quatro lados iguais (n�o dando pra definir bem um comprimento), vou considerar que esse comprimento � a soma dos quatro lados.
		comprimento = 4*lado;
		return comprimento;
	}
	public void informar() {
		System.out.println("\nO tamanho do lado informado �: " +this.lado);
		System.out.println("\nA area do quadrado �: "+this.area);
		System.out.println("\nO comprimento do quadrado � de: "+this.comprimento);
		return;
	}
	public void desenhar() {
		System.out.println("\nO formato � o seguinte:");
		System.out.println("\n  -------- ");
		System.out.println("  |      |");
		System.out.println("  |      |");
		System.out.println("  -------- ");
		return;
	}

}

