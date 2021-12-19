/*
 * Autor: 		Francesc G�mez Cano
 * Asignatura: 	Programaci�n
 * Fecha:		24/09/2021
 * 
 */
import javax.swing.JOptionPane;

public class Start {

	public static void main(String[] args) {
		
		start();
	}

	private static void start(){
		try { // Si el usuario introduce s�lamente n�meros y sin espacios es correcto si no saltar al catch
		JOptionPane.showMessageDialog( null,"Inserte en orden la hora, los minutos y los segundos" );
		String jopHora = JOptionPane.showInputDialog( "Inserta las horas a continuaci�n" );
		String jopMinuto = JOptionPane.showInputDialog( "Inserta los minutos a continuaci�n." );
		String jopSegundo = JOptionPane.showInputDialog( "Inserta los minutos a continuaci�n." );
		
		int inHora = Integer.valueOf( jopHora );
		int inMinuto = Integer.valueOf( jopMinuto );
		int inSegundo = Integer.valueOf( jopSegundo );
		
		//El bloque almacena 3 variables tipo string y las convierte en tipo int y procede a ejecutar las condicones.
		
		if ( inHora >= 0 && inHora <= 23 && inMinuto >= 0 && inMinuto <= 59 && inSegundo >= 0 && inSegundo <= 59 ) {
			
			JOptionPane.showMessageDialog( null,"La hora es correcta " + inHora + "h " + inMinuto + "min " + inSegundo + "sg " );
		}else{
			
			JOptionPane.showMessageDialog( null,"La hora es incorrecta " + inHora + "h " + inMinuto + "min " + inSegundo + "sg " );	
		}
		}catch( NumberFormatException excepcion ){ //El usuario no ha introducido solo n�meros, le indicamos el error y si quiere volver a ejecutar el programa.
			
			String[] opciones = { "Continuar", "Salir" };
			JOptionPane.showMessageDialog( null,"Has introducido un dato de tipo string, porfavor inserte solamente n�meros y sin espacios." );
			int inseleccion = JOptionPane.showOptionDialog( null, "�Desea salir del programa o volver a ejecutarlo?", null, 0, 0, null, opciones, opciones[0] );
		
			switch ( inseleccion ) {
			
				case 0:
					start();
					break;
				case 1:
					System.exit(0);
					break;
			}
		}
	}
}