
package unifametro01.edu.br;

/* * @author SauloCatunda
 *  Primeira atividade.
 *  Sei que o código está simples, mas estou me aprofundando no JOptionPane!
 */

import javax.swing.JOptionPane;
public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = null;
		nome = JOptionPane.showInputDialog(null, "Digite seu nome", "digite aqui",3);
		JOptionPane.showMessageDialog(null, "O nome digitado foi: "+nome);
	}
}
