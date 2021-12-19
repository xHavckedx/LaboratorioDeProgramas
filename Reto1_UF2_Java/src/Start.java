import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		fncMorse();
	}

	private static void fncMorse()
	{
	    Scanner scPalabra = new Scanner(System.in);
		String strMorse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", // a-i
	            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", // j-q
	            ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",  // r-" "
	            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", // A-G
	            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", // H-P
	            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", // Q-X
	            "-.--", "--..", "......." }; // Y-Z
	    String strAbecedario = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String strResultado = "";
	    System.out.print("Introduce la palabra a convertir: ");
	    String strPalabra = scPalabra.nextLine();
	    for(int j= 0; j < strPalabra.length(); j++)
	    { 
		    for(int i = 0; i < strAbecedario.length(); ++i)
		    {
		    	if(strPalabra.charAt(j) == strAbecedario.charAt(i)) 
		    	{	
		    		strResultado = strResultado + " " + strMorse[i];
		    	}
		    }
	    }
	    System.out.println(strResultado);
	    scPalabra.close();
	    
	}
}
