package unifametroAula10_2.edu.br;

public class ClienteFidelizacao extends Cliente {
	private double bonus = 5;
	private String validade;
	
	public void adicionaBonus() {
		setValorCompra(getValorCompra()*bonus/100);
	}

	protected double getBonus() {
		return bonus;
	}

	protected void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	
}
