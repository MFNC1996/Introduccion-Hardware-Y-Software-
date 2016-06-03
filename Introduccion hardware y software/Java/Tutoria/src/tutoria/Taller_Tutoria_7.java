package tutoria;

public class Taller_Tutoria_7 {
    public static void main(String[] args) {
        int array [][]= new int[3][3];
        for(int i =0; i < array.length;i++){
        array[0][0]= 1; array [0][1]=1;array[0][2] = 1; 
        array[1][0]=0;array[1][1]=0;array[1][2]=0;
        array[2][0]=1;array[2][1]=1;array[2][2]=1;
        System.out.println(array[0][1]+" "+array[0][1]+" "+array[0][2]);


        }
    }
}