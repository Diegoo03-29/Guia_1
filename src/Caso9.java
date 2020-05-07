import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lado1 = 0, lado2 = 0;
		
		System.out.print("Ingrese lado 1: ");
		lado1 = sc.nextInt();
		System.out.print("Ingrese lado 2: ");
		lado2 = sc.nextInt();
		
		System.out.println("-----------");
		System.out.println("Resultados");
		System.out.println("Area del rectangulo: " + (lado1*lado2));
		System.out.println("Perimetro: " + (lado1+lado2)*2);
	     
	

	}

}
