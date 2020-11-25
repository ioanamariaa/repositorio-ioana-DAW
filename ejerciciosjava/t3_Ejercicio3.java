import java.text.DecimalFormat;
public class t3_Ejercicio3 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        double division = 0;

        division = (double)a / b;

        System.out.println(division);
        DecimalFormat formateador = new DecimalFormat("#.##");
        System.out.println(formateador.format(division));
        System.out.println(" " + formateador.format(division));
        formateador = new DecimalFormat("#.###");
        System.out.println("  " + formateador.format(division));
        formateador = new DecimalFormat("000.000");
        System.out.println(formateador.format(division));
        formateador = new DecimalFormat("#.####");
        System.out.println("    " + formateador.format(division));
        formateador = new DecimalFormat("#.###");
        System.out.println(formateador.format(division));
        formateador = new DecimalFormat("#.#####");
        System.out.println("   " + formateador.format(division));
        
        division = Math.round(division);
        long division2 = (long) division;
        formateador = new DecimalFormat("0000000000");
        System.out.println(formateador.format(division2));






    }
}
