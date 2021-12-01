
public class Carrito {

	private  Producto[] productos = new Producto[50];
	private int nproducto;
	
	//Constructores
	
	public Carrito() {
		this.nproducto = 0;
	}
	
	//Otros Modulos publicos

	public void añadirProducto(String d, int pre){
			this.productos[this.nproducto] = new Producto(d,pre);
			this.nproducto++;
	}
	
	public String mostrarCarrito(){
		for(int i = 0;i < this.nproducto;i++){
			System.out.println(this.productos[i]);
		}
		return "";
	}
}