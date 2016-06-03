package cap4;
import java.util.Scanner;
public class Cap4_4 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int H,hE,sB;
        double afp,isa,colm,banm,vi3,fon,bans,geom,cupr,prov;
        System.out.println("Ingrese horas extras trabajadas");
        hE = intro.nextInt();
        System.out.println("Ingrese sueldo en base a grado(1 , 2 o 3)");
        sB = intro.nextInt();
        System.out.println("Ingrese Isapre(1.Colmena 2.Banmedica 3.Vida3 4.Fonasa)");
        isa = intro.nextInt();
        System.out.println("Ingrese AFP(1.Bansander 2.Geometrica 3.Cuprum 4.Provida)");
        afp= intro.nextInt();
        if(hE>=1 && hE<=3){
            hE = hE*2000;
        }else{
            if(hE>=4 && hE<=7){
                hE = hE*3000;
            }else{
                if(hE>7){
                    hE = hE*3500;
                }
            }
        }
        if(sB>=1 && sB<=1){
            sB = 450000;
        }else{
            if(sB>=2 &&sB<=2){
             sB = 550000;   
            }else{
                if(sB>=3 && sB<=3){
                    sB = 700000;
                }
            }
        }
            
        }       
}
