package unifametro04.edu.br;

import javax.swing.JOptionPane;

public class Aplicacao {
	public static void main(String[] args){
		Pessoas p = null;
		for (int i = 0; i < 3; i++) {
			String n = JOptionPane.showInputDialog("Nome:");
			int id = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
			p = new Pessoas(n, id);
			System.out.println(p.getNome());
			System.out.println(p.getIdade());
			

			System.out.println(Pessoas.contador);
			
		}
	}
}