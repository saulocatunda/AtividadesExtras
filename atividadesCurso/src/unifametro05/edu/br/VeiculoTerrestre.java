package unifametro05.edu.br;
//Parei no 23
public class VeiculoTerrestre extends Veiculo {
	//atributos

	int qtRodas;
	
	
	//Construtor com parametro
	public VeiculoTerrestre(int qtRodas) {
		super("GOL-G4",5,"Hatch","Volks","Preto");
		this.qtRodas = qtRodas;
	}
	//Construtor sem parametro
	public VeiculoTerrestre() {
		
	}
	//Metodo get e set
	public int getQtRodas () {
		return qtRodas;
	}
	
	public void setQtRodas(int qtRodas) {
		this.qtRodas = qtRodas;
	}
	
	public String informarCarac() {
		return " Nome veiculo: "+nomeVeiculo+". Max Pass: "+maxPassageiros+". Tipo: "+tipoVeiculo+". Marca: "+marcaVeiculo+". Cor veiculo: "+corVeiculo+ ". Qnt Rodas: "+qtRodas;
	}
	//Teste
}
