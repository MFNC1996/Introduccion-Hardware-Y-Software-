package ejercicios;

import java.util.Scanner;

public class Ejercicios2 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int passUser = 1234, passAdmin = 6789, totalDin = 1000000, dinero = 0, pass, selecUser = 0, cantDeseada, newPass, resp = 0, selecAdmin = 0, deposito, newPassUser, newPassAdmin;
        do {
            System.out.println("Bienvenido al banco");
            System.out.println("Ingrese su contraseña");
            pass = intro.nextInt();
            if (pass == passUser) {
                System.out.println("Bienvenido Usuario");
                System.out.println("Que desea hacer" + " " + "1.-Sacar dinero" + " " + "2.-Consultar Saldo" + " " + "3.-Cambiar Contraseña" + " " + "4.-Salir");
                selecUser = intro.nextInt();
                do {
                    switch (selecUser) {
                        case 1:
                            System.out.println("Ingrese cantidad deseada");
                            cantDeseada = intro.nextInt();
                            dinero = totalDin - cantDeseada;
                            break;
                        case 2:
                            System.out.println("Su saldo es: " + dinero);
                            break;
                        case 3:
                            System.out.println("Ingrese contraseña antigua");
                            pass = intro.nextInt();
                            if (pass == passUser) {
                                System.out.println("Ingrese nueva contraseña");
                                newPass = intro.nextInt();
                                passUser = newPass;
                            } else {
                                System.out.println("Contraseña ingresada no valida");
                            }
                            break;
                        case 4:
                            System.out.println("Hasta pronto....");
                            break;
                    }
                } while (selecUser == 3);
            } else if (pass == passAdmin) {
                System.out.println("Bienvenido Administrador");
                System.out.println("¿Que desea hacer?" + " " + "1.-Depositar" + " " + "2.-Cambiar claves" + " " + "3.-Consultar Saldo" + " " + "4.-Salir");
                selecAdmin = intro.nextInt();
                do {
                    switch (selecAdmin) {
                        case 1:
                            System.out.println("Ingrese cantidad a depositar");
                            deposito = intro.nextInt();
                            totalDin = deposito + totalDin;
                            break;
                        case 2:
                            System.out.println("Ingrese contraseña antigua");
                            pass = intro.nextInt();
                            if (pass == passUser) {
                                System.out.println("Ingrese nueva contraseña de Usuario");
                                newPassUser = intro.nextInt();
                                passUser = newPassUser;
                            } else if (pass == passAdmin) {
                                System.out.println("Ingrese nueva contraseña de Administrador");
                                newPassAdmin = intro.nextInt();
                                passAdmin = newPassAdmin;
                            }
                            break;
                        case 3:
                            System.out.println("El saldo es: " + " " + dinero);
                            break;
                        case 4:
                            System.out.println("Hasta pronto...");
                            break;
                    }
                } while (selecAdmin == 3);
            }
            System.out.println("¿Desea apagar el cajero?" + " " + "1.-Si" + " " + "2.-No");
            resp = intro.nextInt();
        } while (resp == 2);
    }
}
