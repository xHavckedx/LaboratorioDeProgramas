package materialconts.edificios;

public abstract class Edificio {

	protected float flAnchura = 0;
	protected float flAltura = 0;
	protected float flProfundidad = 0;
	protected String strMaterial = null;
	protected String strTipoEdificio = null;
	protected float flPrecioMercado = 0;
	protected String strColor = null;
	
	public Edificio(float flAnchura, float flAltura, float flProfundiadd, String strMaterial, String strTipoEdificio, float flPrecioMercado, String strColor) {
		this.flAltura =  flAltura;
		this.flAnchura = flAnchura;
		this.flPrecioMercado = flPrecioMercado;
		this.flProfundidad = flProfundiadd;
		this.strMaterial = strMaterial;
		this.strColor = strColor;
		this.strTipoEdificio = strTipoEdificio;
	}
	
	public float getFlAnchura() {
		return flAnchura;
	}

	public void setFlAnchura(float flAnchura) {
		this.flAnchura = flAnchura;
	}

	public float getFlAltura() {
		return flAltura;
	}

	public void setFlAltura(float flAltura) {
		this.flAltura = flAltura;
	}

	public float getFlProfundidad() {
		return flProfundidad;
	}

	public void setFlProfundidad(float flProfundidad) {
		this.flProfundidad = flProfundidad;
	}

	public String getStrMaterial() {
		return strMaterial;
	}

	public void setStrMaterial(String strMaterial) {
		this.strMaterial = strMaterial;
	}

	public String getStrTipoEdificio() {
		return strTipoEdificio;
	}

	public void setStrTipoEdificio(String strTipoEdificio) {
		this.strTipoEdificio = strTipoEdificio;
	}

	public float getFlPrecioMercado() {
		return flPrecioMercado;
	}

	public void setFlPrecioMercado(float flPrecioMercado) {
		this.flPrecioMercado = flPrecioMercado;
	}

	public String getStrColor() {
		return strColor;
	}

	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}

	public float fncCostePintura(String strColor, float flPrecioMercado) {
		if(flPrecioMercado <= 0.00f) {
			return -1;
		}
		float coste;
		this.strColor = strColor;
		return coste = flPrecioMercado * flAnchura * flAltura * flProfundidad;
		
	}
	public float fncCostePintura(String strColor, float flPrecioMercado, String strTipoLado) {
		if(flPrecioMercado <= 0.00f) {
			return -1;
		}
		if(strTipoLado.equalsIgnoreCase("ladoanchura")) {
			float coste;
			this.strColor = strColor;
			return coste = flPrecioMercado * flAnchura * flAltura;
		}
		if(strTipoLado.equalsIgnoreCase("ladoprofundidad")) {
			float coste;
			this.strColor = strColor;
			return coste = flPrecioMercado * flAltura * flProfundidad;
		}
		return -1;
	}
	
	public abstract String fncFuncionalidadEdificio();
}
