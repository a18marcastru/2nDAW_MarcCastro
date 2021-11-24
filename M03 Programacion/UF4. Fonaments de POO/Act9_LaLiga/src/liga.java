
public class liga {
	private Equip[] equipos;
	private Partit[] partidos;
	
	//Constructores
	liga(Equip[] eqp){
		this.equipos = eqp;
		int e = equipos.length;
		this.partidos = new Partit[e * e - e];
		int k = 0;
		for(int i = 0;i < e;i++) {
			for(int j = 0+1;j < e;j++) {
				Partit p = new Partit(equipos[i],equipos[j]);
				this.partidos[k] = p;
				k++;
			}
		}
	}
	
	//Metodos publicos
	
	public void juegaliga() {
		for(int i = 0;i < partidos.length;i++) {
			this.partidos[i].juegaPartido();
		}
	}
	public String clasificacion() {
		String strResultado= "";
		/*for(int i = 0;i < partidos.length;i++) {
			strResultado += partidos[i].marcador() + "\n";
		}*/
		strResultado += "\nClasificacion: \n";
		for(int i = 0;i < equipos.length;i++) {
			strResultado += equipos[i].toString() + "\n";
		}
		return strResultado;
	}
}
