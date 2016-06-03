package Cap3;
import java.util.Scanner;
public class cap3_2 {
         public static void main(String[] args) {
             Scanner intro = new Scanner(System.in);
             int num1,num2;
             System.out.println("Ingrese numero 1");
             num1 = intro.nextInt();
             System.out.println("Ingrese numero 2");
             num2 = intro.nextInt();
             int suma = num1+num2;
             int multiplicacion= num1*num2;
             System.out.println("la suma es: "+suma);
             System.out.println("la multiplicacion es: "+multiplicacion);  
         }
}
