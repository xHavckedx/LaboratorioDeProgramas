package materialconts.productos;

import materialconts.edificios.Edificio;

public class Silla extends Producto{

	public Silla(String strNombre, float flAnchura, float flProfundidad, float flAltura,
			String strColor, Edificio edfEdificioActual) {
		super(strNombre, flAnchura, flProfundidad, flAltura, strColor, edfEdificioActual);
		this.strTipo = "Silla";	
	}
}
