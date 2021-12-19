package materialconts.vehiculos;

public class Vehiculo implements GestionVehiculo{

	protected String strMarca = null;
	protected float flVelocidadActual = 0;
	protected boolean blEstaArrancado = false;
	protected float flPrecio = 0;
	protected float flPeso = 0;
	protected String strColor = null;
	protected float flLongitud = 0;
	
	public Vehiculo(String strMarca, float flVelocidadActual, boolean blEstaArrancado, float flPrecio, float flPeso, String strColor, float flLongitud) {
		this.strMarca = "Seat";
		this.strMarca = strMarca;
		this.flVelocidadActual = flVelocidadActual;
		this.blEstaArrancado = blEstaArrancado;
		this.flPrecio = flPrecio;
		this.flPeso = flPeso;
		this.strColor = strColor;
		this.flLongitud = flLongitud;
	}
	
	public String fncPrint() {
		return "Marca:" + this.strMarca + " Velocidad:" + this.flVelocidadActual + " Estado:" + this.blEstaArrancado + " Precio:" + this.flPrecio + " Peso:" + this.flPeso + 
				" Color:" + this.strColor + " Longitud:" + this.flLongitud;
	}


	public String getStrMarca() {
		return strMarca;
	}

	public void setStrMarca(String strMarca) {
		this.strMarca = strMarca;
	}

	public float getFlVelocidadActual() {
		return flVelocidadActual;
	}

	public void setFlVelocidadActual(float flVelocidadActual) {
		this.flVelocidadActual = flVelocidadActual;
	}

	public boolean isBlEstaArrancado() {
		return blEstaArrancado;
	}

	public void setBlEstaArrancado(boolean blEstaArrancado) {
		this.blEstaArrancado = blEstaArrancado;
	}

	public float getFlPrecio() {
		return flPrecio;
	}

	public void setFlPrecio(float flPrecio) {
		this.flPrecio = flPrecio;
	}

	public float getFlPeso() {
		return flPeso;
	}

	public void setFlPeso(float flPeso) {
		this.flPeso = flPeso;
	}

	public String getStrColor() {
		return strColor;
	}

	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}

	public float getFlLongitud() {
		return flLongitud;
	}

	public void setFlLongitud(float flLongitud) {
		this.flLongitud = flLongitud;
	}

	@Override
	public boolean frenar(float flVelocidad) {
		if(blEstaArrancado) {
			flVelocidadActual -= flVelocidad;
			if(flVelocidadActual<0) {
				flVelocidadActual = 0;
			}
			return true;
		}else {
			return false;
		}	
	}

	@Override
	public boolean acelarar(float flVelocidad) {
		if(blEstaArrancado) {
			flVelocidadActual += flVelocidad;
			return true;
		}else {
			return false;
		}	
	}
	
	@Override
	public boolean arrancar() {
		if(!blEstaArrancado) {
			blEstaArrancado = true;
			return true;
		}else {
			blEstaArrancado = false;
			return false;
		}
	}
	
	@Override
	public boolean parar() {
		if(blEstaArrancado) {
			blEstaArrancado = false;
			return false;
		}else {
			blEstaArrancado = true;
			return true;
		}
		
	}
}
