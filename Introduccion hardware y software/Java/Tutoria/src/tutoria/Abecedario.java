package tutoria;

public class Abecedario {

    public static void main(String[] args) {
        char letra = 'a';
        char abecedario[] = new char[24];
        for (int i = 0; i < abecedario.length; i++) {
            abecedario[i] = letra++;
            System.out.println(" " + abecedario[i] + " ");
        }
    }
}