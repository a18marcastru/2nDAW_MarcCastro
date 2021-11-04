import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introdueix las notas del curso dando la media.");
		
		int notaTotal=0;
		int cont=1;
		float notaActual = input.nextFloat();
		int notaMitja;
		
		while(notaActual!=-1 && cont<=9) {
			notaTotal += notaActual;
			cont++;
			notaActual = input.nextFloat();
		}
		if(cont>=2) {
			notaMitja = notaTotal/10;
			System.out.println("La nota mitja és " + notaMitja);
		}
		else{
			System.out.println("No has puesto ninguna nota valida.");
		}
	}
}