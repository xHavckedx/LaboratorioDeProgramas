import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class Start {
	public Start(){
		try {
			DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException {
	
			fncMenu();
	}
	
	//FUNCIONES

	private static void fncMenu() throws SQLException {
		int inSeleccion = 0;
		Scanner scScan = new Scanner(System.in);
		
		System.out.println("*******Gestor De Productos*******");
		System.out.println("1) Crear un producto");
		System.out.println("2) Listar todos los productos");
		System.out.println("3) Modificar un producto");
		System.out.println("4) Borrar un producto");
		System.out.println("5) Salir del programa");
		System.out.print("\nOpción: ");
		inSeleccion = scScan.nextInt();
		
		switch(inSeleccion) {
			case 1:
				fncCrearProductoBaseDatos();
				fncMenu();
				break;
			case 2:
				fncListarProductoBaseDatos();
				fncMenu();
				break;
			case 3:
				fncModificarProductoBaseDatos();
				fncMenu();
				break;
			case 4:
				fncBorrarProductoBaseDatos();
				fncMenu();
				break;
			case 5:
				System.out.println("El programa ha finalizado correctamente.");
				System.exit(1);
				break;
			default:
				System.exit(1);
				break;
		}
	}
	private static void fncCrearProductoBaseDatos() throws SQLException {	
		Scanner scScan = new Scanner(System.in);
		String strNombre;
		Float flPrecio;
		int inCantidad;
		int inID;
		Connection cntConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ifp", "root", "");
		Statement stmInstancia = (Statement) cntConexion.createStatement();
		System.out.println("Introduce el id del producto: ");
		inID = scScan.nextInt();
		System.out.println("Introduce el nombre del producto: ");
		strNombre = scScan.next();
		System.out.println("Introduce el precio: ");
		flPrecio = scScan.nextFloat();
		System.out.println("Introduce la cantidad: ");
		inCantidad = scScan.nextInt();
		try{
			if(!stmInstancia.execute("INSERT INTO `tienda` (id,nombre, precio, cantidad) VALUES ("+inID+",'"+strNombre+"', '"+flPrecio+"', '"+inCantidad+"') ")){
				System.out.println("Se ha creado el producto correctamente");
			} else {
				System.out.println("Error al crear el producto");
			}
		} catch(SQLException MySQLIntegrityConstraintViolationException) {
			System.out.println("Esta ID ya existe, porfavor, introduzca una id nueva.");
		}
		cntConexion.close();
	}
	private static void fncListarProductoBaseDatos() throws SQLException {	
		Scanner scScan = new Scanner(System.in);
		DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
		Connection cntConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ifp", "root", "");
		Statement stmInstancia = (Statement) cntConexion.createStatement();
		ResultSet rslResult = stmInstancia.executeQuery("SELECT * FROM `tienda`");
		System.out.println("ID - NOMBRE - PRECIO - CANTIDAD");
		while(rslResult.next()) {
			System.out.println(rslResult.getInt("Id")+" - " + rslResult.getString("nombre")+ " - " + rslResult.getFloat("precio")+ " - " + rslResult.getInt("Cantidad"));
		}
		cntConexion.close();
	}
	private static void fncModificarProductoBaseDatos() throws SQLException {	
		Scanner scScan = new Scanner(System.in);
		String strNombre;
		Float flPrecio;
		int inCantidad;
		int inID;
		Connection cntConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ifp", "root", "");
		Statement stmInstancia = (Statement) cntConexion.createStatement();
		System.out.println("Introduce el id del producto: ");
		inID = scScan.nextInt();
		System.out.println("Introduce el nombre del producto: ");
		strNombre = scScan.next();
		System.out.println("Introduce el precio: ");
		flPrecio = scScan.nextFloat();
		System.out.println("Introduce la cantidad: ");
		inCantidad = scScan.nextInt();
		if(!stmInstancia.execute("UPDATE `tienda` SET nombre='"+strNombre+"',precio="+flPrecio+",cantidad="+inCantidad+" WHERE id="+inID+"")) {
			System.out.println("Se ha actualizado satisfactoriamente el producto.");
		} else {
			System.out.println("Error al actualizar el producto.");
		}
		cntConexion.close();
	}
	private static void fncBorrarProductoBaseDatos() throws SQLException {	
		Scanner scScan = new Scanner(System.in);
		int id = 0;
		Connection cntConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ifp", "root", "");
		Statement stmInstancia = (Statement) cntConexion.createStatement();
		System.out.println("Indica la id del producto que quieres borrar");
		id = scScan.nextInt();
		;
		if(!stmInstancia.execute("DELETE FROM `tienda` WHERE id="+id)) {
			System.out.println("Borrado satisfactoriamente.");
		} else {
			System.out.println("Error al borrar.");
		}
		cntConexion.close();
	}
}