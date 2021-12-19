package materialconts.productos;

import materialconts.edificios.Edificio;

public class Ventanas extends Producto{

	public Ventanas(String strNombre, float flAnchura, float flProfundidad, float flAltura,
			String strColor, Edificio edfEdificioActual) {
		super(strNombre, flAnchura, flProfundidad, flAltura, strColor, edfEdificioActual);
		this.strTipo = "Ventana";
	}
}
