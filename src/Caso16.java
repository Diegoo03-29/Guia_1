import java.util.Scanner;
public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese horas trabajadas: ");
		double horas=sc.nextInt();
		System.out.print("ingrese tarifa por hora: ");
		double tarifa = sc.nextDouble();
		
		double sueldo = horas * tarifa;
		double bono = sueldo / 20;
		double total = sueldo + bono;
		double  td = total / 3.24;
		
		System.out.println("Sueldo: "+ sueldo);
		System.out.println("Bono: "+bono);
		System.out.println("Total: "+total);
		System.out.println("Total en dolares: "+td);
		

	}

}
