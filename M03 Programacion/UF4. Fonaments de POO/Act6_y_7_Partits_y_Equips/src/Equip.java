
public class Equip {
	private String nomEquip;
	private int puntLiga;

	
	Equip(String nom) {
		this.setNomEquip(nom);
		this.puntLiga = 2;
	}
	
	public void incrementarPunts(int num) {
		this.puntLiga += num;
	}

	public String getNomEquip() {
		return nomEquip;
	}

	public void setNomEquip(String nomEquip) {
		this.nomEquip = nomEquip;
	}
	
	public String toString() {
		return "El equip: " + this.nomEquip + " amb " + this.puntLiga + " punts.";
	}
	
}