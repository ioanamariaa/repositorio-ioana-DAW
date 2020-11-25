import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {	
        Scanner reader = new Scanner(System.in);
        int euros = 0;
        double pesetas = 166.386 ;
        double conversion = 0;
        
        System.out.println("Escriba los euros que desea convertir a pesetas:");
        euros = reader.nextInt();

        conversion = euros * pesetas;
        System.out.println(euros + " euros son " + conversion + " pesetas");

    }
}
