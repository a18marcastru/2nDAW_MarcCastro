
public class Cercle {

	private float radi;
	private String color="Blanc";
	
	
	//Constructores
	
	Cercle(){
		this.radi=0;
		this.color="Blanc";
	}
	
	Cercle(float r){
		this.radi=r;
		this.color="Blanc";
	}
	
	Cercle(float r, String c){
		this.radi=r;
		this.color=c;
	}
	
	//Getters y Setters
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public float getRadi() {
		return radi;
	}
	
	public void setRadi(float radi) {
		this.radi=radi;
	}
	
	//Otros Modulos publicos
	
	public float parametre() {
		return this.radi=(float)(radi*2*Math.PI);
	}
	
	public float area() {
		return this.radi=(float)(radi*radi*Math.PI);
	}
	
	public String toString() {
		return "El circulo tiene un radio " + this.radi + " de color " + this.color + " con un perimetro de " + this.parametre() + " y un area de " + this.area();
	}

}
