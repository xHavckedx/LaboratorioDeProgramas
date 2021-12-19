/*
 * Francesc G�mez Cano
 * 18/11/2021
 * DAM - Programaci�n
 * Ejercicio Evaluable 4
 */
package materialconts;
import javax.net.ssl.CertPathTrustManagerParameters;
import materialconts.edificios.Almacen;
import materialconts.edificios.Fabrica;
import materialconts.edificios.Oficina;
import materialconts.empresa.Empresa;
import materialconts.productos.Producto;
import materialconts.productos.Puertas;
import materialconts.productos.Silla;
import materialconts.productos.Ventanas;
import materialconts.vehiculos.VehiculoElectrico;
import materialconts.vehiculos.VehiculoGasoil;
import materialconts.vehiculos.VehiculoGasolina;

public class Start {

	public static void main(String[] args) {
		//Creamos los objetos necesarios para la actividad
		Empresa empEmpresa = new Empresa();
		VehiculoGasolina vgHonda = new VehiculoGasolina("Honda", 80, true, 24000, 1200, "Blanco", 200, 20, 300);
		VehiculoGasoil vgRenault = new VehiculoGasoil("Renault", 80, true, 24000, 1200, "Negro", 200, 20, 300);
		VehiculoElectrico vhMaclaren = new VehiculoElectrico("Maclaren",50,true,120000,1000,"Naranja",200,800,320);
		VehiculoElectrico vhFerrari = new VehiculoElectrico("Ferrari",50,true,120000,1000,"Rojo",200,800,320);
		Almacen almAlmacen = new Almacen(30, 5, 20, "Ladrillo", "Almac�n", 80000, "Blanco");
		Fabrica fbcFabrica = new Fabrica(10, 3, 20, "Ladrillos", "Fabrica", 20000, "Blanco");
		Oficina ofcOficina = new Oficina(10, 3, 20, "Ladrillos", "Fabrica", 20000, "Blanco");
		Puertas prtPuerta1 = new Puertas("Puerta1", 1, 0.20f, 2, "Marr�n", ofcOficina);
		Puertas prtPuerta2 = new Puertas("Puerta2", 1, 0.20f, 2, "Blanca", ofcOficina);
		Silla sllSilla1 = new Silla("Silla1", 0.30f, 0.20f, 1, "Blanco", ofcOficina);
		Silla sllSilla2 = new Silla("Silla2", 0.30f, 0.20f, 1, "Verde", ofcOficina);
		Ventanas vntVentana1 = new Ventanas("Ventana1", 0.90f, 0.10f, 1, "Plateado", ofcOficina);
		Ventanas vntVentana2 = new Ventanas("Ventana2", 0.90f, 0.10f, 1, "Dorada", ofcOficina);
		
		//comprobaci�n de la interfaz frenar
		vgHonda.frenar(30);
		vgRenault.frenar(30);
	
		//funcionamiento de los m�todos crear producto y vender prodructo
		empEmpresa.fncCrearProducto(vgHonda);
		empEmpresa.fncCrearProducto(vgRenault);
		empEmpresa.fncCrearProducto(vhFerrari);
		empEmpresa.fncVenderProducto(vgRenault);
		empEmpresa.fncVenderProducto(vhFerrari);
		empEmpresa.fncPrint(); /*este m�todo imprime los coches que hay en 
							    *el garaje si solo hay 1 imprime 1 y si hay 
							    *m�s imprime un m�ximo de 3*/
		
		//comprobamos el metodo funcinalidadedificio que nos permite comprobar para que sirve cada edificio.
		System.out.println(almAlmacen.fncFuncionalidadEdificio());
		System.out.println(fbcFabrica.fncFuncionalidadEdificio());
		System.out.println(ofcOficina.fncFuncionalidadEdificio());
		
		/*este metodo nos dice el coste total de pintar nuestro edificio, ingresando por parametro el color y el coste del metro
		*el color del edificio cambiar�a al que se establece en la funci�n*/
		System.out.printf("%.2f", fbcFabrica.fncCostePintura("Verde", 30));
		System.out.println(" euros");
		System.out.println(fbcFabrica.getStrColor());
		
		//aqu� mostramos como cada objeto creado se crea con un ID diferente, sin tener que meterlo por par�metro.
		System.out.println(prtPuerta1.getID());
		System.out.println(prtPuerta2.getID());
		System.out.println(sllSilla1.getID());
		System.out.println(sllSilla2.getID());
		System.out.println(vntVentana1.getID());
		System.out.println(vntVentana2.getID());
		
		//comprobamos la funcionalidad del almacen y de que se pueden vender los productos.
		empEmpresa.fncCrearProducto(prtPuerta1);
		empEmpresa.fncCrearProducto(prtPuerta2);
		empEmpresa.fncCrearProducto(sllSilla1);
		empEmpresa.fncCrearProducto(sllSilla2);
		empEmpresa.fncCrearProducto(vntVentana1);
		empEmpresa.fncCrearProducto(vntVentana2);

		empEmpresa.fncVenderProducto(prtPuerta1);
		empEmpresa.fncVenderProducto(sllSilla1);
		
		//aqu� creamos 2 productos m�s y podemos cambiarles la ID correctamente.
		Puertas prtPuerta3 = new Puertas("Puerta1", 1, 0.20f, 2, "Marr�n", ofcOficina);
		Puertas prtPuerta4 = new Puertas("Puerta1", 1, 0.20f, 2, "Marr�n", ofcOficina);
		prtPuerta3.setInID(2);
		prtPuerta4.setInID(10);
		System.out.println(prtPuerta3.getID());
		System.out.println(prtPuerta4.getID());
	}

}
