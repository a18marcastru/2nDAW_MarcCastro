package uf2.activitat2.refaccio;

public class FactorialCastroMarc2 {

	private static int nre;

	public static double factorial (double numero) {
	
		if (numero==0)
			return 1;
		else
		{
			double resultat = numero * factorial(numero-1);
			return resultat;
		}
	}

	public static void main(String[] args) {
	
		nre = 3;
		
		String text = "El factorial de ";
		System.out.println(text  + nre + " és " + factorial(nre));
		nre = 5;
		System.out.println(text  + nre + " és " + factorial(nre));
	}

}
