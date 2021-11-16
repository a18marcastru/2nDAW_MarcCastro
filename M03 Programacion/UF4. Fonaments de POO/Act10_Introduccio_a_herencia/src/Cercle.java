
public class Cercle extends ObjecteGeometric {
	
	private int radi;
	
	//Constructor
	public Cercle(int x, int y, String c, int r) {
		super(x,y,c);
		this.radi = r;
	}
	
	//Setters y Getters
	public int getRadi() {
		return radi;
	}
	
	public void setRadi(int radi) {
		this.radi = radi;
	}
	
	//Metode public
	public String toString() {
		return "Cercle\n " + super.toString() + " Radi: " + this.radi;
	}
	
	public double perimetre() {
		return 2*Math.PI*this.radi;
	}
	
	public double area() {
		return Math.PI*this.radi*this.radi;
	}
	
}