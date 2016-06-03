package ejercicios;

import java.util.Scanner;

public class loto {

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);
        int cont = 0, k;
        int cont_i;
        int[] num = new int[6];
        int[] juego = new int[6];

        //el user ingresa sus numeros
        for (cont_i = 0; cont_i < num.length; cont_i = cont_i + 1) {
            do {
                System.out.println("Ingrese numero ");
                num[cont_i] = intro.nextInt();
            } while (num[cont_i] <= 0 || num[cont_i] >= 20);
            k = 0;
            while (k < cont_i || num[k] != num[cont_i]) {
                if (num[cont_i] == num[k]) {
                    cont_i--;
                }
                k++;
            }
        }

        //generando numeros random
        for (int i = 0; i < juego.length; i++) {
            juego[i] = (int) (Math.random() * 20 + 1);
            System.out.println("Numero ganador: " + juego[i] + " ");
        }

        //comparando numeros random con los del user
        for (cont_i = 0; cont_i < num.length; cont_i = cont_i + 1) {
            for (int i = 0; i < juego.length; i++) {
                if (num[cont_i] == juego[i]) {
                    cont = cont + 1;
                }
            }
        }

        System.out.println("");

        if (cont != 0) {
            System.out.println("Su puntaje fue: " + cont);
        } else {
            System.out.println("Su puntaje es 0");
        }
    }
}