package materialconts.edificios;

public class Oficina extends Edificio {

	public Oficina(float flAnchura, float flAltura, float flProfundiadd, String strMaterial, String strTipoEdificio,
			float flPrecioMercado, String strColor) {
		super(flAnchura, flAltura, flProfundiadd, strMaterial, strTipoEdificio, flPrecioMercado, strColor);

	}

	@Override
	public String fncFuncionalidadEdificio() {
		return "En la oficina se etiqueta el producto";
	}

}
