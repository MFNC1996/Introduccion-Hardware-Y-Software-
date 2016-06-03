package Cap3;
import java.util.Scanner;
public class cap3_14 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double porcApro,porcRepro,porcNot,porcSobr;
        int aprobado,reprobado,notable,sobresaliente;
        System.out.println("Ingrese numero de alumnos aprobados");
        aprobado = intro.nextInt();
        System.out.println("Ingrese numro de alumnos reprobados");
        reprobado = intro.nextInt();
        System.out.println("Ingrese numero de alumnos notables");
        notable = intro.nextInt();
        System.out.println("Ingrese numero de alumnos sonbresalientes");
        sobresaliente = intro.nextInt();
        porcApro = aprobado*0.25;
        porcRepro = reprobado*0.25;
        porcNot = notable*0.25;
        porcSobr = sobresaliente*0.25;
        System.out.println("Aprobados: "+"%"+porcApro+"Reprobados: "+"%"+porcRepro+"Notables: "+"%"+porcNot+"Sobreslientes: "+"$"+porcSobr);  
    }
    
}
