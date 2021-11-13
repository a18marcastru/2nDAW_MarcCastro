
public class Herencia_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cercle c1 = new Cercle(1,1,"Vermell",10);
		
		System.out.println(c1.toString());
		System.out.println("Perimetre" + c1.perimetre() + "\n");
		System.out.println("Area" + c1.area() + "\n");
		
		Rectangle r1 = new Rectangle(10,10,"Verd",10,30);
		
		System.out.println(r1.toString());
		System.out.println("Perimetre" + r1.perimetre() + "\n");
		System.out.println("Area" + r1.area() + "\n");
	}

}
