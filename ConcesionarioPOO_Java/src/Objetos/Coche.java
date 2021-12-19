package Objetos;
 
public class Coche {

	
	//Atributo--->variable
	//método----->función
	//objeto----->variable compleja o compuesta
	
	
	
	
	
	
	
	
	//Definicion de atributos
	protected String marca;
	protected String color;
	protected int numeroDeRuedas;
	protected float velocidadMaxima;
	protected float velocidadActual;
	protected int numeroDePuertas;
	private float numeroDeCaballos;
	private boolean estaArrancado;

	//constructor
	public Coche()
	{
		this.marca="Opel";
		this.color="Blanco";
		this.numeroDeRuedas=4;
		this.velocidadMaxima=200.0f;
		this.velocidadActual=0.0f;
		this.numeroDePuertas=3;
		this.numeroDeCaballos=300.0f;
		this.estaArrancado=false;
	}
	public Coche(String marca, String color, int numeroDePuertas, int numeroDeRuedas, float velocidadMaxima, float numeroDeCaballos)
	{
		this.marca=marca;
		this.color=color;
		this.numeroDeRuedas=numeroDeRuedas;
		this.velocidadMaxima=velocidadMaxima;
		this.numeroDeCaballos=numeroDeCaballos;	
		this.numeroDePuertas=numeroDePuertas;
		this.velocidadActual=0.0f;
		this.estaArrancado=false;		
	}
	
	//Definicion de getters y setters
	public boolean getEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}

	public String getMarca()
	{
		return this.marca;
	}
	public void setMarca(String m)
	{
		this.marca=m;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroDeRuedas() {
		return numeroDeRuedas;
	}

	public void setNumeroDeRuedas(int numeroDeRuedas) {
		this.numeroDeRuedas = numeroDeRuedas;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public float getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(float velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}

	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}

	public float getNumeroDeCaballos() {
		return numeroDeCaballos;
	}

	public void setNumeroDeCaballos(float numeroDeCaballos) {
		this.numeroDeCaballos = numeroDeCaballos;
	}
	/*
	 * 
	 * Definicion métodos propios
	 * 	
	 */
	public void arrancar()
	{
		this.estaArrancado=true;
	}
	
	public int acelerar(float incremento)
	{
		if(this.estaArrancado)
		{
			this.velocidadActual+=incremento;
			if (this.velocidadActual>this.velocidadMaxima)
			{
				this.velocidadActual=this.velocidadMaxima;
			}
			return 1;
		}	
		else
		{
			return -1;
		}
	}
	public int frenar (float decremento)
	{
		if(this.estaArrancado)
		{
			this.velocidadActual-=decremento;
			if (this.velocidadActual<0.0f)
			{
				this.velocidadActual=0.0f;
			}
			return 1;
		}	
		else
		{
			return -1;
		}
	}
	
	public void apagar ()
	{
		this.estaArrancado=false;
	}
	
	public void print()
	{
		System.out.println(this.marca + "-" + this.color + "-" + this.numeroDeCaballos + "-" + this.numeroDePuertas + "-" + this.numeroDeRuedas + "-" + this.velocidadActual + "-" + this.velocidadMaxima);
	}
	
	
}
