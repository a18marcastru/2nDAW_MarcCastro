
public class PartitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equip A = new Equip("Barça");
		Equip B = new Equip("Real Madrid");
		
		Partit clasico = new Partit(A,B);
		
		System.out.println(clasico.marcador());
		clasico.marcaEquipLocal();
		System.out.println(clasico.marcador());
		clasico.marcaEquipLocal();
		System.out.println(clasico.marcador());
		clasico.marcaEquipVisitant();
		
		System.out.println(clasico.fi());
		
		System.out.println(A.toString());
		System.out.println(B.toString());
	}

}