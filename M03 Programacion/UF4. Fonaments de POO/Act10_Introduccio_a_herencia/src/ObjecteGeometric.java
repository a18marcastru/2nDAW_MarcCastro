
public class ObjecteGeometric {
	
	private int posx;
	private int posy;
	private String color;
	
	//Constructores
	public ObjecteGeometric(int x, int y, String color) {
		this.posx = x;
		this.posy = y;
		this.color = color;
	}
	
	//Setters y Getters
	public int getX() {
		return posx;
	}
	
	public void setX(int x) {
		this.posx = x;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getY() {
		return posy;
	}
	
	public void setY(int y) {
		this.posy = y;
	}
	
	//Metode public
	
	public String toString() {
		return ("PosX: " + this.posx + " PosY: " + this.posy);
	}
	
}