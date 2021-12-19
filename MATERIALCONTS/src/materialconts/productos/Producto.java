package materialconts.productos;

import materialconts.edificios.Edificio;
import materialconts.edificios.Oficina;

public class Producto {
	protected static int UUID = 1;
	protected int inID = 0;
	protected String strNombre = null;
	protected String strTipo = null;
	protected float flAnchura = 0;
	protected float flProfundidad = 0;
	protected float flAltura = 0;
	protected String strColor = null;
	protected Edificio edfEdificioActual = new Oficina(flAltura, flAltura, flAltura, strColor, strColor, flAltura, strColor);

	public Producto(String strNombre, float flAnchura, float flProfundidad, float flAltura,
					String strColor, Edificio edfEdificioActual) {
		this.strNombre = strNombre;
		this.flAnchura = flAnchura;
		this.flProfundidad = flProfundidad;
		this.flAltura = flAltura;
		this.strColor =strColor;
		this.edfEdificioActual = edfEdificioActual;
		this.inID=UUID++;
	}
	public int getID() {
		return this.inID;
	}
	public int getInID() {
		return inID;
	}
	public void setInID(int inID) {
		this.inID = inID;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public String getStrTipo() {
		return strTipo;
	}
	public void setStrTipo(String strTipo) {
		this.strTipo = strTipo;
	}
	public float getFlAnchura() {
		return flAnchura;
	}
	public void setFlAnchura(float flAnchura) {
		this.flAnchura = flAnchura;
	}
	public float getFlProfundidad() {
		return flProfundidad;
	}
	public void setFlProfundidad(float flProfundidad) {
		this.flProfundidad = flProfundidad;
	}
	public float getFlAltura() {
		return flAltura;
	}
	public void setFlAltura(float flAltura) {
		this.flAltura = flAltura;
	}
	public String getStrColor() {
		return strColor;
	}
	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}
	public Edificio getEdfEdificioActual() {
		return edfEdificioActual;
	}
	public void setEdfEdificioActual(Edificio edfEdificioActual) {
		this.edfEdificioActual = edfEdificioActual;
	}
}
