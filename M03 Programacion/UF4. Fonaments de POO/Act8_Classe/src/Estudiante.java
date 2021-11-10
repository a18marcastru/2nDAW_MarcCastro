
public class Estudiante {
	private String dni;
	private String nom;
	private String cognom;
	private int notaFinal;
	
	//Constructores
	
	public Estudiante() {
		
	}
	
	public Estudiante(String dni, String nom, String cognom, int notaFinal) {
		this.dni = dni;
		this.nom = nom;
		this.cognom = cognom;
		this.notaFinal = notaFinal;
	}
	
		//Setters y Getters
	
	public int getNotaFinal() {
		return notaFinal;
	}
	
	
	public String toString() {
		return " DNI: " + this.dni + " Nom: " + this.nom + " Cognom: " + this.cognom + " Nota final: " + this.notaFinal;
	}
}
