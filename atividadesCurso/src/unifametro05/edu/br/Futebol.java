package unifametro05.edu.br;
//Não entendo nada de futebol.
public class Futebol {
	//Atributos
	int qtJogadores;
	String nomeTime;
	
		//Construtor com parametros
		public Futebol(int qtJogadores, String nomeTime) {
		super();
		this.qtJogadores = qtJogadores;
		this.nomeTime = nomeTime;
	}
		
		//Construtor sem parametros
		public Futebol() {
			
		}
		//Métodos get-set
		public int getQtJogadores() {
			return qtJogadores;
		}
		public void setQtJogadores(int qtJogadores) {
			this.qtJogadores = qtJogadores;
		}
		public String getNomeTime() {
			return nomeTime;
		}
		public void setNomeTime(String nomeTime) {
			this.nomeTime = nomeTime;
		}	
}
