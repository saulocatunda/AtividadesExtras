/*
 * @saulocatunda
 */
package unifametro00.edu.br;
import javax.swing.JOptionPane;
public class Executor {

	public static void main(String[] args) {
		Seletor select = new Seletor();
		select.valorRec=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a op��o desejada","Op��o 1 (Par ou Impar) || Op��o 2 (Matrix 2x2)",1));
		select.seletor();
		
		
	}

}
