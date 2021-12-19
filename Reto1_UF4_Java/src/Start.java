/*
 * Francesc Gómez Cano
 * 16/11/2021
 * DAM - Programación
 * Reto 1 UF4
 */

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //instanciamos scanner
		Empleado empEmpleado = new Empleado(); //instanciamos objeto empleado
		System.out.println("**************");
		System.out.println("**RETO 1 UF4**");
		System.out.println("**************");
		
		//Iniciación de los setters
		
		System.out.print("Introduce el nombre: ");
		String strNombre = sc.nextLine();
		empEmpleado.setStrNombre(strNombre);
	
		System.out.print("Introduce el apellido: ");
		String strApellido = sc.nextLine();
		empEmpleado.setStrApellido(strApellido);
		
		System.out.print("Introduce el dni: ");
		String strDni = sc.next();
		empEmpleado.setStrDni(strDni);
		
		System.out.print("Introduce la edad: ");
		int inEdad = sc.nextInt();
		empEmpleado.setInEdad(inEdad);
		
		System.out.print("Introduce el salario: ");
		float flSalario = sc.nextFloat();
		empEmpleado.setFlSalario(flSalario);
		
		//Iniciación de los getters
		
		System.out.println(empEmpleado.getStrNombre());
		System.out.println(empEmpleado.getStrApellido());
		System.out.println(empEmpleado.getStrDni());
		System.out.println(empEmpleado.getInEdad());
		System.out.println(empEmpleado.getFlSalario());
		
		//Función print
		
		System.out.println(empEmpleado.fncPrint()); 
	}

}
