package EjercicioCuentaAhorro;

public class Cuenta {

//1. Atributos
	String titular; //Declaramos las variables
	float cantidad; //Declaramos la variable
	
	
	//Consructor para pasarlo a las subclases
	public Cuenta(String titular, float cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	} //Constructor



	//2.Metodo par imprimir datos
	public void imprimirdatosCuenta() {
		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " + cantidad);
		
	}//Meotodo para improimir los datos 
	
} //Clase cuenta
