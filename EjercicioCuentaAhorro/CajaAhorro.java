package EjercicioCuentaAhorro;

public class CajaAhorro extends Cuenta{
	
	
	//2.Metodo constructor (Caja de ahorro qeu hereda datos)
	public CajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
	} //Cierre de CajaAhorro

	
	
	public void imprimirdatosCajaAhoro() {
		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " + cantidad);
		
	}
	
	
	//Metodo toString
	@Override
	public String toString() {
		return "CajaAhorro [Titular= " + titular + ", cantidad = " + cantidad +"]";
	}//Imprimir datos

	
	} //Cierre de caja de ahorro

