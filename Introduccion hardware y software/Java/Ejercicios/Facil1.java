package Ejecicios;

import java.util.Scanner;

public class Facil1 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        String[] apellido = new String[5];
        String[] nombre = new String[5];
        int i;
        System.out.println("Ingrese Apellidos");
        for (i = 0; i < 5; i++) {
            apellido[i] = intro.next();
        }
        System.out.println("Ingrese Nombres");
        for (i = 0; i < 5; i++) {
            nombre[i] = intro.next();
        }
        for (i = 0; i < 5; i++) {
            System.out.println("Nombre: " + nombre[i] + " " + "Apellido: " + apellido[i]);
        }
    }
}
