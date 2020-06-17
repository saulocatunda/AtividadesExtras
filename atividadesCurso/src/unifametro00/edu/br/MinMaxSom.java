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
			vetor[c]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "+msg+"º número.","Digite os 5 Números",3));
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
				JOptionPane.showInternalMessageDialog(null, "O maior numero par é: "+par);
			}else{
				JOptionPane.showInternalMessageDialog(null, "Não há resultados de números par para o seguinte valor: "+par);
			}
			if (impar > 0) {
				JOptionPane.showInternalMessageDialog(null, "O menor numero impar é: "+impar);
			}else {
				JOptionPane.showInternalMessageDialog(null, "Não há resultados de números impar para o seguinte valor: "+impar);
			}
				JOptionPane.showInternalMessageDialog(null, "O somatório dos valores é de: "+somatorio);
				JOptionPane.showInternalMessageDialog(null, "E a média dos valores é de: "+media);
			
		}else {
			JOptionPane.showInternalMessageDialog(null, "Não há resultados de números par ou impar");
			
			
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
