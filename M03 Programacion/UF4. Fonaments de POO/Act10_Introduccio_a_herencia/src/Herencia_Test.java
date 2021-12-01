
public class Herencia_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cercle c1 = new Cercle(1,1,"Vermell",10);
		
		System.out.println(c1.toString());
		System.out.println("Perimetre " + c1.perimetre());
		System.out.println("Area " + c1.area() + "\n");
		
		Rectangle r1 = new Rectangle(10,10,"Verd",10,30);
		
		System.out.println("Rectangle: " + r1.toString());
		System.out.println("Perimetre " + r1.perimetre());
		System.out.println("Area " + r1.area() + "\n");
		
		Quadrat q1 = new Quadrat (1,1,"Amarillo",10);
		
		System.out.println("Quadrat: " + q1.toString());
		System.out.println("Perimetre " + q1.perimetre());
		System.out.println("Area " + q1.area() + "\n");
		
		Triangle t1 = new Triangle (1,1,"Azul",10,2);
		
		System.out.println("Triangle: " + t1.toString());
		System.out.println("Perimetre " + t1.perimetre());
		System.out.println("Area " + t1.area() + "\n");
	}

}
