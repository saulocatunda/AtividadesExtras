package unifametroAula10_2.edu.br;

public class ClienteFidelizacaoEspecial extends ClienteFidelizacao {
	
	public void adicionaBonus() {
		setValorCompra((getValorCompra()*getBonus()+5)/100);
	}
}
