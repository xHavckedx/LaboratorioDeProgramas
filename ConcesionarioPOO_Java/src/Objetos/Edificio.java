package Objetos;

public class Edificio {
	
	//Definicion de atributos
	
	protected float altura;
	protected String empresaConstructora;
	protected String duenyo;
	protected int anyoConstruccion;
	protected String nombreEdificio;
	
	
	//Creamos los contructores
	
	public Edificio()
	{
		this.altura=10.0f;
		empresaConstructora="Construcciones S.A.";
		this.duenyo="Juan Lopez";
		this.anyoConstruccion=2020;					
		this.nombreEdificio="";
	}
   
	public String getNombreEdificio() {
		return nombreEdificio;
	}

	public void setNombreEdificio(String nombreEdificio) {
		this.nombreEdificio = nombreEdificio;
	}

	public Edificio (float altura, String ec, String d, int a)
	{
		this.altura=altura;
		this.empresaConstructora=ec;
		this.duenyo=d;
		this.anyoConstruccion=a;
	}

	//Getters y Setters
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getEmpresaConstructora() {
		return empresaConstructora;
	}

	public void setEmpresaConstructora(String empresaConstructora) {
		this.empresaConstructora = empresaConstructora;
	}

	public String getDuenyo() {
		return duenyo;
	}

	public void setDuenyo(String duenyo) {
		this.duenyo = duenyo;
	}

	public int getAnyoConstruccion() {
		return anyoConstruccion;
	}

	public void setAnyoConstruccion(int anyoConstruccion) {
		this.anyoConstruccion = anyoConstruccion;
	}
	
	//Metodos propios
	
	public void print()
	{
		System.out.println(this.nombreEdificio + "-" + this.duenyo + "-" + this.empresaConstructora + "-" + this.anyoConstruccion + "-" + this.altura);
	}
	
		
	
}
