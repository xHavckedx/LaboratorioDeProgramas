package materialconts.edificios;

public class Almacen extends Edificio {

	public Almacen(float flAnchura, float flAltura, float flProfundiadd, String strMaterial, String strTipoEdificio,
			float flPrecioMercado, String strColor) {
		super(flAnchura, flAltura, flProfundiadd, strMaterial, strTipoEdificio, flPrecioMercado, strColor);

	}

	@Override
	public String fncFuncionalidadEdificio() {
		return "En el almacén se guarda el producto para posteriormente venderlo";
	}

}
