
import java.util.Scanner;

public class CercleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce las opciones del 1 a 6"
				+ "\r\n"
				+ "1.- Crear un cercle d'un radi determinat i d'un color determinat \r\n"
				+ "\r\n"
				+ "2.- Crear un cercle d'un radi determinat \r\n"
				+ "\r\n"
				+ "3.- Mostrar últim cercle creat \r\n"
				+ "\r\n"
				+ "4.- Mostrar perímetre últim cercle creat \r\n"
				+ "\r\n"
				+ "5.- Mostrar àrea últim cercle creat \r\n"
				+ "\r\n"
				+ "6.- Sortir");
		
		Scanner input = new Scanner(System.in);
		int opt = input.nextInt();
		float radi;
		String color;
		Cercle c = null;
		
		while(opt!=6){
			switch(opt){
				case 1: System.out.println("Introduce un radio y un color: ");
					radi = input.nextFloat();
					color = input.next();
					c = new Cercle(radi,color);
					System.out.println(c.toString());
					break;
				
				case 2: System.out.println("Introduce un radio: ");
					radi = input.nextFloat();
					c = new Cercle(radi);
					System.out.println(c.toString());
					break;
					
				case 3: System.out.println("Aqui tienes el ultimo circulo: " + "\r\n" + c.toString() + "\r\n");
					break;
				
				case 4: System.out.println("Aqui tienes el ultimo parametre " + c.parametre() + "\r\n");
					break;
				
				case 5: System.out.println("Aqui tienes el ultimo area " + c.area() + "\r\n");
					break;
			}
			
			System.out.println("Introduce las opciones del 1 a 6"
					+ "\r\n"
					+ "1.- Crear un cercle d'un radi determinat i d'un color determinat \r\n"
					+ "\r\n"
					+ "2.- Crear un cercle d'un radi determinat \r\n"
					+ "\r\n"
					+ "3.- Mostrar últim cercle creat \r\n"
					+ "\r\n"
					+ "4.- Mostrar perímetre últim cercle creat \r\n"
					+ "\r\n"
					+ "5.- Mostrar àrea últim cercle creat \r\n"
					+ "\r\n"
					+ "6.- Sortir");
			
			opt=input.nextInt();
		}
		System.out.println("Salistes del programa.");
	}

}