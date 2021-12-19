/*
 * Autor: Francesc Gómez Cano
 * 05/10/2021
 * Programación B
 * Reto 2
 */

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
	//	fncContadorDia();
		fncSaberPrimoPar();

	}
	
	public static void fncContadorDia() {
		String[] strDia = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
		Scanner scInputDia = new Scanner(System.in);
		System.out.print("Introduce un número: ");
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
		System.out.print("Introduce un número para saber si es par o no.");
		int inInputNumero = scInputNumero.nextInt();
		--inInputNumero;
		for(int i = 2; inInputNumero<=2; ++inInputNumero)
		{
			if(inInputNumero % i == 0)
			{
				System.out.println("El número " + inInputNumero + " es par.");
				
			}
			 else 
			{
				System.out.println("El número " + inInputNumero + " es inpar.");
			}
		}
		scInputNumero.close();
	}
}
