
public class Profesores {
	
	private String nom;
	private String cognom;
	private String formacio;
	
	//Constructores
	
	public Profesores() {
		
	}
	
	public Profesores(String nom, String cognom, String formacio) {
		this.setNom(nom);
		this.setCognom(formacio);
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

	public String getFormacio() {
		return formacio;
	}

	public void setFormacio(String formacio) {
		this.formacio = formacio;
	}
	
	public String toString() {
		return "";
	}
}
