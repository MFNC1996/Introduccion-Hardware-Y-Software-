package Cap3;
import java.util.Scanner;
public class cap3_1 {
     public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int radio = 0,altura=0;
        System.out.println("Ingrese radio");
        radio = intro.nextInt();
        System.out.println("Ingrese altura");
        altura = intro.nextInt();
        double volumen = 3.14*(radio^2)*altura; 
        double area = (2*3.14*radio*altura)+(2*3.14*radio*altura);
        System.out.println("el area es: "+area);
        System.out.println("el volumen es: "+volumen);
    } 
}
