public abstract class Familia {

	//Atributos
	
	protected int inLibroFamilia = 0;
	protected String strDireccion = "";
	protected String strPoblacion = "";
	protected String strProvincia = "";
	
	//Métodos
	
		//Método Abstracto
	protected abstract float fncIMC(); 
	
		//Métodos Setters
	public void setLibroFamilia(int inLibroFamilia) {
		this.inLibroFamilia = inLibroFamilia;
	}
	public void setDireccion(String strDireccion) {
		this.strDireccion = strDireccion;
	}
	public void setPoblacion(String strPoblacion) {
		this.strPoblacion = strPoblacion;
	}
	public void setProvincia(String strProvincia) {
		this.strProvincia = strProvincia;
	}
	
		//Métodos Getters
	public int getLibroFamilia() {
		return inLibroFamilia;
	}
	public String getDireccion() {
		return strDireccion;
	}
	public String getPoblacion() {
		return strPoblacion;
	}
	public String getProvincia() {
		return strProvincia;
	}
}
