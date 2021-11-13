
public class Rectangle extends ObjecteGeometric {
	
	private int base;
	private int alcada;
	
	//Constructores
	
	public Rectangle(int x, int y , String c, int b, int a){
		super(x,y,c);
		this.base = b;
		this.alcada = a;
	}
	
	//Metode public
	public String toString() {
		return "Rectangle\n X: " + super.toString() + " Base: " + this.base + " alçada: "
		+ this.alcada;
	}
	
	public double perimetre() {
		return (2*this.alcada)+(2*this.base);
	}
	
	public double area() {
		return this.alcada*this.base;
	}
}