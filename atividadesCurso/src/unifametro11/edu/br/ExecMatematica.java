package unifametro11.edu.br;

public class ExecMatematica {

	public static void main(String[] args) {
		
		OperacaoMatematica oPs = new Soma();
		OperacaoMatematica oPd = new Divisao();
		
		oPs.setA(2);
		oPs.setB(3);
		
		oPd.setA(9);
		oPd.setB(15);

		System.out.println("A soma dos numeros é: "+oPs.calcula());
		
		System.out.println("A divisão dos numeros é: "+oPd.calcula());
		
	}

}
