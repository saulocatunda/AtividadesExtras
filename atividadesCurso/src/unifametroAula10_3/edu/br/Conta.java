package unifametroAula10_3.edu.br;
//Mês de quarentena me deixando exausto, estou tendo pouco de dificuldade em compreender.
public class Conta {
	String nomeCliente;
	int numeroConta;
	double saldo;
	double limite;
	
	public Conta(String nome, int nConta, double sd, double lm) {
		setNomeCliente(nome);
		setNumeroConta(nConta);
		setSaldo(sd);
		setLimite(lm);
		
	}
	
	protected String getNomeCliente() {
		return nomeCliente;
	}
	
	protected void setNomeCliente(String nomeC) {
		this.nomeCliente = nomeC;
	}
	
	protected int getNumeroConta() {
		return numeroConta;
	}
	
	protected void setNumeroConta(int nConta) {
		this.numeroConta = nConta;
	}
	
	protected double getSaldo() {
		return saldo;
	}
	
	protected void setSaldo(double saldoC) {
		this.saldo = saldoC;
	}
	
	protected double getLimite() {
		return limite;
	}
	
	protected void setLimite( double limiteC) {

		this.limite = limiteC;
	}
	
	protected void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	protected boolean saque() {

		if (saldo <= limite) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
