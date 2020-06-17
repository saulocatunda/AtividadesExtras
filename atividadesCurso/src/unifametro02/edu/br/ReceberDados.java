package unifametro02.edu.br;

import javax.swing.JOptionPane;

public class ReceberDados {
	//Atributos
	DataNascimento dat = new DataNascimento();
	Telefone tel = new Telefone();
	Cliente clt = new Cliente();
	Endereco end = new Endereco();
	//Metodos
	public ReceberDados() {
	}
	public void recdados() {
		clt.setNome(JOptionPane.showInputDialog(null,"Nome do cliente.","Nome",3));
		clt.setCpf(JOptionPane.showInputDialog(null,"CPF do cliente.","CPF",3));
		clt.setRg(JOptionPane.showInputDialog(null,"RG do cliente.","RG",3));
		dat.setDia(Integer.parseInt((JOptionPane.showInputDialog(null,"Dia de nascimento.","Data de Nascimento",3)))); 
		dat.setMes(Integer.parseInt((JOptionPane.showInputDialog(null,"Mes de nascimento.","Data de Nascimento",3))));
		dat.setAno(Integer.parseInt((JOptionPane.showInputDialog(null,"Ano de nascimento.","Data de Nascimento",3))));
		tel.setDdd(Integer.parseInt((JOptionPane.showInputDialog(null,"DDD.","Telefone de contato.",3))));
		tel.setTelefone((Integer.parseInt((JOptionPane.showInputDialog(null,"Telefone.","Telefone de contato.",3)))));
		end.setLogradouro(JOptionPane.showInputDialog(null,"Nome da rua do cliente.","Endereço",3));
		end.setNumeroCasa(JOptionPane.showInputDialog(null,"Numero da casa do cliente.","Endereço",3));
		end.setCidade(JOptionPane.showInputDialog(null,"Cidade do cliente.","Endereço",3));
		end.setBairro(JOptionPane.showInputDialog(null,"Bairro do cliente.","Endereço",3));
		end.setEstado(JOptionPane.showInputDialog(null,"Estado do cliente.","Endereço",3));
	}
	public void informarClt() {
		clt.setEnderecoCliente(end);
		clt.setDataCliente(dat);
		clt.setTelefoneCliente(tel);
		JOptionPane.showInternalMessageDialog(null, clt.imprimirPessoa());
	}
}


