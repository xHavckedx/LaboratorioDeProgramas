/*
 * Francesc Gómez Cano
 * 17/11/2021
 * DAM - Programación
 * UF4 Reto 2
 */
public class Start {

	public static void main(String[] args) {

		Persona perPersonaLeo = new Persona("Leo", "49221327Q", "Hombre", 178.8f, 183f, 21);
		Persona perPersonaSisco = new Persona("Sisco", "49221328Q", "Hombre", 180f, 170f, 52);
		Persona perPersonaAriadna = new Persona(null, null, null, 0, 0, 0);
		
		//setters de la clase Persona
		perPersonaAriadna.setNombre("Ariadna");
		perPersonaAriadna.setDni("49221329Q");
		perPersonaAriadna.setSexo("Mujer");
		perPersonaAriadna.setPeso(57f);
		perPersonaAriadna.setAltura(166f);
		perPersonaAriadna.setEdad(24);
		
		//setters de la clase Familia
		perPersonaAriadna.setDireccion("C/Bartolomé nº 22");
		perPersonaAriadna.setPoblacion("Santa Perpétua De Mogoda");
		perPersonaAriadna.setProvincia("Barcelona");
		perPersonaAriadna.setLibroFamilia(284);
		
		//getters de la clase persona
		System.out.println("Getters de la clase Persona");
		System.out.println(perPersonaAriadna.getNombre());
		System.out.println(perPersonaAriadna.getDni());
		System.out.println(perPersonaAriadna.getSexo());
		System.out.println(perPersonaAriadna.getPeso());
		System.out.println(perPersonaAriadna.getAltura());
		System.out.println(perPersonaAriadna.getEdad());
		
		System.out.printf("El IMC de ariadna es: " + "%.0f", perPersonaAriadna.fncIMC());
		System.out.println();
		System.out.println();
		
		//getters de la clase familia
		System.out.println("Getters de la clase Familia");
		System.out.println(perPersonaAriadna.getDireccion());
		System.out.println(perPersonaAriadna.getPoblacion());
		System.out.println(perPersonaAriadna.getProvincia());
		System.out.println(perPersonaAriadna.getLibroFamilia());
	}

}
