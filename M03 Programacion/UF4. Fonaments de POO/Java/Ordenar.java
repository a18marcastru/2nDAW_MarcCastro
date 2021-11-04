import java.util.Scanner;

public class Ordenar {
	
	public static void ordena(int number1, int number2, int number3){
		
		 if((number1>number2) && (number1>number3)){
			 if(number2>number3)System.out.println("Els numeros ordenats son  " + number1 + ">" + number2 + ">" + number3);
			 else System.out.println("Els numeros ordenats son  " + number1 + " " + number3 + " " + number2);
	     }
	     if((number2>number1) && (number2>number3)){
	    	 if(number3>number1)System.out.println("Els numeros ordenats son  " + number2 + ">" + number3 + ">" + number1);
	    	 else System.out.println("Els numeros ordenats son  " + number2 + ">" + number1 + ">" + number3);
	     }
	     else if((number3>number2) && (number3>number1)){
	    	 if(number2>number1) System.out.println("Els numeros ordenats son  " + number3 + ">" + number2 + ">" + number1);
	    	 else System.out.println("Els numeros ordenats son  " + number3 + ">" + number1 + ">" + number2);
	     }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int number1;
        int number2;
        int number3;
        
        System.out.println("Introdueix el primer numero enter:");
        
        number1 = input.nextInt();
        
        System.out.println("Introdueix el segon numero enter:");
        
        number2 = input.nextInt();
        
        System.out.println("Introdueix el tercer numero enter:");
        
        number3 = input.nextInt();
        
        ordena(number1, number2, number3);
	}
}