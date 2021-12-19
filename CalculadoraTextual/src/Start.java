import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Autor: 		Francesc G�mez Cano
 * Asignatura: 	Programaci�n
 * Fecha:		08/10/2021
 * 
 */

public class Start {

	static int inSeleccion;

	public static void main(String[] args) {

		fncStart();
	}

	private static void fncStart() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("###############");
			System.out.println("CALCULATOR S.A");
			System.out.println("###############");
			System.out.println("Introduzca una opci�n del men�: ");
			System.out.println("	0. Salir");
			System.out.println("	1. Sumar");
			System.out.println("	2. restar");
			System.out.println("	3. Multiplicar");
			System.out.println("	4. Dividir");
			System.out.println("	5. Resto (m�dulo)");
			System.out.println("	6. N�mero mayor de 3 n�meros");
			System.out.println("	7. Factorial");
			System.out.print("Introduzca una opci�n: ");
			int inSeleccion = sc.nextInt();
			switch (inSeleccion) {

			case 0: // salir
				System.out.println("El programa ha finalizado");
				System.exit(0);
				break;
			case 1: // sumar
				System.out.print("Introduzca el primer n�mero flotante a sumar: ");
				float flNum1 = sc.nextFloat();
				System.out.print("Introduzca el segundo n�mero flotante a sumar: ");
				float flNum2 = sc.nextFloat();
				System.out.println("La suma de " + flNum1 + " y " + flNum2 + " es " + fncSumar(flNum1, flNum2));
				fncStart();
				break;

			case 2: // restar
				System.out.print("Introduzca el primer n�mero flotante a restar: ");
				flNum1 = sc.nextFloat();
				System.out.print("Introduzca el segundo n�mero flotante a restar: ");
				flNum2 = sc.nextFloat();
				System.out.println("La resta de " + flNum1 + " y " + flNum2 + " es " + fncRestar(flNum1, flNum2));
				fncStart();
				break;

			case 3: // multiplicar
				System.out.print("Introduzca el primer n�mero flotante a multiplicar: ");
				flNum1 = sc.nextFloat();
				System.out.print("Introduzca el segundo n�mero flotante a multipicar: ");
				flNum2 = sc.nextFloat();
				System.out.println(
						"La multiplicaci�n de " + flNum1 + " y " + flNum2 + " es " + fncMultiplicar(flNum1, flNum2));
				fncStart();
				break;

			case 4: // Dividir
				System.out.print("Introduzca el primer n�mero flotante a dividir: ");
				flNum1 = sc.nextFloat();
				System.out.print("Introduzca el segundo n�mero flotante a dividir: ");
				flNum2 = sc.nextFloat();
				float flResultado = fncDividir(flNum1, flNum2);
				if (flResultado != -1) {
					System.out.println("La divisi�n de " + flNum1 + " y " + flNum2 + " es " + flResultado);
				} else {
					System.out.println("Error divisi�n por 0");
				}
				fncStart();
				break;

			case 5: // Resto
				System.out.print("Introduce el primer n�mero flotante a dividir: ");
				flNum1 = sc.nextFloat();
				System.out.print("Introduce el segundo n�mero flotante a dividir: ");
				flNum2 = sc.nextFloat();
				flResultado = fncResto(flNum1, flNum2);
				if (flResultado != -1) {
					System.out.println("El resto de " + flNum1 + " y " + flNum2 + " es " + flResultado);
				} else {
					System.out.println("Error divisi�n por 0");
				}
				fncStart();
				break;

			case 6: // N�mero mayor de 3 n�meros
				System.out.println("Introduce el primer n�mero flotante ");
				flNum1 = sc.nextFloat();
				System.out.println("Introduce el segundo n�mero flotante ");
				flNum2 = sc.nextFloat();
				System.out.println("Introduce el primer n�mero flotante ");
				float flNum3 = sc.nextFloat();
				flResultado = fncNumeros3(flNum1, flNum2, flNum3);
				if (flResultado != -1) {
					System.out.println("El n�mero " + flResultado + " Es el mayor de los 3 n�meros.");
				} else {
					System.out.println("Todos los n�mero son iguales.");
				}
				fncStart();
				break;

			case 7: // Factorial
				System.out.println("Introduzca un n�mero para calcular el factorial: ");
				int inNum1 = sc.nextInt();
				int inResultado = fncFactorial(inNum1);
				if (inResultado != -1) {
					System.out.println("El factorial de " + inNum1 + " es " + inResultado);
				} else {
					System.out.println("Error valor inferior a 0, introduzca un valor superior a 0");
				}
				fncStart();
				break;
				
			default:
				System.out.println("Opci�n err�nea");
				fncStart();
				break;
				
			}

			sc.close();
			System.out.println("Opci�n err�nea");
			fncStart();

		} catch (InputMismatchException excepcion) {
			System.out.println(" ");
			System.out.println("Opci�n err�nea, has introducido un dato de de tipo String, un valor no admitido");
			fncStart();
		}
		
	}

	private static float fncSumar(float a, float b) {

		float resultado = a + b;
		return resultado;

	}

	private static float fncRestar(float a, float b) {

		float resultado = a - b;
		return resultado;

	}

	private static float fncMultiplicar(float a, float b) {

		float resultado = a * b;
		return resultado;

	}

	private static float fncDividir(float a, float b) {

		if (b != 0) {
			float resultado = a / b;
			return resultado;
		} else {
			return -1.0f;
		}
	}

	private static float fncResto(float a, float b) {

		if (b != 0) {
			float resultado = a % b;
			return resultado;
		} else {
			return -1;
		}
	}

	private static float fncNumeros3(float a, float b, float c) {

		if ((a == b) && (a == c)) {
			return -1;
		} else if ((a > b) && (a > c)) {
			return a;
		} else if ((b > a) && (b > c)) {
			return b;
		} else {
			return c;
		}
	}

	private static int fncFactorial(int a) {
		int inResultado = a;
		if (a >= 1) {
			for (int i = a - 1; i >= 1; --i) {
				inResultado = inResultado * i;
			}
			return inResultado;
		} else {
			return -1;
		}

	}

}
