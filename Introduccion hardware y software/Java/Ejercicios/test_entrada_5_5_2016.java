
import java.util.Scanner;

public class test_entrada_5_5_2016 {

    public static

    void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int preg = 0, cont = 0;
        do {
            do {
                System.out.println("Ingrese preguntas a responder(de 1 a 5. 6 termina la prueba)");
                System.out.println("Alumno" + (cont + 1));
                preg = intro.nextInt();
                switch (preg) {
                    case 1:
                        do {
                            System.out.println("¿Cuanto es 2 + 2");
                        } while (cont == 3);
                        
                        break;
                    case 2:
                        System.out.println("pregunta 2");
                        break;
                    case 3:
                        System.out.println("pregunta 3");
                        break;
                    case 4:
                        System.out.println("pregunta 4");
                        break;
                    case 5:
                        System.out.println("pregunta 5");
                        break;
                    case 6:
                        System.out.println("finaliza evaluacion");
                }
            } while (preg != 6);
            cont++;
        } while (cont == 3);
    }
}