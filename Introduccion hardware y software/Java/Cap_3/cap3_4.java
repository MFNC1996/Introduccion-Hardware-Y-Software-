package Cap3;
import java.util.Scanner;
public class cap3_4 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double kine,gine,trau,pedi,dinero;
        System.out.println("Ingrese dinero");
        dinero = intro.nextInt();
        kine = dinero*0.20;
        gine = dinero*0.25;
        trau = dinero*0.30;
        pedi = dinero*0.25;
        System.out.println("El dinero para kinesiologia sera: "+kine);
        System.out.println("El dinero para ginecologia sera: "+gine);
        System.out.println("El dinero para traumatologia sera: "+trau);
        System.out.println("El dinero para pediatria sera: "+pedi);
    }
}