
public class Jugador {
	private String nombre;
	private String simbolo;
	
	Jugador(String n, String s) {
		this.nombre = n;
		this.simbolo = s;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void tirada(String[][] T, int x, int y) {
		T[x][y] = this.simbolo;
	}
}
