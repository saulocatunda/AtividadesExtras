package unifametro00.edu.br;
import javax.swing.JOptionPane;
public class MinMaxSom {
	int par,impar,soma,contador,receber = 0;
	double somatorio, media =0;
	String msg = null;
	int[] vetor = new int[5];

	
	public int receber() {
		for (int c=0; c<vetor.length;c++){
			msg = Integer.toString(c+1);
			vetor[c]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "+msg+"� n�mero.","Digite os 5 N�meros",3));
		}
		return receber;
	}
	public int par() {
		for (int g=0;g<vetor.length;g++){
			if (vetor[g] % 2 == 0){
				par = vetor[g];
			}
			contador++;
		}
		return par;
	}
	public int impar() {
		for (int h = contador-1;h>=0;h--){
			if (vetor[h] % 2 != 0) {
				impar = vetor[h];
			}
		}
		return impar;
	}
	public void mensagem() {
		if (par > 0 || impar > 0) {
			if (par > 0) {
				JOptionPane.showInternalMessageDialog(null, "O maior numero par �: "+par);
			}else{
				JOptionPane.showInternalMessageDialog(null, "N�o h� resultados de n�meros par para o seguinte valor: "+par);
			}
			if (impar > 0) {
				JOptionPane.showInternalMessageDialog(null, "O menor numero impar �: "+impar);
			}else {
				JOptionPane.showInternalMessageDialog(null, "N�o h� resultados de n�meros impar para o seguinte valor: "+impar);
			}
				JOptionPane.showInternalMessageDialog(null, "O somat�rio dos valores � de: "+somatorio);
				JOptionPane.showInternalMessageDialog(null, "E a m�dia dos valores � de: "+media);
			
		}else {
			JOptionPane.showInternalMessageDialog(null, "N�o h� resultados de n�meros par ou impar");
			
			
		}

	}
	public double somatorio() {
		for (int e=0;e < vetor.length;e++) {
			somatorio = somatorio + vetor[e];
			
		}
		return somatorio;
	}
	public double media() {
		media = somatorio / vetor.length;
		return media;
	}
}
