package uf2.activitat2.refaccio;

public class FactorialCastroMarc {
	 
	public static double factorial (double numero) {
 
		double numero2 = numero;
		if (numero2==0)
			return 1;
		else
		{
			double resultat = numero2 * factorial(numero2-1);
			return resultat;
		}
	}
}
