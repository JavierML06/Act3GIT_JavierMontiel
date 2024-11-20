package prueba1;
import java.util.*;

public class Numeros77 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Introduce un tercer número: ");
        int num3 = scanner.nextInt();
        
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        // Verificar si el tercer número está entre el primer y el segundo
        if (num3 >= start && num3 <= end) {
            System.out.println("El tercer número " + num3 + " se encuentra entre " + start + " y " + end + ".");
        } else {
            System.out.println("El tercer número " + num3 + " NO se encuentra entre " + start + " y " + end + ".");
        }

        // Imprimir números desde start hasta end en incrementos de 7
        for (int i = start; i <= end; i += 7) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}