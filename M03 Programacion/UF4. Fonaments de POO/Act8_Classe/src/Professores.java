
public class Professores {
	
	private String nom;
	private String cognom;
	private String formacio;
	
	//Constructores
	
	public Professores(String nom, String cognom, String formacio) {
		this.nom = nom;
		this.cognom = cognom;
		this.formacio = formacio;
	}
	
	public String toString() {
		return this.nom + " Cognom: " + this.cognom + " Formacio: " +  this.formacio;
	}
}
