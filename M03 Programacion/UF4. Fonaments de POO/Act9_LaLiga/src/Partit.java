import java.util.Random;

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
	
	
	//Metodos publicos
	
	/*public void marcaEquipLocal() {
		this.golsEquipLocal++;
	}
	
	public void marcaEquipVisitant() {
		this.golsEquipVisitant++;
	}*/
	
	public String marcador() {
		return this.nomEquipLocal.getNomEquip() + ":" + this.golsEquipLocal + " ------ " +
				this.nomEquipVisitant.getNomEquip() + ":" + this.golsEquipVisitant;
	}
	
	public void juegaPartido() {
		Random rand = new Random();
		this.golsEquipLocal = rand.nextInt(5);
		this.golsEquipVisitant = rand.nextInt(5);
		this.fi();
	}
	
	public String fi() {
		String resultat = "";
		if(this.golsEquipLocal > this.golsEquipVisitant) {
			resultat = "Ha ganado " + this.nomEquipLocal.getNomEquip();
			this.nomEquipLocal.incrementarPunts(3);
		}
		else if(this.golsEquipLocal < this.golsEquipVisitant) {
			resultat = "Ha ganado " + this.nomEquipVisitant.getNomEquip();
			this.nomEquipVisitant.incrementarPunts(3);
		}
		else {
			resultat = "Empat! " + this.golsEquipLocal + this.golsEquipVisitant;
			this.nomEquipLocal.incrementarPunts(1);
			this.nomEquipVisitant.incrementarPunts(1);
		}
		return resultat;
	}
}