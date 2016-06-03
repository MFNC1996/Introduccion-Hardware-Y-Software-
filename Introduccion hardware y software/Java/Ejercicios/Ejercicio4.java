package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int nAlu, i=0,n1,n2,n3;
        System.out.println("Ingrese Numero de alumnos");
        nAlu = intro.nextInt();
        for (i = 0; i > nAlu; i++) {
            System.out.println("Ingrese 3 notas del estudiante"+i);
            n1 = intro.nextInt();
            n2 = intro.nextInt();
            n3 = intro.nextInt();
        }
    }
}
