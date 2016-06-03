package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicios1 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        Random aleatorio = new Random();
        int num1, num2, num3, num4, num5, num6, num7, rdm1, rdm2, rdm3, rdm4, rdm5, rdm6, rdm7;
        System.out.println("Ingrese sus numero de la suerte");
        num1 = intro.nextInt();
        num2 = intro.nextInt();
        num3 = intro.nextInt();
        num4 = intro.nextInt();
        num5 = intro.nextInt();
        num6 = intro.nextInt();
        num7 = intro.nextInt();
        rdm1 = aleatorio.nextInt(10 + 1);
        rdm2 = aleatorio.nextInt(10 + 1);
        rdm3 = aleatorio.nextInt(10 + 1);
        rdm4 = aleatorio.nextInt(10 + 1);
        rdm5 = aleatorio.nextInt(10 + 1);
        rdm6 = aleatorio.nextInt(10 + 1);
        rdm7 = aleatorio.nextInt(10 + 1);
        System.out.println("Los numeros sorteados son" + " " + rdm1 + " " + rdm2 + " " + rdm3 + " " + rdm4 + " " + rdm5 + " " + rdm6 + " " + rdm7);
        if (num1 == rdm1 || num1 == rdm2 || num1 == rdm3 || num1 == rdm4 || num1 == rdm5 || num1 == rdm6 || num1 == rdm7) {
            System.out.println("Numero acertado:" + " " + num1);
        }
        if (num2 == rdm1 || num2 == rdm2 || num2 == rdm3 || num2 == rdm4 || num2 == rdm5 || num2 == rdm6 || num2 == rdm7) {
            System.out.println("Numero acertado:" + " " + num2);
        }
        if (num3 == rdm1 || num3 == rdm2 || num3 == rdm3 || num3 == rdm4 || num3 == rdm5 || num3 == rdm6 || num3 == rdm7) {
            System.out.println("Numero acertado:" + " " + num3);
        }
        if (num4 == rdm1 || num4 == rdm2 || num4 == rdm3 || num4 == rdm4 || num4 == rdm5 || num4 == rdm6 || num4 == rdm7) {
            System.out.println("Numero acertado:" + " " + num4);
        }
        if (num5 == rdm1 || num5 == rdm2 || num5 == rdm3 || num5 == rdm4 || num5 == rdm5 || num5 == rdm6 || num5 == rdm7) {
            System.out.println("Numero acertado:" + " " + num5);
        }
        if (num6 == rdm1 || num6 == rdm2 || num6 == rdm3 || num6 == rdm4 || num6 == rdm5 || num6 == rdm6 || num6 == rdm7) {
            System.out.println("Numero acertado:" + " " + num6);
        }
        if (num7 == rdm1 || num7 == rdm2 || num7 == rdm3 || num7 == rdm4 || num7 == rdm5 || num7 == rdm6 || num7 == rdm7) {
            System.out.println("Numero acertado:" + " " + num7);
        }
    }
}
