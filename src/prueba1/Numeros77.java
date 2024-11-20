package prueba1;
import java.util.*;
public class Numeros77 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce el primer número: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Introduce el segundo número: ");
	        int num2 = scanner.nextInt();
	        
	        int start = Math.min(num1, num2);
	        int end = Math.max(num1, num2);

	        for (int i = start; i <= end; i += 7) {
	            System.out.println(i);
	        }
	        scanner.close();
	    }
	}