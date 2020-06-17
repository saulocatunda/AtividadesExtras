package unifametro05.edu.br;

public class AutomovelUsado extends VeiculoTerrestre {
	//Atributos.
	int anoCarro;
	String modeloVeiculo;
	double quilometragemRodada;
	String combustivelVeiculo;
	double precoSolicitado;
	
	//Construtor com parametros
	public AutomovelUsado(int qtRodas, int anoCarro, String modeloVeiculo, double quilometragemRodada,
			String combustivelVeiculo, double precoSolicitado, VeiculoTerrestre qtRodasUsado) {
		super(qtRodas);
		this.anoCarro = anoCarro;
		this.modeloVeiculo = modeloVeiculo;
		this.quilometragemRodada = quilometragemRodada;
		this.combustivelVeiculo = combustivelVeiculo;
		this.precoSolicitado = precoSolicitado;

	}
	//Construtor sem parametros
	public AutomovelUsado() {
		
	}
	
	//Métodos
	public int getAnoCarro() {
		return anoCarro;
	}
	public void setAnoCarro(int anoCarro) {
		this.anoCarro = anoCarro;
	}
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	public double getQuilometragemRodada() {
		return quilometragemRodada;
	}
	public void setQuilometragemRodada(double quilometragemRodada) {
		this.quilometragemRodada = quilometragemRodada;
	}
	public String getCombustivelVeiculo() {
		return combustivelVeiculo;
	}
	public void setCombustivelVeiculo(String combustivelVeiculo) {
		this.combustivelVeiculo = combustivelVeiculo;
	}
	public double getPrecoSolicitado() {
		return precoSolicitado;
	}
	public void setPrecoSolicitado(double precoSolicitado) {
		this.precoSolicitado = precoSolicitado;
	}

}
