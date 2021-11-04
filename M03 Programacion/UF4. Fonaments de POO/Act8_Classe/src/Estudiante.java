
public class Estudiante {
	private String dni;
	private String nom;
	private String cognom;
	private float notaFinal;
	
	//Constructores
	
	public Estudiante() {
		
	}
	
	public Estudiante(String dni, String nom, String cognom, int notaFinal) {
		this.dni = dni;
		this.nom = nom;
		this.cognom = cognom;
		this.notaFinal = notaFinal;
	}
	
	
/*	//Setters y Getters
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public int getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	*/
	
	public String toString() {
		return "DNI: " + this.dni + " Nom: " + this.nom + " Cognom: " + this.cognom + " Nota final: " + this.notaFinal;
	}
}
