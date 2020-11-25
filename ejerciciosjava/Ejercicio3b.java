import java.util.Scanner;
public class Ejercicio3b {

    public static void main(String[] args) {	
        Scanner reader = new Scanner(System.in);	
        int x = 0;
        int y = 0;
        int suma = 0;
        int resta = 0;
        int division = 0;
        int multiplicacion = 0;

        System.out.println("Escriba el primer numero entero:");
        x = reader.nextInt();
        System.out.println("Escriba el segundo numero entero:");
        y = reader.nextInt();

        suma = x + y;
        resta = y - x;
        division = y / x;
        multiplicacion = x * y;
 
         System.out.println("La suma de "+ x + " y "+ y + " es: " + suma);
         System.out.println("La resta de "+ y + " y "+ x + " es: " + resta);
         System.out.println("La division de "+ y + " y "+ x + " es: " + division);
         System.out.println("La multiplicacion de "+ x + " y "+ y + " es: " + multiplicacion);
 
 
     }
}
