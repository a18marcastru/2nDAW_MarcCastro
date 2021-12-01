package examenUF4;

public abstract class Persona {

	private String nombre;
	private int edad;
	
	//Constructores
	Persona(String n, int e) {
		this.nombre = n;
		this.edad = e;
	}
	
	//Setters y Getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	public void getEdad(int edad) {
		this.edad = edad;
	}
	
	//Metodo publico
	public String imprimirSaludo() {
		return "Soy " + this.nombre + " y mi edad es de " + this.edad + " años";
	}
	
}
