package materialconts.vehiculos;

public class VehiculoGasoil extends Vehiculo {

	protected float flContaminacion = 0;
	protected float flTamañoDeposito = 0;
	
	public VehiculoGasoil(String strMarca, float flVelocidadActual, boolean blEstaArrancado, float flPrecio,
			float flPeso, String strColor, float flLongitud, float flContaminacion, float flTamañoDeposito) {
		super(strMarca, flVelocidadActual, blEstaArrancado, flPrecio, flPeso, strColor, flLongitud);
		this.flContaminacion = flContaminacion;
		this.flTamañoDeposito = flTamañoDeposito;
	}
	
	@Override
	public String fncPrint() {
		return super.fncPrint() + " Contaminación:" + this.flContaminacion + " TamañoDeposito:" + this.flTamañoDeposito;
	}
}
