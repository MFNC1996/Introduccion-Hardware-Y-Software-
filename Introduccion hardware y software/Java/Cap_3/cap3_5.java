package Cap3;
import java.util.Scanner;
public class cap3_5 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int costoVehiculo;
        double impLoc,impEst,ganancia,total;
        System.out.println("Ingrese valor del Vehiculo");
        costoVehiculo = intro.nextInt();
        impLoc = costoVehiculo*0.03;
        impEst = costoVehiculo*0.03;
        ganancia = costoVehiculo*0.08;
        total = costoVehiculo+impLoc+impEst+ganancia;
        System.out.println("El costo del vehiculo con impuestos es: "+total);
    }
}
