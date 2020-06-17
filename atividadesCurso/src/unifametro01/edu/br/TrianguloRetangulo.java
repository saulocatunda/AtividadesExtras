package unifametro01.edu.br;

import java.text.DecimalFormat;

public class TrianguloRetangulo {
	double base, altura, hipotenusa;
	double area, comprimento;
	public double area() {
		area = (base * altura) /2;
		return area;
	}
	public double comprimento() {
		//Para descobrir o comprimento " maior lado ", devo saber a hipotenusa.
		hipotenusa = Math.pow(base, 2) + Math.pow(altura, 2);
		comprimento = Math.sqrt(hipotenusa);
		return comprimento;
	}
	public void informar() {
		//Limitando o formato do double, para uma melhor exibição.
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		System.out.println("\nSe baseando nos atributos: Base: "+base+" Altura: "+altura+" e hipotenusa: "+decimalFormat.format(comprimento)+" podemos afirmar que;");
		System.out.println("\nA area do TrianguloRetangulo é de: " + area);
		System.out.println("\nO comprimento do TrianguloRetangulo é de: " + decimalFormat.format(comprimento));
	}
}
