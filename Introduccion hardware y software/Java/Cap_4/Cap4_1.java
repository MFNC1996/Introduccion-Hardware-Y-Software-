package cap4;
import java.util.Scanner;
public class Cap4_1 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int num1,num2,num3,num4;
        System.out.println("Ingrese primer numero");
        num1 = intro.nextInt();
        System.out.println("Ingrese segundo numero");
        num2 = intro.nextInt();
        System.out.println("Ingrese tercer numero");
        num3 = intro.nextInt();
        System.out.println("Ingrese cuarto numero");
        num4 = intro.nextInt();
        if(num1>num2 || num1>num3 || num1> num4){
            System.out.println("El numero mayor es el: "+num1);
        }else{
            if(num2>num1 && num2>num3 && num2>num4){
            System.out.println("El numero mayor es el: "+num2);
            }else{
                if(num3>num1 && num3>num2 && num3>num4 ){
                    System.out.println("El numero mayor es el: "+num3);
                }else{
                    if(num4>num1 && num4>num2 && num4>num3);
                    System.out.println("El numero mayor es el: "+num4);
                } 
                }
            }   
    }
}
