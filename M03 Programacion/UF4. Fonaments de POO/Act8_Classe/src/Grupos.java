
public class Grupos {
	
	private String nom;
	private Estudiante[] grupos;
	private String tutor;
	private int numAlumnes;
	private int numApro = 0;
	
	//Constructores
	
	Grupos(String nom,  String tutor, int numAlumnes) {
		this.nom = nom;
		this.tutor = tutor;
		this.numAlumnes = 0;
		this.grupos = new Estudiante[numAlumnes];	
	}
	
	public void afegirEstudiante(Estudiante e) {
		this.grupos[this.numAlumnes] = e;
		this.numAlumnes++;
	}
	
	public String toString() {
		String sortida = "Nom del curs: " + this.nom + 
		", Tutor: " + this.tutor + ", Alumnos: " +  this.numAlumnes 
		+
	}
}