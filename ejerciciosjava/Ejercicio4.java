import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {	
        Scanner reader = new Scanner(System.in);
        int chicas = 0;
        int chicos = 0;
        int personas = 0;
        int porcentajechicas = 0;
        int porcentajechicos = 0;
    
        System.out.println("Escriba el numero de chicas que hay en el curso:");
        chicas = reader.nextInt();
        System.out.println("Escriba el numero de chicos que hay en el curso:");
        chicos = reader.nextInt();
        
        personas = chicos + chicas;
        porcentajechicas = chicas * 100 / personas;
        porcentajechicos = chicos * 100 / personas;
      
        System.out.println("En el curso actual hay un " + porcentajechicas + "% de chicas y un " + porcentajechicos + "% de chicos");

    }
}
