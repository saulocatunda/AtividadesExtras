package unifametro00.edu.br;
import javax.swing.JOptionPane;
public class Seletor {
	int valorRec = 0;

	public void seletor() {

		if (valorRec > 0 && valorRec < 3) {
			switch (valorRec) {
			case 1: 
				MinMaxSom mms = new MinMaxSom();
				mms.receber();
				mms.par();
				mms.impar();
				mms.somatorio();
				mms.media();
				mms.mensagem();
				
				break;
			case 2:
				Matriz2x2 mat = new Matriz2x2();
				mat.receberInt();
				mat.matriztotal();
				mat.informar();

				break;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum valor válido digitado! Escolha entre as opções 1 ou 2.","ERRO!",+2);
		}
	}
}
