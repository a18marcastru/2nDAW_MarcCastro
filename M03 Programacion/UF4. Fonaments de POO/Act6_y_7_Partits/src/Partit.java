
public class Partit {

	private String nomEquipLocal;
	private String nomEquipVisitant;
	private int golsEquipLocal;
	private int golsEquipVisitant;
	
	
	//Constructores
	Partit(String e1, String e2) {
		this.nomEquipLocal = e1;
		this.nomEquipVisitant = e2;
		this.golsEquipLocal = 0;
		this.golsEquipVisitant = 0;
	}
	
	Partit(String e1, String e2, int g1, int g2) {
		this.nomEquipLocal = e1;
		this.nomEquipVisitant = e2;
		this.golsEquipLocal = g1;
		this.golsEquipVisitant = g2;
	}
	
	
	//Modulos publicos
	public void marcaEquipLocal() {
		this.golsEquipLocal++;
	}
	
	public void marcaEquipVisitant() {
		this.golsEquipVisitant++;
	}
	
	public String marcador() {
		return this.nomEquipLocal + ":" + this.golsEquipLocal + " ------ " +
				this.nomEquipVisitant + ":" + this.golsEquipVisitant;
	}
	
	public String fi() {
		String resultat = "";
		if(this.golsEquipLocal > this.golsEquipVisitant) {
			resultat = "Ha ganado " + this.nomEquipLocal;
		}
		else if(this.golsEquipLocal < this.golsEquipVisitant) {
			resultat = "Ha ganado " + this.nomEquipVisitant;
		}
		else {
			resultat = "Empat!";
		}
		return resultat;
	}
}
