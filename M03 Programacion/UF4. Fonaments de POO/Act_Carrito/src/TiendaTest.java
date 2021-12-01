import java.util.Scanner;

public class TiendaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("MENU"
				+ "\r\n"
				+ "............."
				+ "\r\n"
				+ "1.- Añadir producto \r\n"
				+ "\r\n"
				+ "2.- Ver contenido del carrito \r\n"
				+ "\r\n"
				+ "3.- Salir \r\n");
		
		Scanner input = new Scanner(System.in);
		int opt = input.nextInt();
		String d = "";
		int pre;
		
		Carrito CAPRABO = new Carrito();
		while(opt != 3) {
			switch(opt) {
				case 1: System.out.println("Introduce una descripcion y un precio: ");
						d = input.next();
						pre = input.nextInt();
						CAPRABO.añadirProducto(d, pre);
						break;
				
				case 2: System.out.println(CAPRABO.mostrarCarrito());
					break;
			}
			System.out.println("MENU"
					+ "\r\n"
					+ "............."
					+ "\r\n"
					+ "1.- Añadir producto \r\n"
					+ "\r\n"
					+ "2.- Ver contenido del carrito \r\n"
					+ "\r\n"
					+ "3.- Salir \r\n");
			opt = input.nextInt();
		}
		
		System.out.println("Has salido del programa");
		
	}
}