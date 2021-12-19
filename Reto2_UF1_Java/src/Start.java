/*
 * Autor: Francesc G�mez Cano
 * 05/10/2021
 * Programaci�n B
 * Reto 2
 */

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
	//	fncContadorDia();
		fncSaberPrimoPar();

	}
	
	public static void fncContadorDia() {
		String[] strDia = {"Lunes","Martes","Mi�rcoles","Jueves","Viernes","S�bado","Domingo"};
		Scanner scInputDia = new Scanner(System.in);
		System.out.print("Introduce un n�mero: ");
		int inInputDia = scInputDia.nextInt();
		if((inInputDia < 8) && (inInputDia > 0)) {
			System.out.println(strDia[inInputDia -1]);
			scInputDia.close();
		}else{
			System.out.println("Error");
		}
	}
	
	public static void fncSaberPrimoPar()
	{
		Scanner scInputNumero = new Scanner(System.in);
		System.out.print("Introduce un n�mero para saber si es par o no.");
		int inInputNumero = scInputNumero.nextInt();
		--inInputNumero;
		for(int i = 2; inInputNumero<=2; ++inInputNumero)
		{
			if(inInputNumero % i == 0)
			{
				System.out.println("El n�mero " + inInputNumero + " es par.");
				
			}
			 else 
			{
				System.out.println("El n�mero " + inInputNumero + " es inpar.");
			}
		}
		scInputNumero.close();
	}
}
