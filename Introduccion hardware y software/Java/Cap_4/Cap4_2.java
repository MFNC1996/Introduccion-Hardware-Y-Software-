package cap4;
import java.util.Scanner;
public class Cap4_2 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int dinero,b20,b10,b5,b2,b1,m500,m100,m50,m10,rb20=0,rb10=0,rb5=0,rb1=0,rm500=0,rm100=0,rm50=0,rm10=0;
        System.out.println("Ingrese cantidad de dinero deseada");
        dinero = intro.nextInt();
        while(dinero >= 9 )  
            if(dinero>=20000){
                b20 = dinero/20000;
                rb20 = dinero%20000; 
                System.out.println("Billetes de veinte mil: "+b20);
                if(rb20>=10000){
                    b10 = rb20/10000;
                    rb10 = rb20%10000;
                    System.out.println("Billetes de diez mil: "+b10);
                    if(rb10>=5000){
                        b5 = rb10/5000;
                        rb5 = rb10%5000;
                        System.out.println("Billetes de cinco mil: "+b5);
                        if(rb5>=1000){
                            b1 = rb5/1000;
                            rb1 = rb5%1000;
                            System.out.println("Billetes de mil: "+b1);
                            if(rb1>=500){
                                m500 = rb1/500;
                                rm500 = rb1%500;
                                System.out.println("Monedas de quinientos: "+m500);
                                if(rm500>=100){
                                    m100 = rm500/100;
                                    rm100 = rm500%100;
                                    System.out.println("Monedas de cien: "+m100);
                                    if(rm100>=50){
                                        m50 = rm100/50;
                                        rm50 = rm100%50;
                                        System.out.println("Monedas de cincuenta: "+m50);
                                        if(rm50>=10){
                                            m10 = rm50/10;
                                            rm10 =rm50%10;
                                            System.out.println("Monedas de diez: "+m10);
                                        }
                                    }
                                }
                            }
                        } 
                    }          
                }
            }       
    }   
}
