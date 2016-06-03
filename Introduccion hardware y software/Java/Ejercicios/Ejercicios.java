package ejercicios;
import java.util.Scanner;
public class Ejercicios {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double num1=0,num2=0,ejercicio = 0;
        int opcion;
        do{
            System.out.println("Calculadora");
        System.out.println("¿Que desea hacer?");
        System.out.println("1.-Sumar   2.-Restar   3-.Multiplicar   4.-Dividir   5.-Salir");
        opcion = intro.nextInt();
        
        switch(opcion){
            case 1 : 
                System.out.println("Ingrese primer numero");
                num1 = intro.nextInt();
                System.out.println("Ingrese segundo numero");
                num2 = intro.nextInt();
                ejercicio = num1+num2;
                System.out.println("El resultado es: "+ejercicio);
                break;
            case 2 :
                System.out.println("Ingrese primer numero");
                num1 = intro.nextInt();
                System.out.println("Ingrese segundo numero");
                num2 = intro.nextInt();
                ejercicio = num1-num2;
                System.out.println("El resultado es: "+ejercicio);
                break;
            case 3 :
                System.out.println("Ingrese primer numero");
                num1 = intro.nextInt();
                System.out.println("Ingrese segundo numero");
                num2 = intro.nextInt();
                ejercicio = num1*num2;
                System.out.println("El resultado es: "+ejercicio);
                break;
            case 4 : 
                    System.out.println("Ingrese primer numero");
                    num1 = intro.nextInt();
                    System.out.println("Ingrese segundo numero");
                    num2 = intro.nextInt();
                ejercicio = num1/num2;
                System.out.println("El resultado es: "+ejercicio);
                break;
            case 5 :
                System.out.println("Adiós");
                break;
        }
        }while(opcion!=5);
    }
}
