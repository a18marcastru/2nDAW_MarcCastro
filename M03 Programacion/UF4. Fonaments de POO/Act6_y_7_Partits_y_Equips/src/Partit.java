
public class Partit {

	private Equip nomEquipLocal;
	private Equip nomEquipVisitant;
	private int golsEquipLocal;
	private int golsEquipVisitant;
	
	
	//Constructores
	Partit(Equip a, Equip b) {
		this.nomEquipLocal = a;
		this.nomEquipVisitant = b;
		this.golsEquipLocal = 0;
		this.golsEquipVisitant = 0;
	}
	
	Partit(Equip a, Equip b, int g1, int g2) {
		this.nomEquipLocal = a;
		this.nomEquipVisitant = b;
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
			this.nomEquipLocal.incrementarPunts(3);
			
		}
		else if(this.golsEquipLocal < this.golsEquipVisitant) {
			resultat = "Ha ganado " + this.nomEquipVisitant;
		}
		else {
			resultat = "Empat! " + this.golsEquipLocal + this.golsEquipVisitant;
			this.golsEquipLocal += 1;
			this.golsEquipVisitant += 1;
		}
		return resultat;
	}
}