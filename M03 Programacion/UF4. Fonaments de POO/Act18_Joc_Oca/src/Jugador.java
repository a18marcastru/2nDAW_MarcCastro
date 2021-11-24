
public abstract class Jugador {
	private String nombre;
	private int posicion;
	private int vidas;
	private int record;
	
	//Constructor
	Jugador(String n, int v){
		this.nombre = n;
		this.posicion = 0;
		this.vidas = v;
	}
	
	//Setters y Getters
	public String getnombre() {
		return nombre;
	}
	
	public String getposicion() {
		return nombre;
	}
	
	//Metodos publicos
	public String muere() {
		String mens = "";
		if(this.vidas < 0) {
			this.posicion = 0;
			mens += "Jugador " + this.nombre + " no tienes vidas";
		}
		else {
			this.vidas--;
			mens += "Jugador " + this.nombre + "te quitado una vida, ahora te quedan" + this.vidas;
		}
		return mens;
	}
	
	
}
