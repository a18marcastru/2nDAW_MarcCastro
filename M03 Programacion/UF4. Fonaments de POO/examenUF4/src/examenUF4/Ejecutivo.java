package examenUF4;

public class Ejecutivo extends Empleado{

	private int presupuesto;
	
	
	//Constructores
	Ejecutivo(String n, int e, int ne, int s, int p) {
		super(n,e,ne,s);
		this.presupuesto = p;
	}
	
	//Metodo publico
	public String toString() {
		return super.toString() + ", Presupuesto: " + this.presupuesto + "€";
	}
	
	
}
