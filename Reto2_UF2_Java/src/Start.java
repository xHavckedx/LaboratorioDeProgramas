import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		fncSaberPrimoOperacion();

	}

	
	private static void fncSaberPrimoOperacion() 
	{
		boolean bolPrimo = true;
		Scanner scNumero = new Scanner(System.in);
		System.out.print("Introduce un número para saber si es primo o no:");
		int inNumero = scNumero.nextInt();
		for(int i = inNumero -1; i >= 2; i--)
		{
			if(inNumero % i == 0)
			{
				bolPrimo = false;
				System.out.println("El número NO es primo");
				break;
			}
		}
		if(bolPrimo)
		{
			System.out.println("El número SI es primo");
		}
		scNumero.close();
	}
}
