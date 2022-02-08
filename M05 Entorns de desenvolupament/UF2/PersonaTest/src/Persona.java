/**
 * Esta clase esta enfocado en trabajar con la informacion del usuario. 
 * @author Marc
 * @version 2022
 */
public class Persona {
	/**
	 * Aqui estan los atributos que contendran la informacion del usuario de manera privada.
	 */
	private String dni;
	private String nom;
	private String cognom;
	private int edat;
	private boolean estatCivil;
	
	/**
	 * Aqui estan los constructores que gestionaran la informacion recibida con los parametros que establecemos.
	 * @param edat = 10 tiene la atributo definido en caso de no tener la informacion de la edat, se pondra el numero 10.
	 */
	Persona(){
		this.edat=10;
	}
	Persona(String nom, String cognom){
		this.nom=nom;
		this.cognom=cognom;
	}
	Persona(String dni, String nom, String cognom, int edat, boolean estat){
		this.dni=dni;
		this.nom=nom;
		this.cognom=cognom;
		this.edat=edat;
		this.estatCivil=estat;
	}
	
	/**
	 * Los Setters y Getters para acceder a los atributos privados para poder modificar la informacion y devolverlo.
	 * @param dni en el public void setDni(String dni) es donde recibe la informacion y lo introduce al atributo privado.
	 * @return dni en el public String getDni() devuelve la informacion introducido.
	 */
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
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
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
	
	/**
	 * En esta parte estan los metodos publicos es decir las acciones a la informacion recibida.
	 * @param edat en el public void Aniversari() es para sumar la edat en caso que sea su aniversario.
	 * @param estatCivil en el public void Casament() o public void Divorci() es para decir que la informacion recibida es falso o verdadero.
	 */
	public void Aniversari() {
		this.edat++;
	}
	public void Casament() {
		this.estatCivil=true;
	}
	public void Divorci() {
		this.estatCivil=false;
	}
	
	/**
	 * Despues de recibir la informacion, pasando por los constructores, 
	 * getters y setters y por los metodos publicos, se devolvera un mensaje con la informacion pero con algunos cambios en caso de la edat, estatCivil...
	 */
	public String toString() {
		return ("Soc " + this.nom + " " +
		this.cognom
		+ " amb DNI" + this.dni
		+ " tinc " + this.edat + " anys i "
		 + (this.estatCivil==true?" SI ":" NO ")
		 + " estic casat");
	}
}
