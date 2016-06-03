package Cap3;
import java.util.Scanner;
public class cap3_12 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double minLun,minMar,minMier,minJue,minVie,minSab,promedio;
        System.out.println("Ingrese tiempo (En minutos) del dia Lunes");
        minLun = intro.nextInt();
        System.out.println("Ingrese tiempo (En minutos) del dia Martes");
        minMar = intro.nextInt();
        System.out.println("Ingrese tiempo (En minutos) del dia miercoles");
        minMier = intro.nextInt();
        System.out.println("Ingrese tiempo (En minutos) del dia Jueves");
        minJue = intro.nextInt();
        System.out.println("Ingrese tiempo (En minutos) del dia Viernes");
        minVie = intro.nextInt();
        System.out.println("Ingrese tiempo (En minutos) del dia Sabado");
        minSab = intro.nextInt();
        promedio = (minLun+minMar+minMier+minJue+minVie+minSab)/6;
        System.out.println("El promedio semanal del tiempo (En minutos) es: "+promedio+ " Minutos");
    }
}
