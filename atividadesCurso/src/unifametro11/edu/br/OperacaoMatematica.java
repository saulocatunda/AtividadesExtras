package unifametro11.edu.br;

public abstract class OperacaoMatematica {
	protected double a, b;
	
	protected abstract double calcula();

	protected double getA() {
		return a;
	}

	protected void setA(double a) {
		this.a = a;
	}

	protected double getB() {
		return b;
	}

	protected void setB(double b) {
		this.b = b;
	}
	
	
}


