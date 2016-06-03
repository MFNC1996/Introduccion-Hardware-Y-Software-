package tutoria;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        String a;
        int num = 0, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, res1, res2, res3, res4, res5, res6, res7, res8;
        int bin1, bin2, bin3, bin4, bin5, bin6, bin7, bin8;
        System.out.println("Ingrese numero a convertir");
        a = intro.next();
        num = Integer.parseInt(a);
        res1 = num % 2;
        num1 = num / 2;
        res2 = num1 % 2;
        num2 = num1 / 2;
        res3 = num2 % 2;
        num3 = num2 / 2;
        res4 = num3 % 2;
        num4 = num3 / 2;
        res5 = num4 % 2;
        num5 = num4 / 2;
        res6 = num5 % 2;
        num6 = num5 / 2;
        res7 = num6 % 2;
        num7 = num6 / 2;
        res8 = num7 % 2;
        num8 = num7 / 2;
        if (res1 == 0) {
            bin1 = 0;
        } else {
            bin1 = 1;
        }
        if (res2 == 0) {
            bin2 = 0;
        } else {
            bin2 = 1;
        }
        if (res3 == 0) {
            bin3 = 0;
        } else {
            bin3 = 1;
        }
        if (res4 == 0) {
            bin4 = 0;
        } else {
            bin4 = 1;
        }
        if (res5 == 0) {
            bin5 = 0;
        } else {
            bin5 = 1;
        }
        if (res6 == 0) {
            bin6 = 0;
        } else {
            bin6 = 1;
        }
        if (res7 == 0) {
            bin7 = 0;
        } else {
            bin7 = 1;
        }
        if (res8 == 0) {
            bin8 = 0;
        } else {
            bin8 = 1;
        }
        System.out.println("El numero en binario es: " + bin8 + " " + bin7 + " " + bin6 + " " + bin5 + " " + bin4 + " " + bin3 + " " + bin2 + " " + bin1);
    }
}