
public class Triangle extends ObjecteGeometric {

	private int alcada;
	private int base;
	
	Triangle(int x, int y, String c, int a, int b){
		super(x,y,c);
		this.alcada=a;
		this.base=b;
	}
	
	public double perimetre() {
			
		return (2*this.base) + (2*this.alcada);
			
	}
	
	public double area() {
		
		return this.base*this.alcada/2;
			
	}
	
	public String toString(){
		
		return ("\n" + super.toString() + " alcada: " + this.alcada + " base: " + this.base);
		
		
	}
}
