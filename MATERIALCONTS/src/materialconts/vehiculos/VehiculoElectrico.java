package materialconts.vehiculos;

public class VehiculoElectrico extends Vehiculo {
	
	protected float flPotencia = 0;
	protected int inVelocidadMaxima = 0;
	
	public VehiculoElectrico(String strMarca, float flVelocidadActual, boolean blEstaArrancado, float flPrecio,
			float flPeso, String strColor, float flLongitud, float flPotencia, int inVelocidadMaxima) {
		super(strMarca, flVelocidadActual, blEstaArrancado, flPrecio, flPeso, strColor, flLongitud);
		this.flPotencia = flPotencia;
		this.inVelocidadMaxima = inVelocidadMaxima;
	}

	@Override
	public String fncPrint() {
		return super.fncPrint() + " Potencia:" + this.flPotencia + " VelocidadMaxima:" + this.inVelocidadMaxima;
	}
}
