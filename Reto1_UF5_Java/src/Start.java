import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		int intNumeroEmpleados = 0;
		String[] strNombreEmpleado = null;
		int[] intSalarioEmpleado = null;
		int intSalarioTotal = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**************");
		System.out.println("**Reto 1 UF5**");
		System.out.println("**************");
		System.out.println("");
		System.out.print("Introduce el número de empleados: ");
		intNumeroEmpleados = sc.nextInt();
		intSalarioEmpleado = new int[intNumeroEmpleados];
		strNombreEmpleado =  new String [intNumeroEmpleados];
		
		for(int i = 0; i < intNumeroEmpleados; i++){
	
			System.out.print("Ingresa el nombre del empleado " + (i+1) + ":");
			strNombreEmpleado[i] = sc.next();
			System.out.print("Ingresa el salario del empleado " + (i+1) + ":");
			intSalarioEmpleado[i] = sc.nextInt();	
		}
		
		for(int i = 0; i < intNumeroEmpleados; i++) {
			System.out.println("Nombre: " + strNombreEmpleado[i] + " Salario: " + intSalarioEmpleado[i]);
			intSalarioTotal += intSalarioEmpleado[i];
		}
		System.out.println("El salario medio es: " + (intSalarioTotal / intNumeroEmpleados));
	}

}
