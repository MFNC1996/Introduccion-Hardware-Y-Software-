package Ejecicios;

import java.util.Scanner;

public class Facil2 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int num[] = new int[5];
        int i, min = 1000, max = 0, num1;
        for (i = 0; i < 5; i++) {
            num[i] = Math.random();
        }
        for (i = 0; i < 5; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        for (i = 0; i < 5; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println(min+" "+" "+max);
    }
}
