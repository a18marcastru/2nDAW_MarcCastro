
public class Persona {

	private String dni;
	private String nom;
	private String cognom;
	private int edat;
	private boolean estatCivil;
	
	//Constructores
	
	//1
	public Persona(){
		
	}
	
	//2
	public Persona(String nomPersona, String cognomPersona){
		this.nom=nomPersona;
		this.cognom=cognomPersona;
	}
	
	//3
	public Persona(String dniPersona, String nomPersona, String cognomPersona, int edatPersona, boolean estatCivilPersona){
		this.dni=dniPersona;
		this.nom=nomPersona;
		this.cognom=cognomPersona;
		this.edat=edatPersona;
		this.estatCivil=estatCivilPersona;
	}
	
	//Getter y Setters
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

	public boolean isEstatCivil() {
		return estatCivil;
	}

	public void setEstatCivil(boolean estatCivil) {
		this.estatCivil = estatCivil;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}
	
	//Metoda Public
	public void Aniversari(){
		this.edat++;
	}
	
	public void Casament(){
		this.estatCivil=true;
	}

	public void Divorci(){
		this.estatCivil=false;
	}
	
	public String toString(){
		  return "Soc " + this.nom + " " + this.cognom + " amb DNI " + this.dni + " tinc " + this.edat + " anys i " + (this.estatCivil==true?"SI":"NO") + " estic casat.";
	}

}