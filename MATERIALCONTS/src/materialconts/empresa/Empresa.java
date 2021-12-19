package materialconts.empresa;

import materialconts.edificios.*;
import materialconts.vehiculos.*;
import materialconts.productos.*;

public class Empresa {

	protected Fabrica fbc;
	protected Oficina ofc;
	protected Almacen alm;
	protected VehiculoElectrico vhcElec1;
	protected VehiculoElectrico vhcElec2;
	protected VehiculoGasoil vhcGasoi1;
	protected VehiculoGasolina vhcGasol1;
	protected Puertas prt1;
	protected Puertas prt2;
	protected Silla sll1;
	protected Silla sll2;
	protected Ventanas vnt1;
	protected Ventanas vnt2;

	public Empresa() {
		this.vhcElec1 = null;
		this.vhcElec2 = null;
		this.vhcGasoi1 = null;
		this.vhcGasol1 = null;
	}

	public boolean fncCrearProducto(Producto prdProducto) {
		if (prt1 == null) {
			prt1 = (Puertas)prdProducto;
			return true;
		} else if (prt2 == null) {
			prt2 = (Puertas)prdProducto;
			return true;
		} else if (sll1 == null) {
			sll1 = (Silla)prdProducto;
			return true;
		} else if (sll2 == null) {
			sll2 = (Silla)prdProducto;
			return true;
		} else if (vnt1 == null) {
			vnt1 = (Ventanas)prdProducto;
			return true;
		} else if (vnt2 == null) {
			vnt2 = (Ventanas)prdProducto;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean fncCrearProducto(VehiculoElectrico vhVehiculo) {
		if (vhcElec1 == null) {
			vhcElec1 = vhVehiculo;
			return true;
		} else if (vhcElec2 == null) {
			vhcElec2 = vhVehiculo;
			return true;
		} else {
			return false;
		}
	}

	public boolean fncCrearProducto(VehiculoGasolina vhVehiculo) {
		if (vhcElec1 == null) {
			vhcGasol1 = vhVehiculo;
			return true;
		} else {
			return false;
		}
	}

	public boolean fncCrearProducto(VehiculoGasoil vhVehiculo) {
		if (vhcElec1 == null) {
			vhcGasoi1 = vhVehiculo;
			return true;
		} else {
			return false;
		}
	}

	public boolean fncVenderProducto(Producto prdProducto) {
		if (prdProducto.getID() == prt1.getID()) {
			prdProducto = null;
			return true;
		} else if (prdProducto.getID() == prt2.getID()) {
			prdProducto = null;
			return true;
		} else if (prdProducto.getID() == sll1.getID()) {
			prdProducto = null;
			return true;
		} else if (prdProducto.getID() == sll2.getID()) {
			prdProducto = null;
			return true;
		} else if (prdProducto.getID() == vnt1.getID()) {
			prdProducto = null;
			return true;
		} else if (prdProducto.getID() == vnt2.getID()) {
			prdProducto = null;
			return true;
		} else {
			return false;
		}

	}

	public boolean fncVenderProducto(VehiculoElectrico vhVehiculo) {
		if (vhVehiculo.getStrMarca() == vhcElec1.getStrMarca()) {
			vhcElec1 = null;
			return true;
		} else if (vhVehiculo.getStrMarca() == vhcElec2.getStrMarca()) {
			vhcElec2 = null;
			return true;
		} else {
			return false;
		}
	}

	public boolean fncVenderProducto(VehiculoGasoil vhVehiculo) {
		if (vhVehiculo.getStrMarca() == vhcGasoi1.getStrMarca()) {
			vhcGasoi1 = null;
			return true;
		} else {
			return false;
		}
	}

	public boolean fncVenderProducto(VehiculoGasolina vhVehiculo) {
		if (vhVehiculo.getStrMarca() == vhcGasol1.getStrMarca()) {
			vhcGasoi1 = null;
			return true;
		} else {
			return false;
		}
	}

	public boolean fncCambiarUbicacionProducto(Producto prdProducto, Edificio edfEdificio) {
		if (prdProducto != null) {
			prdProducto.setEdfEdificioActual(edfEdificio);
			return true;
		}
		return false;

	}

	public void fncPrint() {
		System.out.println("Coches: ");
		if (vhcElec1 != null) {
			System.out.println("Vehiculo Elect1: " + vhcElec1.fncPrint());
		}
		if (vhcElec2 != null) {
			System.out.println("Vehiculo Elect2: " + vhcElec2.fncPrint());
		}
		if (vhcGasoi1 != null) {
			System.out.println("Vehiculo Gasoil: " + vhcGasoi1.fncPrint());
		}
		if (vhcGasol1 != null) {
			System.out.println("Vehiculo Gasoli: " + vhcGasol1.fncPrint());
		}

	}

	public Fabrica getFbc() {
		return fbc;
	}

	public void setFbc(Fabrica fbc) {
		this.fbc = fbc;
	}

	public Oficina getOfc() {
		return ofc;
	}

	public void setOfc(Oficina ofc) {
		this.ofc = ofc;
	}

	public Almacen getAlm() {
		return alm;
	}

	public void setAlm(Almacen alm) {
		this.alm = alm;
	}

	public VehiculoElectrico getVhcElec1() {
		return vhcElec1;
	}

	public void setVhcElec1(VehiculoElectrico vhcElec1) {
		this.vhcElec1 = vhcElec1;
	}

	public VehiculoElectrico getVhcElec2() {
		return vhcElec2;
	}

	public void setVhcElec2(VehiculoElectrico vhcElec2) {
		this.vhcElec2 = vhcElec2;
	}

	public VehiculoGasoil getVhcGasoi1() {
		return vhcGasoi1;
	}

	public void setVhcGasoi1(VehiculoGasoil vhcGasoi1) {
		this.vhcGasoi1 = vhcGasoi1;
	}

	public VehiculoGasolina getVhcGasol1() {
		return vhcGasol1;
	}

	public void setVhcGasol1(VehiculoGasolina vhcGasol1) {
		this.vhcGasol1 = vhcGasol1;
	}

	public Puertas getPrt1() {
		return prt1;
	}

	public void setPrt1(Puertas prt1) {
		this.prt1 = prt1;
	}

	public Puertas getPrt2() {
		return prt2;
	}

	public void setPrt2(Puertas prt2) {
		this.prt2 = prt2;
	}

	public Silla getSll1() {
		return sll1;
	}

	public void setSll1(Silla sll1) {
		this.sll1 = sll1;
	}

	public Silla getSll2() {
		return sll2;
	}

	public void setSll2(Silla sll2) {
		this.sll2 = sll2;
	}

	public Ventanas getVnt1() {
		return vnt1;
	}

	public void setVnt1(Ventanas vnt1) {
		this.vnt1 = vnt1;
	}

	public Ventanas getVnt2() {
		return vnt2;
	}

	public void setVnt2(Ventanas vnt2) {
		this.vnt2 = vnt2;
	}

}
