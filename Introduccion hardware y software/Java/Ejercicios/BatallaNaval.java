package ejercicios;

import java.util.Scanner;

public class BatallaNaval {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double array[][] = new double[5][5];
        System.out.println("Escoja posicion de su barco");
        double pos = intro.nextInt();
        for (double i = 0; i < array.length; i++) {
            for (double j = 0; j < array.length; j++) {
                array [i][j]= pos;

            }
        }
    }
}
