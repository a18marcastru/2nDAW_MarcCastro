import java.util.Scanner;

public class ClasseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pon el nombre del grupo: ");
		String nomG = input.next();
		
		System.out.println("Pon el nombre del Tutor: ");
		String nomP = input.next();
		
		System.out.println("Pon el apellido del Tutor: ");
		String cognomP = input.next();
		
		System.out.println("Pon la formacion del Tutor: ");
		String formacioP = input.next();
		
		Professores profe = new Professores(nomP,cognomP,formacioP);
		
		System.out.println("Dime cuantos alumnos hay: ");
		int numalu = input.nextInt();
		
		Grupos DAW = new Grupos(nomG,profe,numalu);
		
		for(int i = 0;i < numalu;i++) {
			System.out.println("Pon el DNI del alumno: ");
			String dni = input.next();
			
			System.out.println("Pon el nombre del alumno: ");
			String nomA = input.next();
			
			System.out.println("Pon el apellido del alumno: ");
			String cognomA = input.next();
			
			System.out.println("Pon la notafinal: ");
			int notaA = input.nextInt();
			
			Estudiante alum = new Estudiante(dni,nomA,cognomA,notaA);

			DAW.afegirEstudiante(alum);
		}
		
		System.out.println(DAW.toString());
	}
}