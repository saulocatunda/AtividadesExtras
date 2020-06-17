package unifametro05.edu.br;

public class ConversaoDeUnidadesDeVolume {
	static double litro,metroCubico,galaoAmericano;
	static double polegadasCubico, pesCubico,cenCubico;

	public ConversaoDeUnidadesDeVolume() {

	}

	private static double getLitro() {
		return litro;
	}

	private static void setLitro(double litro) {
		ConversaoDeUnidadesDeVolume.litro = litro;
	}

	private static double getMetroCubico() {
		return metroCubico;
	}

	private static void setMetroCubico(double metroCubico) {
		ConversaoDeUnidadesDeVolume.metroCubico = metroCubico;
	}

	private static double getGalaoAmericano() {
		return galaoAmericano;
	}

	private static void setGalaoAmericano(double galaoAmericano) {
		ConversaoDeUnidadesDeVolume.galaoAmericano = galaoAmericano;
	}

	private static double getPolegadasCubico() {
		return polegadasCubico;
	}

	private static void setPolegadasCubico(double polegadasCubico) {
		ConversaoDeUnidadesDeVolume.polegadasCubico = polegadasCubico;
	}

	private static double getPesCubico() {
		return pesCubico;
	}

	private static void setPesCubico(double pesCubico) {
		ConversaoDeUnidadesDeVolume.pesCubico = pesCubico;
	}

	private static double getCenCubico() {
		return cenCubico;
	}

	private static void setCenCubico(double cenCubico) {
		ConversaoDeUnidadesDeVolume.cenCubico = cenCubico;
	}

	public static double cenLitro() {
		return litro = (1000*cenCubico);
	}
	public static double litMetroC () {
		return metroCubico = (1000*litro);
	}

	public static double peMetroC () {
		return metroCubico = (35.32*pesCubico);
	}

	public static double poleGcubico () {
		return galaoAmericano = (231*polegadasCubico);
	}

	public static double litGcubico () {
		return galaoAmericano = (3.785*litro);
	}


}


