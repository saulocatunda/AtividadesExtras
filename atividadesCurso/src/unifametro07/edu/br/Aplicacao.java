package unifametro07.edu.br;

public class Aplicacao {

	public static void main(String[] args) {

		ClasseAbstrata c1 = new ClasseConcreta2();

		if (c1 instanceof ClasseConcreta) {
			c1.metodo();
		} else if (c1 instanceof ClasseConcreta2) {
			c1.metodo();
		}
	}

}
