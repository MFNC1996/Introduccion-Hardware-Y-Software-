package ejemplos;
import java.util.Scanner;
public class ParImpar {

	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		int num;
		System.out.println("Ingrese numero");
		num = intro.nextInt();
		if(num%2==0){
		System.out.println("es par");
		}else{
			System.out.println("es impar");
		}
	}
}
