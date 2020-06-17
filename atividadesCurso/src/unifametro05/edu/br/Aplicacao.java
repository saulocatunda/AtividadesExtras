package unifametro05.edu.br;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		int chamada;
		Scanner scanC = new Scanner(System.in);
		System.out.println("1 - Receber pr�prio nome. ");
		System.out.println("2 - Instanciar contador. ");
		System.out.println("3 - Veiculos. ");
		System.out.println("4 - toString. ");
		System.out.println("Digite a aplica��o que deseja executar: ");
		chamada = scanC.nextInt();
		if (chamada > 0) {
			switch (chamada) {
			case 1: {
				String nome;
				Scanner scan = new Scanner(System.in);

				System.out.println("Digite o seu nome: ");
				nome = scan.nextLine();

				System.out.println("O seu nome �: "+nome);
				scan.close();
				break;
			}
			case 2: {
				Contador cont = new Contador();
				Scanner scan = new Scanner(System.in);

				System.out.println("Digite um numero para o contador: ");
				cont.setContadorGeral(scan.nextInt());

				System.out.println("O n�mero digitado �: "+cont.getContadorGeral());
				cont.setZerarContadorGeral();
				System.out.println("Valor do contador zerado: "+cont.getContadorGeral());
				break;
			}
			case 3: {

				VeiculoTerrestre veic = new VeiculoTerrestre(4);
				System.out.println("As caracteristicas do veiculo s�o: "+veic.informarCarac());
				break;
			}
			case 4: {
				VeiculoTerrestre veic = new VeiculoTerrestre(4);
				
				System.out.println(veic.toString());
				break;
			}
			case 5: {
				
			}
				
			default: {
				System.out.println("Nenhuma aplica��o executada.");
				break;
			}
			}
		}
	}
}
