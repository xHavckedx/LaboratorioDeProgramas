package materialconts.productos;

import materialconts.edificios.Edificio;

public class Puertas extends Producto{

	public Puertas(String strNombre, float flAnchura, float flProfundidad, float flAltura,
			String strColor, Edificio edfEdificioActual) {
		super(strNombre, flAnchura, flProfundidad, flAltura, strColor, edfEdificioActual);
		this.strTipo = "Puerta";
	}

}
