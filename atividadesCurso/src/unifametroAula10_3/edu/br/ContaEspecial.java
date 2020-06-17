package unifametroAula10_3.edu.br;

public class ContaEspecial extends Conta {

	public ContaEspecial(String nome, int nConta, double sd, double lm) {
		super(nome, nConta, sd, lm);
	}
	
	protected void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	protected boolean saque() {

		if (saldo <= limite*3) {
			return true;
		}else {
			return false;
		}
		
	}
}
