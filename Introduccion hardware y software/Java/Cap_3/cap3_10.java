package Cap3;
import java.util.Scanner;
public class cap3_10 {
     public static void main(String[] args) {
         Scanner intro = new Scanner(System.in);
         int compIta,compChi,Hambur,Chur,Cerv,Beb,tot1,tot2,tot3,tot4,tot5,tot6,Total;
         System.out.println("¿Cuantos completos italianos desea pedir?");
         compIta = intro.nextInt();
         System.out.println("¿Cuantos completos a la chilena desea pedir?");
         compChi = intro.nextInt();
         System.out.println("¿Cuantas hamburguesas con queso desea pedir?");
         Hambur = intro.nextInt();
         System.out.println("¿Cuantos churrascos desea pedir?");
         Chur = intro.nextInt();
         System.out.println("Cuantas cervezas desea consumir");
         Cerv = intro.nextInt();
         System.out.println("¿Cuantas bebidad desea consumir?");
         Beb = intro.nextInt();
         tot1 = compIta*690;
         tot2 = compChi*690;
         tot3 = Hambur*990;
         tot4 = Chur*1100;
         tot5 =Cerv*700;
         tot6 = Beb*500; 
         Total = tot1+tot2+tot3+tot4+tot5+tot6;
          System.out.println("El total de la compra es: "+"$ "+Total);
     }  
}
