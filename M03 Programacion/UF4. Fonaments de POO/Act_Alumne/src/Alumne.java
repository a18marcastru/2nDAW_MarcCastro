

public class Alumne {

	//Part 1
	/*public void saluda(String nom, int edat){
		// TODO Auto-generated method stub
		System.out.println("Hola, s�c un alumne i em dic " + nom + " i tinc " + edat + " anys.");
	}*/
	
	//Part 2
	/*private String nom;
	private int edat;
	
	Alumne(String elnom, int la_edat){
		nom=elnom;
		edat=la_edat;
	}
	
	public void saluda(){
		// TODO Auto-generated method stub
		System.out.println("Hola, s�c un alumne i em dic " + nom + " i tinc " + edat + " anys.");
	}*/
	
	//Part 3
	/*private String nom;
	
	public void setNom(String nouNom){
		nom = nouNom;
	}
	
	public String getNom(){
		return nom; 
	}
	
	public void saluda(){
		// TODO Auto-generated method stub
		System.out.println("Hola, s�c un alumne i em dic " + nom);
	}*/
	
	//Part 4
	//variable d'inst�ncia del tipus int
	/*private int edat = 18;
	//variable d'inst�ncia del tipus String
	private String nom;
	//m�tode GET per a recuperar l'edat de l'alumne
	public int getEdat() {
	return edat;
	}
	//m�tode SET per a assignar una edat a l'alumne
	public void setEdat(int novaEdat) {
	edat = novaEdat;
	}
	//m�tode SET per a assignar un nom a l'alumne
	public void setNom(String nouNom) {
	nom = nouNom;
	}
	//m�tode GET per a recuperar el nom de l'alumne
	public String getNom() {
	return nom;
	}
	public void saluda() {
	System.out.println("Hola, s�c en/la "
	+ nom + " i tinc " + edat + " anys");
	// System.out.println("Hola, s�c en/la " + getNom()
	// + " i tinc " + getEdat() + " anys");
	}*/
	
	private int edat;
	private String nom;
	//constructor que si jo no l'hagu�s
	//definit, hi hauria fet el compilador
	public Alumne() {
	}
	public int getEdat() {
	return edat;
	}
	public void setEdat(int novaEdat) {
	edat = novaEdat;
	}
	public void setNom(String nouNom) {
	nom = nouNom;
	}
	public String getNom() {
	return nom;
	}
	public void saluda() {
	System.out.println("Hola, s�c en/la " + nom
	+ " i tinc " + edat + " anys");
	}
}