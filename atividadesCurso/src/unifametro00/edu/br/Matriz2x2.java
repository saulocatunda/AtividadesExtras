package unifametro00.edu.br;
import javax.swing.JOptionPane;
public class Matriz2x2 {

	int[][] matriz0 = new int [2][2];
	int[][] matriz1 = new int [2][2];
	int[][] matriztotal = new int[2][2];

	public void receberInt() {
		for (int g=0; g<matriz0.length;g++) {
			for (int e=0; e<matriz0.length;e++) {
				matriz0[g][e]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor inteiro para 'Matriz 0' Posição -> "+g+" | "+e+"","Somente Inteiros",3));
			}
		}
		for (int g=0; g<matriz1.length;g++) {
			for (int e=0; e<matriz1.length;e++) {
				matriz1[g][e]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor inteiro para 'Matriz 1' Posição -> "+g+" | "+e+"","Somente Inteiros",3));
			}
		}

	}

	public void matriztotal() {
		for (int g=0; g<matriztotal.length;g++) {
			for (int e=0; e<matriztotal.length;e++) {
				matriztotal[g][e] = matriz0[g][e] + matriz1[g][e];
			}
		}


	}

	public void informar() {
			JOptionPane.showMessageDialog(null,"A soma das duas matrizes: \n"+"|"+matriztotal[0][0]+"|"+matriztotal[0][1]+"|"+"\n|"+matriztotal[1][0]+"|"+matriztotal[1][1]+"|","MatrizTotal",1);
		
	}


}

