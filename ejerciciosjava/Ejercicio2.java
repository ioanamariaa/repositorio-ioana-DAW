import java.util.Scanner;

import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {		
        Scanner reader = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int aux = 0;
        System.out.println("Escriba el primer numero entero:");
        a = reader.nextInt();
        System.out.println("Escriba el segundo numero entero:");
        b = reader.nextInt();
        aux = a;
        a = b;
        System.out.println("El a vale " + a + " Y el b vale " + aux);


	}

}