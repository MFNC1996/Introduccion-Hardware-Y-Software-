package tutoria;

public class NewClass {

    public static void main(String[] args) {
        int array[] = {4, 3, 2, 1, 5};
        int aux;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j + 1] = aux;
                    System.out.println(array[i]);
                }
            }
        }
    }
}
