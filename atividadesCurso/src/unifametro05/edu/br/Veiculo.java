package unifametro05.edu.br;

public class Veiculo {
	//Atributos
	String nomeVeiculo;
	int maxPassageiros;
	String tipoVeiculo;
	String marcaVeiculo;
	String corVeiculo;
	
	//Veiculos (objetos) totais criados pela classe.
	public static int veiculosCriados;
	//Método sem parametros
	public Veiculo() {
		veiculosCriados ++;
		
	}
	//Método com parametros
	public Veiculo(String nomeVeiculo, int maxPassageiros, String tipoVeiculo, String marcaVeiculo,
			String corVeiculo) {
		super();
		this.nomeVeiculo = nomeVeiculo;
		this.maxPassageiros = maxPassageiros;
		this.tipoVeiculo = tipoVeiculo;
		this.marcaVeiculo = marcaVeiculo;
		this.corVeiculo = corVeiculo;
		veiculosCriados ++;
	}
	//Metodos get e set
	public String getNomeVeiculo() {
		return nomeVeiculo;
	}
	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}
	public int getMaxPassageiros() {
		return maxPassageiros;
	}
	public void setMaxPassageiros(int maxPassageiros) {
		this.maxPassageiros = maxPassageiros;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}
	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}
	public String getCorVeiculo() {
		return corVeiculo;
	}
	public void setCorVeiculo(String corVeiculo) {
		this.corVeiculo = corVeiculo;
	}
	public static int getVeiculosCriados() {
		return veiculosCriados;
	}
	public static void setVeiculosCriados(int veiculosCriados) {
		Veiculo.veiculosCriados = veiculosCriados;
	}
	
	
}
