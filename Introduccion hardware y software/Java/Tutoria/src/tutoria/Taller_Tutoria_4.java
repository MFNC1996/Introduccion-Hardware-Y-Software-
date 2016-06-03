package tutoria;

import java.util.Scanner;

public class Taller_Tutoria_4 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese numero");
            array[i] = intro.nextInt();
        }
        if (array[0] < array[1] && array[2] < array[3] && array[4] < array[5] && array[6] < array[7] && array[8] < array[9]) {
            System.out.println("Esta ordenado de forma Ascendente");
        } else if (array[9] < array[8] && array[7] < array[6] && array[5] < array[4] && array[3] < array[2] && array[1] < array[0]) {
            System.out.println("Esta ordenado de forma Descendente");
        } else {
            System.out.println("Esta desordenado");
        }
    }
}