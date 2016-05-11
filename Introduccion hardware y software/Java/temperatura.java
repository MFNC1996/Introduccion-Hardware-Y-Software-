package ejercicios;

import java.util.Scanner;

class temperatura {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int temp[], i, min = 1000, max = 0, acum = 0, promedio = 0, busqueda = 0, cont = 0;
        temp = new int[24];
        i = 0;
        for (i = 0; i < 23; i++) {
            System.out.println("Ingrese temperatura en la hora " + " " + (i + 1));
            temp[i] = intro.nextInt();
        }
        for (i = 0; i < 23; i++) {
            System.out.println("La temperatura del dia a la hora " + " " + (i + 1) + "es" + " " + temp[i]);
        }
        for (i = 0; i < 23; i++) {
            if (temp[i] > max) {
                max = temp[i];
            } else if (temp[i] < min) {
                min = temp[i];
            }
            acum = temp[i] + acum;
            promedio = acum / 24;
        }
        System.out.println("La temperatura maxima es: " + max);
        System.out.println("La temperatura minima es: " + min);
        System.out.println("El promedio de las temperaturas es: " + promedio);
        System.out.println("Ingrese n° a buscar: ");
        busqueda = intro.nextInt();
        for (i = 0; i < temp.length; i = i + 1) {
            if (busqueda == temp[i]) {
                cont = cont + 1;
            }
            if (cont == 0) {
                System.out.println("El n° no esta");
                i = temp.length;
            }
        }
        if (cont > 0) {
            System.out.println("El numero se repite " + cont + " veces");
        }

    }
}

