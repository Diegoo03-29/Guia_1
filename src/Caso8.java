import java.util.Scanner;
public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lado = 0; 
		
		System.out.println("Ingrese valor: ");
		lado = sc.nextInt();
		
		System.out.println("------");
		System.out.println("Area: " + lado*lado );
		System.out.println("Perimetro: " + lado * 4);
		

	}

}
