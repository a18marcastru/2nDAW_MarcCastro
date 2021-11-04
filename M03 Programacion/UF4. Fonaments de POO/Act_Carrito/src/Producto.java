
public class Producto {
	
	private String descripcio;
	private int precio;
	
	//Constructores
	
	public Producto( String d, int p){
		this.descripcio = d;
		this.precio = p;
	}
	
	//Otros Modulos publicos
	
	public String toString() {
		return "El producto " + this.descripcio + " tiene un precio de " + this.precio + "€.";
	}
}

