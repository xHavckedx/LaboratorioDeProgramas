import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Init {

	public static void main(String[] args) throws IOException {
		
		float flContador = 0.00f;
		float flNotas = 0.00f;
		float flMedia = 0.00f;
		String ruta = "./notasPepe.txt";
		String lineaTexto = "";
		
		File fFile = new File(ruta);
		BufferedReader brReader = new BufferedReader(new FileReader(fFile));
		
		for( int i = 1; (lineaTexto = brReader.readLine()) != null && i <=30 ; i++ ){
			int inPosicion = lineaTexto.indexOf(" ");
			flNotas = flNotas + Float.valueOf(lineaTexto.substring(inPosicion +1));
			++flContador;
		}
		flMedia = flNotas/flContador;
		System.out.printf("La media de las notas es: " + "%.2f", + flMedia);
	}

}
