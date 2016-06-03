package Cap3;
import java.util.Scanner;
public class cap3_13 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double salario,salario2,total;
        System.out.println("Ingrese salario");
        salario = intro.nextInt();
        salario2=salario*0.01;
        total = salario+salario2;
        System.out.println("¡Felicidades su salario ha ahumentado un 10%!"+"Su nuevo salario sera: "+"$" +total); 
    }  
}
