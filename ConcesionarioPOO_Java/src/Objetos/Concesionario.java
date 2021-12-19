package Objetos;

public class Concesionario extends Edificio implements CompraVenta{

	
	protected Coche coche1;
	protected Coche coche2;
	protected Coche coche3;
	
	public Concesionario()
	{
		this.coche1=null;
		this.coche2=null;
		this.coche3=null; 
	}
		
	public Coche getCoche1() {
		return coche1;
	}

	public void setCoche1(Coche coche1) {
		this.coche1 = coche1;
	}

	public Coche getCoche2() {
		return coche2;
	}

	public void setCoche2(Coche coche2) {
		this.coche2 = coche2;
	}

	public Coche getCoche3() {
		return coche3;
	}

	public void setCoche3(Coche coche3) {
		this.coche3 = coche3;
	}

	@Override
	public boolean comprar(Coche c) {
		// TODO Auto-generated method stub
		if(coche1==null)
		{
			coche1=c;
			return true;
		}
		else if(coche2==null)
		{
			coche2=c;
			return true;
		}
		else if(coche3==null)
		{
			coche3=c;
			return true;
		}
		
		return false;
	}

	@Override
	public boolean vender(Coche c) {
		// TODO Auto-generated method stub
		if(c.getMarca()==coche1.getMarca())
		{
			coche1=null;
			return true;
		}
		else if(c.getMarca()==coche2.getMarca())
		{
			coche2=null;
			return true;
		}
		if(c.getMarca()==coche3.getMarca())
		{
			coche3=null;
			return true;
		}
		return false;
	}

	public void print()
	{
		super.print();
		if(this.coche1!=null)
		{
			System.out.println("**********Info coche 1**********");
			System.out.println("Marca " + this.coche1.getMarca());
			System.out.println("Color " + this.coche1.getColor());
			System.out.println("Numero de ruedas " + this.coche1.getNumeroDeRuedas());
			System.out.println("Numero de puertas " + this.coche1.getNumeroDePuertas());
			System.out.println("Numero de Caballos " + this.coche1.getNumeroDeCaballos());
			System.out.println("Velocidad maxima " + this.coche1.getVelocidadMaxima());
		}
		if(this.coche2!=null)
		{
			System.out.println("**********Info coche 2**********");
			System.out.println("Marca " + this.coche2.getMarca());
			System.out.println("Color " + this.coche2.getColor());
			System.out.println("Numero de ruedas " + this.coche2.getNumeroDeRuedas());
			System.out.println("Numero de puertas " + this.coche2.getNumeroDePuertas());
			System.out.println("Numero de Caballos " + this.coche2.getNumeroDeCaballos());
			System.out.println("Velocidad maxima " + this.coche2.getVelocidadMaxima());
		}
		if(this.coche3!=null)
		{
			System.out.println("**********Info coche 3**********");
			System.out.println("Marca " + this.coche3.getMarca());
			System.out.println("Color " + this.coche3.getColor());
			System.out.println("Numero de ruedas " + this.coche3.getNumeroDeRuedas());
			System.out.println("Numero de puertas " + this.coche3.getNumeroDePuertas());
			System.out.println("Numero de Caballos " + this.coche3.getNumeroDeCaballos());
			System.out.println("Velocidad maxima " + this.coche3.getVelocidadMaxima());
		}
	}	
	
	
	
	
}
