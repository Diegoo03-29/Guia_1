import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//Definicion de variables//
	float n1 = 0, n2 = 0;
	float suma, resta, division, producto;
	
	System.out.print("Ingrese primer valor: ");
	n1 = sc.nextFloat();
	System.out.print("Ingrese segundo valor: ");
	n2 = sc.nextFloat();
	
	suma = n1 + n2;
	resta = n1 - n2;
	division = n1 / n2;
	producto = n1 * n2;
	
	System.out.println("Resultado");
	System.out.println("----------");
	System.out.println("Suma: " + suma);
	System.out.println("Resta: " + resta);
	System.out.println("Producto: " + producto);
	System.out.println("Division: " + division);
	
	}

}
