package materialconts.vehiculos;

public class VehiculoGasoil extends Vehiculo {

	protected float flContaminacion = 0;
	protected float flTama�oDeposito = 0;
	
	public VehiculoGasoil(String strMarca, float flVelocidadActual, boolean blEstaArrancado, float flPrecio,
			float flPeso, String strColor, float flLongitud, float flContaminacion, float flTama�oDeposito) {
		super(strMarca, flVelocidadActual, blEstaArrancado, flPrecio, flPeso, strColor, flLongitud);
		this.flContaminacion = flContaminacion;
		this.flTama�oDeposito = flTama�oDeposito;
	}
	
	@Override
	public String fncPrint() {
		return super.fncPrint() + " Contaminaci�n:" + this.flContaminacion + " Tama�oDeposito:" + this.flTama�oDeposito;
	}
}
