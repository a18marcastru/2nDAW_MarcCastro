package examenUF4;

public class Empleado extends Persona {
	
	private int numEmpleado;
	private int sueldo;
	private int totalEmpleados = 14;
	
	//Constructores
	Empleado(String n, int e, int ne, int s) {
		super(n,e);
		this.numEmpleado = ne;
		this.sueldo = s;
		this.totalEmpleados++;
	}

	//Setters y Getters
	
	//En la tercera comprobacion retire setters y getters de nombre y sueldo y pasarlo a Persona.

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	//Metodos publicos
	public int aumentarSueldo() {
		return this.sueldo = (int) (sueldo*1.10);
	}
	
	public String toString() {
		return super.imprimirSaludo() + ", Numero de empleado: " + this.numEmpleado + ", Sueldo: " + this.sueldo + "€" + ", Empleados totales " + this.totalEmpleados;
	}
	
}
