package materialconts.vehiculos;

public interface GestionVehiculo {

	public boolean arrancar();
	public boolean parar();
	public boolean frenar(float flVelocidad);
	public boolean acelarar(float flVelocidad);
	
}
