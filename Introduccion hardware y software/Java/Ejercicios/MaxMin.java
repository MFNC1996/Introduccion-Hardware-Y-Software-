package ejemplos;
import java.util.Scanner;
public class MaxMin {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		int a=0,max=0,min=100,cont=0;
		do{
			System.out.println("Ingrese  numero");
			a=intro.nextInt();
			if(a>=max)
				max=a;
			if(a<=min)
				min=a;
			cont++;
		    }while(cont<5);
			System.out.println("maximo:"+"  "+max+"minimo:"+min);	
		}
	}
