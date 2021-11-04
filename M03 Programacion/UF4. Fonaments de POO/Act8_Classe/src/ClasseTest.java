import java.util.Scanner;

public class ClasseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pon el nombre del grupo: ");
		String nom = input.next();
		
		System.out.println("Pon el nombre del Tutor: ");
		String nom = input.next();
		
		System.out.println("Pon el apellido del Tutor: ");
		String  = input.next();
		
		Estudiante alvaro = new Estudiante("1111","Alvaro","Perez",6);
		
		Professores teresa = new Professores("Tereza","Glistau","Programacio");
		
		Grupos DAW = new Grupos("2DAW","Tereza",10);
	
		System.out.println(alvaro);
		
		System.out.println(teresa);
		
		System.out.println(DAW.toString());
	}
}