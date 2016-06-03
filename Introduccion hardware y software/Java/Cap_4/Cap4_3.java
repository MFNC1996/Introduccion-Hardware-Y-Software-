package cap4;
import java.util.Scanner;
public class Cap4_3 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese su nota");
        nota = intro.nextInt();
        if(nota>=10 && nota<=39){
            System.out.println("Insuficiente");
        }else{
            if(nota>=40 && nota<=49){
                System.out.println("Suficiente");
            }else{
                if(nota>=50 && nota<=59){
                    System.out.println("Bien");
                }else{
                    if(nota>=60 && nota>=70);
                    System.out.println("Muy bien");
                }
            }
        }
    }
}
