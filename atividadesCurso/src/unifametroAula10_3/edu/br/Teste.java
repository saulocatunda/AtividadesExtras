package unifametroAula10_3.edu.br;

public class Teste {
	public static void main (String[]args) {
		Conta conta = new ContaEspecial("Pipoco", 787876, 9000,8000);
		Conta conta2 = new Conta("Pipoco", 787876, 9000,8000);
	
		
		System.out.println(conta.saque());
		System.out.println(conta2.saque());
	}
}
