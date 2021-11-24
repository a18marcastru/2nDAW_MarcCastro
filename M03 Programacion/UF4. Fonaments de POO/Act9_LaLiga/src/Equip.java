
public class Equip {
	private String nomEquip;
	private int puntLiga;

	
	//Constructores
	Equip(String nom) {
		this.setNomEquip(nom);
		this.puntLiga = 0;
	}
	
	public void incrementarPunts(int num) {
		this.puntLiga += num;
	}

	//Setters y Getters
	public String getNomEquip() {
		return nomEquip;
	}

	public void setNomEquip(String nomEquip) {
		this.nomEquip = nomEquip;
	}
	
	//Metodos publicos
	public String toString() {
		return "El equip: " + this.nomEquip + " amb " + this.puntLiga + " punts.";
	}
	
}