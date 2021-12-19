
public class Empleado {

	String strNombre = "";
	String strApellido = "";
	String strDni = "";
	int	inEdad = 0;
	float flSalario = 0.00f;
	
	public String fncPrint() {
		return strNombre + " - " + strApellido + " - " + strDni + " - " + inEdad + " - " + flSalario;
	}
	
	//Constructores de tipo setter y getter
	
	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrApellido() {
		return strApellido;
	}

	public void setStrApellido(String strApellido) {
		this.strApellido = strApellido;
	}

	public String getStrDni() {
		return strDni;
	}

	public void setStrDni(String strDni) {
		this.strDni = strDni;
	}

	public int getInEdad() {
		return inEdad;
	}

	public void setInEdad(int inEdad) {
		this.inEdad = inEdad;
	}

	public float getFlSalario() {
		return flSalario;
	}

	public void setFlSalario(float flSalario) {
		this.flSalario = flSalario;
	}

}
