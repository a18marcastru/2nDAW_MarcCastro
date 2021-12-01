package examenUF4;

public class PP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("COMPROBACION EJERCICIO 1");
		
		Empleado em	= new Empleado("Marc",29, 15, 3000);
		
		System.out.println(em.toString());
		
		em.aumentarSueldo();
		
		System.out.println("Sueldo actualizado:\n" + em.toString());
		
		System.out.println("\nCOMPROBACION EJERCICIO 2");
		
		Ejecutivo ej = new Ejecutivo("Jordi",25, 12, 1500, 10000);
		
		System.out.println(ej.toString());
		
		System.out.println("\nCOMPROBACION EJERCICIO 3");
		
		Empleado em2 = new Empleado("Alex",26, 16, 2300);
		
		System.out.println(em2.imprimirSaludo());
		
	}
}
