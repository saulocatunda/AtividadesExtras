package unifametro05.edu.br;

public class ConversaoDeUnidadesDeArea {
	static double metroQuadrado=1;
	static double peQuadrado=1,milhaQuadrada=1,acre=1;
	static double centimetrosQuadrados=1;

	public ConversaoDeUnidadesDeArea() {

	}



	private double getMetroQuadrado() {
		return metroQuadrado;
	}


	private void setMetroQuadrado(double metroQuadrado) {
		this.metroQuadrado = metroQuadrado;
	}


	private double getPeQuadrado() {
		return peQuadrado;
	}


	private void setPeQuadrado(double peQuadrado) {
		this.peQuadrado = peQuadrado;
	}


	private double getMilhaQuadrada() {
		return milhaQuadrada;
	}


	private void setMilhaQuadrada(double milhaQuadrada) {
		this.milhaQuadrada = milhaQuadrada;
	}


	private double getAcre() {
		return acre;
	}


	private void setAcre(double acre) {
		this.acre = acre;
	}

	public static double peQMetrosQ() {

		return metroQuadrado = (10.76*peQuadrado);
	}
	public static double peQCentimetro() {
		return peQuadrado = (929*centimetrosQuadrados);
	}
	public static double miLacres () {
		return milhaQuadrada = (640*acre);
	}
	
	public static double acRpeQ () {
		return acre = (43.560*peQuadrado);
	}


}
