import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strRuta = "./";
		Boolean blTipo = false;

		do {
			System.out.println("*********************************");
			System.out.println("         EDITOR DE TEXTO         ");
			System.out.println("*********************************");
			System.out.println("");
			System.out.println("Seleccione un opción");
			System.out.println("1) Crear un fichero");
			System.out.println("2) Editar un fichero");
			System.out.println("3) Borrar un fichero");
			System.out.println("4) Crear una carpeta");
			System.out.println("5) Borrar una carpeta");
			System.out.println("0) Salir");
			System.out.print("Opción:_");
			int inOpcionMenu = sc.nextInt();
			switch (inOpcionMenu) {
			case 0:
				System.out.println("Programa finalizado");
				System.exit(inOpcionMenu);
				break;
			case 1:
				System.out.print("Introduzca el nombre del fichero: ");
				String strFichero = strRuta + sc.next();
				fncCrearFichero(strFichero);
				break;
			case 2:
				System.out.print("Introduzca el nombre del fichero a editar: ");
				strFichero = strRuta + sc.next();
				fncEditarFichero(strFichero);
				break;
			case 3:
				System.out.print("Introduzca el nombre del fichero a borrar: ");
				strFichero = strRuta + sc.next();
				fncBorrarFichero(strFichero);
				break;
			case 4:
				System.out.print("Introduzca el nombre de la carpeta a crear: ");
				String strCarpeta = strRuta + sc.next();
				fncCrearCarpeta(strCarpeta);
				break;
			case 5:
				System.out.print("Introduzca el nombre de la carpeta a borrar: ");
				strCarpeta = strRuta + sc.next();
				fncBorrarCarpeta(strCarpeta);
				break;
			}
		} while (true);
	}

	private static void fncCrearFichero(String ruta) {
		File fFile = new File(ruta);
		if (fFile.exists()) {
			try {
				fFile.delete();
				fFile.createNewFile();
				System.out.println("El archivo ya existe, se ha sobrescrito satisfactoriamente.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				fFile.createNewFile();
				System.out.println("Se ha creado el archivo satisfactoriamente.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void fncEditarFichero(String ruta) {
		File fFile = new File(ruta);
		Scanner sc = new Scanner(System.in);
		if (!fFile.exists()) {
			System.out.println("Fichero inexistente");
		} else {
			try {
				System.out.println("Introduzca el texto que desea añadir al fichero:");
				// String strTexto = sc.next();
				String strTexto1 = sc.nextLine();
				FileWriter fwTexto = new FileWriter(fFile, true);
				PrintWriter pwTexto = new PrintWriter(fwTexto);
				pwTexto.println(strTexto1);
				pwTexto.close();
				System.out.println("Documento editado correctamente");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private static void fncBorrarFichero(String ruta) {
		File fFile = new File(ruta);
		Scanner sc = new Scanner(System.in);
		if (!fFile.exists()) {
			System.out.println("Fichero inexistente");
		} else {
			System.out.println("¿Está seguro que desea borrarlo (Afirmación Si)?");
			String strValidacion = sc.next();
			if (strValidacion.equalsIgnoreCase("si")) {
				fFile.delete();
				System.out.println("Se ha borrado satisfactoriamente");
			}else {
			}
		}
	}
	
	private static void fncCrearCarpeta(String ruta) {
		File fFile = new File(ruta);
		if (fFile.isDirectory()) {
			System.out.println("Carpeta ya existente");
		} else {
			fFile.mkdir();
			System.out.println("Carpeta creada satisfactoriamente.");
		}
	}
	
	private static void fncBorrarCarpeta(String ruta) {
		File fFile = new File(ruta);
		Scanner sc = new Scanner(System.in);
		if (!fFile.isDirectory()) {
			System.out.println("Carpeta inexistente");
		} else {
			System.out.println("¿Está seguro que desea borrarlo (Afirmación Si)?");
			String strValidacion = sc.next();
			if (strValidacion.equalsIgnoreCase("si")) {
				fFile.delete();
				System.out.println("Se ha borrado satisfactoriamente");
			}else {
			}
		}
	}
}
