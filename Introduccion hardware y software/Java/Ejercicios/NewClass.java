package ejercicios;

public class NewClass {

    public static void main(String[] args) {
        int a[] = new int[6];
        int i, j;
        for (i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (1 + 20));
            System.out.println("el numero al azar es: " + " " + a[i]);
        }
        while (true) {
            for (i = 1; i < a.length - 1; i++) {
                if (a[i] < a[i - 1]) {
                    j = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = j;
                    System.out.println(a[i]);
                }
            }
        }
    }
}
