package materialconts.edificios;

public class Fabrica extends Edificio {

	public Fabrica(float flAnchura, float flAltura, float flProfundiadd, String strMaterial, String strTipoEdificio,
			float flPrecioMercado, String strColor) {
		super(flAnchura, flAltura, flProfundiadd, strMaterial, strTipoEdificio, flPrecioMercado, strColor);

	}

	@Override
	public String fncFuncionalidadEdificio() {
		return "En la f�brica se crea el producto";
	}

}
