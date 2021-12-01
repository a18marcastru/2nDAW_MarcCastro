package examenUF4;

public class Empresa {
	
	private String nombreEmpresa;
	private int numeroEmpleado;
	private Empresa[] plantilla;
	
	//Constructores
	Empresa(String n, int ne, Empresa[] p) {
		this.nombreEmpresa = n;
		this.numeroEmpleado = 0;
		this.plantilla = new Empresa[numeroEmpleado];
	}
	
	//Metodo publico
	public String añadirEmpleado(Empleado e) {
		for(int i = 0; i < plantilla.length;i++) {
			if(this.plantilla[i] == "") {
				this.plantilla[i] = e;
			}
			else return "No hay espacio";
		}
		return this.plantilla;
	}
	
	
}
