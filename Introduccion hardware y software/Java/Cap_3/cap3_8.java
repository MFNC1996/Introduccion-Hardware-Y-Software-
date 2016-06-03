package Cap3;
import java.util.Scanner;
public class cap3_8 {
     public static void main(String[] args) {
         Scanner intro = new Scanner(System.in);
         int num1,num2,num3;
         System.out.println("Ingrese numero 1");
         num1 = intro.nextInt();
         System.out.println("Ingrese numero 2");
         num2 = intro.nextInt();
         System.out.println("Ingrese numero 3");
         num3 = intro.nextInt();
         int promedio = (num1+num2+num3)/3,suma = num1+num2+num3,doble = num1*2,triple = num2*3,cuadrado = num3*num3;
         System.out.println("El promedio de los numeros es: " + promedio);
         System.out.println("La suma de los numeros es: " + suma);
         System.out.println("El doble del primero numero es: "+ doble);
         System.out.println("El triple del segundo numero es: " + triple);
         System.out.println("El tercer numero al cuadrado es: " + cuadrado);
     }
}
