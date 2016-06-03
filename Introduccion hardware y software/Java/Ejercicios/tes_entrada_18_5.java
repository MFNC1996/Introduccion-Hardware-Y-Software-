
import java.util.Scanner;

public class tes_entrada_18_5 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int i, max = 0, min = 20, acum = 0, array = 20, rep = 0;
        System.out.println("Ingrese cantidad de numero en el arreglo");
        array = intro.nextInt();
        int num[] = new int[array];
        for (i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * (1 + 20));
            System.out.println("Lon numeros aleatorios son: " + " " + num[i]);
        }
        for (i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("El maximo es: " + " " + max);
        System.out.println("El minimo es: " + " " + min);
        for (i = 0; i < num.length; i++) {
            num[0] = max;
            num[array-1]= min;
        }
        for (i = 0; i < num.length; i++) {
            System.out.println("El arreglo nuevo es: " + " " + num[i]);
        }
    }
}
