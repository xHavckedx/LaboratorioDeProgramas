import Objetos.Coche;
import Objetos.Concesionario;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Concesionario concesionario1=new Concesionario();
		concesionario1.setNombreEdificio("Concesionario Manolo");
		//concesionario1.print();
		
		Coche c1=new Coche();
		c1.setColor("Amarillo");
		
		Coche c2=new Coche();
		c2.setMarca("Renault");
		c2.setColor("Amarillo");
		
		Coche c3=new Coche();
		c3.setMarca("Seat");
		c3.setColor("Azul");
		
		Coche c4=new Coche();
		c4.setMarca("Ferrari");
		c4.setColor("Rojo");

		//concesionario1.setCoche1(c1);
		//concesionario1.setCoche2(c2);
		concesionario1.setCoche3(c3);
		
		concesionario1.print();
		System.out.println("*******************************");
		System.out.println("*****Añadir coche al concesionario*****");
		if(concesionario1.comprar(c1))
		{
			System.out.println("El coche se ha añadido correctamente");
		}
		else
		{
			System.out.println("Concesionario completo");
		}
		
		System.out.println("*****Vender coche del concesionario*****");
		if(concesionario1.vender(c1))
		{
			System.out.println("El coche se ha vendido correctamente");
		}
		else
		{
			System.out.println("El concesionario no posee el coche");
		}
		//concesionario1.print();
		
		
		concesionario1.print();
	}

}
