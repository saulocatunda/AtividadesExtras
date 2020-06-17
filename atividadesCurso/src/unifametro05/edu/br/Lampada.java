package unifametro05.edu.br;

public class Lampada {
	//Atributos
	int wattsLamp;
	String tipoLamp;
	String corLamp;
	String marcaLamp;
	//Contagem de vezes em que o objeto é criado.
	public static int lampadasVendidas;
	
	Lampada (int wL, String tL, String cL){
		this.wattsLamp = wL;
		this.tipoLamp = tL;
		this.corLamp = cL;
		lampadasVendidas++;
	}
	
	Lampada (){
		lampadasVendidas++;
	}
	// Métodos criados manualmente.
	public int getWattsLamp(){
		return wattsLamp;
	}
	public void setWattsLamp(int wattsLamp) {
		this.wattsLamp = wattsLamp;
	}
	public String getTipoLamp () {
		return tipoLamp;
	}
	public void setTipoLamp (String tipoLamp) {
		this.tipoLamp = tipoLamp;
	}
	public String getCorLamp () {
		return corLamp;
	}
	public void setCorLamp (String corLamp) {
		this.corLamp = corLamp;
	}

	public String getMarcaLamp() {
		return marcaLamp;
	}

	public void setMarcaLamp(String marcaLamp) {
		this.marcaLamp = marcaLamp;
	}

	public static int getLampadasVendidas() {
		return lampadasVendidas;
	}

	public static void setLampadasVendidas(int lampadasVendidas) {
		Lampada.lampadasVendidas = lampadasVendidas;
	}
	
}
