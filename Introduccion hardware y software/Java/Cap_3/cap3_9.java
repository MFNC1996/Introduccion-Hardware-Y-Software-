package Cap3;
import java.util.Scanner;
public class cap3_9 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int  horas = 0, sueldo,cantHoras;
        System.out.println("Ingrese sueldo base");
        sueldo = intro.nextInt();
        System.out.println("Ingrese valor de hora extra");
        horas = intro.nextInt();
        System.out.println("Ingrese cantidad de horas extras");
        cantHoras = intro.nextInt();
        System.out.println("Usted tiene un descuento de un 20%");
        int horasExt = cantHoras*horas;
        double descuento = sueldo*0.2, sueldoTotal = sueldo+horasExt+descuento;
        System.out.println("Su sueldo es: "+"$ "+sueldoTotal);
    } 
}
