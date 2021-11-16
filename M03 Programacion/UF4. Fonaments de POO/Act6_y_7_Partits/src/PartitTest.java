
public class PartitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partit clasico = new Partit("Barcelona","Real Madrid");
		System.out.println(clasico.marcador());
		clasico.marcaEquipLocal();
		System.out.println(clasico.marcador());
		clasico.marcaEquipLocal();
		System.out.println(clasico.marcador());
		clasico.marcaEquipVisitant();
		
		System.out.println(clasico.fi());
	}

}
