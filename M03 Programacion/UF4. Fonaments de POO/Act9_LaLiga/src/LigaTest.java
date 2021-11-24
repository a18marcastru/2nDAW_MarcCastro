
public class LigaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equip B = new Equip("Barça");
		Equip M = new Equip("Real Madrid");
		Equip BT = new Equip("Betis");
		Equip G = new Equip("Granada");
		
		Equip [] eqp = {B,M,BT,G};
		
		liga laliga = new liga(eqp);
		
		laliga.juegaliga();

		System.out.println(laliga.clasificacion());
	}

}
