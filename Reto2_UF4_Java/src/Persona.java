
public class Persona extends Familia{

	//Atributos
	
		protected String strNombre = "";
		protected String strDni = "";
		protected String strSexo = "";
		protected float flPeso = 0.00f;
		protected float flAltura = 0.00f;
		protected int inEdad = 0;
	
	//M�todo constructor

	public Persona(String strNombre, String strDni, String strSexo, float flPeso, float flAltura, int inEdad) {
		this.strNombre = strNombre;
		this.strDni = strDni; 
		this.strSexo = strSexo;
		this.flPeso = flPeso; 
		this.flAltura = flAltura;
		this.inEdad = inEdad;
	}
	
	//M�todos
	
	@Override //M�todo abstracto de la superclase
	protected float fncIMC() {
		float flIMC;
		return flIMC = flPeso / flAltura * flAltura;
	}
		//M�todos Setters
	public void setNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public void setDni(String strDni) {
		this.strDni = strDni;
	}
	public void setSexo(String strSexo) {
		this.strSexo = strSexo;
	}
	public void setPeso(float flPeso) {
		this.flPeso = flPeso;
	}
	public void setAltura(float flAltura) {
		this.flAltura = flAltura;
	}
	public void setEdad(int inEdad) {
		this.inEdad = inEdad;
	}
		//M�todos Getters
	public String getNombre() {
		return strNombre;
	}
	public String getDni() {
		return strDni;
	}
	public String getSexo() {
		return strSexo;
	}
	public float getPeso() {
		return flPeso;
	}
	public float getAltura() {
		return flAltura;
	}
	public int getEdad() {
		return inEdad;
	}
}
