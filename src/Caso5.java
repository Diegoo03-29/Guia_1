import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	float n1 = 0, n2 = 0;
	float promedio, aumento, disminuido;
	
	System.out.print("Ingrese primer numero: ");
	n1 = sc.nextFloat();
	System.out.print("Ingrese segundo numero: ");
	n2 = sc.nextFloat();
	
	promedio = (n1+n2)/2;
	aumento = (float) (n1 * 1.2);
	disminuido = (float) (n1 * 0.7);
	
	System.out.println("Resultado 1: " + promedio);
	System.out.println("Resultado 2 :" + aumento);
	System.out.println("Resultado 3: " + disminuido);
	
	
			

	
	}

}
