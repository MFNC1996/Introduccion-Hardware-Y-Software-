package Cap3;
import java.util.Scanner;
public class cap3_11 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese edad para saber sus pulsaciones/10s");
        edad = intro.nextInt();
        int numPulsaciones = (220-edad)/10;
        System.out.println("La cantidad de pulsaciones cada 10 segundos que tiene es: "+numPulsaciones);
    }
}
