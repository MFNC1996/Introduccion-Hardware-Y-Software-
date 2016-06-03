package test.entrada;
import java.util.Scanner;
public class TestEntrada {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double distancia=0,distanciaX=0,distanciaY=0,dist_Entre_Entregas,gasolina,cEntregas,origenX=0,origenY=0,acum_dist=0;
        int cont =0;
        System.out.println("Ingrese cantidad de entregas");
        cEntregas =intro.nextInt();
            do{
                System.out.println("Ingrese distancia al destino" + " " + (cont+1));
                distanciaX = intro.nextInt();
                distanciaY = intro.nextInt();               
                distancia = Math.sqrt(Math.pow(distanciaX-origenX,2)+Math.pow(distanciaY-origenY,2));
                origenX = distanciaX;
                origenY = distanciaY;
                cont++;
                System.out.println("La distancia es: "+distancia);
                acum_dist = Math.round(acum_dist +distancia);
                gasolina = Math.round(acum_dist*1/15);
            }while(cEntregas!=cont);
                System.out.println(("La distancia total que se recorrera hoy es: ") + acum_dist);
                System.out.println("La gasolina que se necesitara es: "+gasolina+"litros");
            }
    }       
