package unifametro10.edu.br;

public class ExecCliente {
	/**
	 * N�o encontrei essa classe InfoCliente de aula passada, ent�o estou criando.
	 * @author Saulo
	 */
	
	
	public static void main(String[] args) {
		
		InfoCliente cli = new Clientes();
		
		cli.setCpf(125548796);
		cli.setIdade(27);
		cli.setNome("Luiz");
		
		System.out.println("Os dados do cliente: "+cli.dadosCliente());

	}

	
}
