import java.util.Scanner;
public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese Altura: ");
		double altura=sc.nextDouble();
		System.out.println("ingrese Base: ");
		double base = sc.nextDouble();
		
		double area = ((base * altura)/2);
		
		System.out.println("Área del triángulo es: "+ area);
		

	}

}
