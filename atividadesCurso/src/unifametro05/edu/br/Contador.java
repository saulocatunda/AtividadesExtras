package unifametro05.edu.br;

public class Contador {
	//Atributo, static
	private static int contadorGeral=0;

	protected Contador() {
		this.contadorGeral=contadorGeral+0;
	}

	protected Contador (int contIni) {
		this.contadorGeral = contIni;
		this.contadorGeral = contIni+1;
	}
	protected static int getContadorGeral() {
		return contadorGeral;
	}

	protected static void setZerarContadorGeral() {
		Contador.contadorGeral = 0;
	}

	protected static void setContadorGeral(int contadorGeral) {
		Contador.contadorGeral = contadorGeral;
	}

	protected static int imprimirValor() {
		return contadorGeral;
	}

}
