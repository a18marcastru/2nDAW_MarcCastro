
import java.util.Scanner;

public class AlumneTest {
	
	//Part 1
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumne alumne1 = new Alumne();
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introdueix el nom de l'alumne: ");
		
		String nomAlumne = input.nextLine();
		
		System.out.println();
		
		System.out.println("Quina es la teva edat? ");
		
		int edatAlumne = input.nextInt();
		
		System.out.println();
		
		alumne1.saluda(nomAlumne, edatAlumne);
	}*/
	
	//Part 2
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumne alumne1 = new Alumne("Timur", 20);
		Alumne alumne2 = new Alumne("Joan", 19);
		
		alumne1.saluda();
		alumne2.saluda();
	}*/
	
	//Part 3 i 4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumne alumne1 = new Alumne();
		
		alumne1.setNom("Pedro");
		
		alumne1.setEdat(36);
		
		alumne1.saluda();
		
		Alumne alumne2 = new Alumne();
		
		alumne2.setNom("María");
		
		alumne2.setEdat(34);
		
		alumne2.saluda();
		
		Alumne alumne3 = new Alumne();
		
		alumne3.saluda();
	}
}
