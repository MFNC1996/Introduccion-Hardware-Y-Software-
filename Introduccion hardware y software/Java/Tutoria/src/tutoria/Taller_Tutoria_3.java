package tutoria;

import java.util.Scanner;

public class Taller_Tutoria_3 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese numero: ");
            array[i] = intro.nextInt();
        }
        System.out.println("-----------------------------------");
        System.out.println(array[0] + " " + array[9]);
        System.out.println(array[1] + " " + array[8]);
        System.out.println(array[2] + " " + array[7]);
        System.out.println(array[3] + " " + array[6]);
        System.out.println(array[4] + " " + array[5]);
    }
}