package unifametro02.edu.br;
//Pr�-definido.
public class DataNascimento {
	int dia;
	int mes;
	int ano;
	public DataNascimento() {
		
	}
	public DataNascimento(int d,int m, int a) {
		dia = d;
		mes = m;
		ano = a;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String infData() {
		return dia+"/"+mes+"/"+ano;
	}

}
