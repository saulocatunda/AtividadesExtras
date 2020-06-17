package unifametro05.edu.br;
/**Professor, não consegui as tarefas relacionadas ao Ponto2D, peço desculpas,
*Também estou passando por um problema, febre, dores e mesmo assim vou tentar resolver o que der pra resolver na tarefa para entregar algo!
*/
public class Ponto2D {
	//Atributos
	int e, f;
	//Construtor com argumento
	public Ponto2D (int a, int b){
		this.e = a; 
		this.f = b; 
	}
	//Construtor sem argumento
	public Ponto2D() {


	}
	//Movendo o ponto
	public void mover (int dx, int dy) {
		e+=dx; f+=dy; 
	}
	//Mostrando a distância.
	double distancia (Ponto2D p){ 
		int dx = this.e - p.e;
		int dy = this.f - p.f;
		return Math.sqrt(dx*dx + dy*dy); 
	}

	//Métodos get e set
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}	

}