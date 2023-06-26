package EjercicioCuentaAhorro;

public class PlazoFijo extends Cuenta{
	
	//1. Atributos

	public int plazo;
	public double interes;
	
	
	
	public PlazoFijo(String titular, float cantidad, int plazo, double interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
	}//Cierre de PlzaoFijo



	//Metodo de obtener importe de interes
	
	public double obtenerImporteInteres () {
		return ((cantidad * interes)/100); //Obtiene el valor de la herencia y de el nuevo valor que se le va a asignar
	}//Obtner importe del interes
	
	
	//Metodo para mostrar informacion
	public void mostrarInformacionPlazoFijo () {
		System.out.println("Informacionde la cuenta Plazo Fijo");
		imprimirdatosCuenta();
		System.out.println("Plazo: " + plazo);
		System.out.println("Interes: " + interes);
		System.out.println("Total de Interes: " + obtenerImporteInteres());
	}
	
	
	
	
	//2.Metodo para calcualar el importe de interes
	public float calculoInteres(float cantidad, float interes) {
		return cantidad *interes /100;
		
	}//Cierre del calculo interes

}//Cierre de PlazoFijo
