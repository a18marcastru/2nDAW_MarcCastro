
public class Grupos {
	
	private String nom;
	private Estudiante[] grupos;
	private Professores tutor;
	private int numAlumnes;
	
	//Constructores
	
	public Grupos(String nom,  Professores tutor, int numAlumnes) {
		this.nom = nom;
		this.tutor = tutor;
		this.numAlumnes = 0;
		this.grupos = new Estudiante[numAlumnes];	
	}
	
	public void afegirEstudiante(Estudiante e) {
		this.grupos[this.numAlumnes] = e;
		this.numAlumnes++;
	}
	
	public int numAprovats() {
		int aprovats = 0;
		for(int i = 0;i < numAlumnes;i++) {
			if(this.grupos[i].getNotaFinal()>=5) {
				aprovats++;
			}
		}
		return aprovats;
	}
	
	public Estudiante[] Aprovats() {
		int naprovats = this.numAprovats();
		
		Estudiante[] vAprovats = new Estudiante[naprovats];
		int j = 0;
		for(int i = 0;i < numAlumnes;i++) {
			if(this.grupos[i].getNotaFinal()>=5) {
				vAprovats[j] = this.grupos[i];
				j++;
			}
		}
		return vAprovats;
	}
	
	public String toString() {
		String sortida = "Nom del curs: " + this.nom + ", Tutor: " + this.tutor.toString() + ", " + "\n" + "Cantidad máxima estudiantes: " +  this.grupos.length + ", Cantidad actual de estudiantes: " + this.numAlumnes + "\n";
		
		for(int i = 0;i<numAlumnes;i++) {
			sortida += this.grupos[i];	
		}
		
		return sortida;
	}
}