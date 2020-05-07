import java.util.Scanner;
public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor de la venta: ");
		double venta= sc.nextDouble();
		
		double porcentaje = venta*0.42;
		double aumento= porcentaje + venta;
		
		System.out.println("El aumento es: "+ aumento+" soles.");
	}

}
