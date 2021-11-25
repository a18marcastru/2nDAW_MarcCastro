
public class PersonaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Persona Marc = new Persona("Marc","Castro");
		Marc.setEdat(20);
		System.out.println(Marc.toString());
		Marc.Aniversari();
		Marc.Casament();
		System.out.println(Marc.toString());
		
		Persona Timur = new Persona("23214321K","Timur","Romero",20,false);
		System.out.println(Timur.toString());
		*/
		Persona[] grupo = new Persona[3];
		
		for(int i=0;i<grupo.length;i++){
			grupo[i] = new Persona();
		}
		
		grupo[0].setNom("Marc");
		grupo[0].setCognom("Castro");
		grupo[0].setEdat(20); 
		grupo[0].setEstatCivil(true);
		System.out.println(grupo[0].toString());
	}

}
