package Cap3;
import java.util.Scanner;
public class cap3_6 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double a1,a2,a3,dTotal,pa1,pa2,pa3;
        System.out.println("Amigo uno ingrese dinero");
        a1 = intro.nextInt();
        System.out.println("Amigo 2 ingrese dinero");
        a2 = intro.nextInt();
        System.out.println("Amigo 3 ingrese dinero");
        a3 = intro.nextInt();
        dTotal = (a1+a2+a3);
        pa1 = a1*100/dTotal;
        pa2 = a2*100/dTotal;
        pa3 = a3*100/dTotal;
        System.out.println("El amigo uno aporto un: "+pa1+"%");
        System.out.println("El amigo dos aporto un: "+pa2+"%");
        System.out.println("El amigo tres aporto un: "+pa3+"%");
    }
}
