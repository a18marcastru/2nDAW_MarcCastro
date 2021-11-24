
import java.util.Scanner;

public class SumaTest {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int suma;

        System.out.println("Introdueix dos numeros enters:");

        number1 = input.nextInt();

        number2 = input.nextInt();

        suma = number1 + number2;

        System.out.println("Aquests dos numeros sumen " + suma);
    }

}