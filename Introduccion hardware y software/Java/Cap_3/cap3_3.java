package Cap3;
import java.util.Scanner;
public class cap3_3 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double parc,promTall,promTar,expo,porcParc,porcTall,porcTar,porExpo,promFin;
        System.out.println("Ingrese calificaciones parciales");
        parc = intro.nextInt();
        System.out.println("Ingrese el promedio de los talleres");
        promTall = intro.nextInt();
        System.out.println("Ingrese el promedio de las tareas");
        promTar = intro.nextInt();
        System.out.println("Ingrese nota obtenida en exposicion");
        expo = intro.nextInt();
        porcParc = parc*0.50;
        porcTall = promTall*0.25;
        porcTar = promTar*0.15;
        porExpo = expo*0.10;
        promFin = (porcParc+porcTall+porcTar+porExpo);
        System.out.println("El promedio de la asignatura de algoritmos es: "+promFin);
    }
}