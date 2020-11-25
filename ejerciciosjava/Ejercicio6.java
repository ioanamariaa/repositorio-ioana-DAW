import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {	
        Scanner reader = new Scanner(System.in);
        float primerexamen = 0;
        float notatrimestre = 0;
        float segundoexamen = 0;

        System.out.println("Introduce la nota del primer examen:");
        primerexamen = reader.nextFloat();
        System.out.println("¿Que nota quieres sacar en el trimestre?");
        notatrimestre = reader.nextFloat();

        segundoexamen = (notatrimestre - (primerexamen * 4 / 10)) * 10 / 6;
        
        if (segundoexamen > 10 | segundoexamen < 0) {
            System.out.println("Es imposible sacar esa nota");
        } else {
            System.out.println("Para tener un " + notatrimestre + " en el trimestre necesitas sacar un " + segundoexamen + " en el segundo examen"); 
        }

    }
}
