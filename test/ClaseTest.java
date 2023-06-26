package test;

import EjercicioCuentaAhorro.CajaAhorro;
import EjercicioCuentaAhorro.PlazoFijo;
public class ClaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Instancia #1 de cuenta de ahorro
		CajaAhorro instancia1 =new CajaAhorro("Andrea Gonzalez",1234.0f);
	//Instancias #2 de plazo fijo
	PlazoFijo instancia2 =new PlazoFijo("Guadalupe Avila", 1234.4f, 12, 5.0);
	
	
	//Mostarar infromacionde las cuentas o ejecucion de las instancais
	
	instancia1.imprimirdatosCajaAhoro();
	System.out.println();
	instancia2.mostrarInformacionPlazoFijo();
	
	
	
	//instancia de un cliente
	
	System.out.println();//espacio	
	System.out.println("Instancai de un cliente");
	Cliente Jesus= new Cliente ("Andrea","adssq22312",12323424.0f,"1234");
	
	Jesus.mostrarCliente();
	
	
	//Modificar un atributo
	Jesus.nombre= "Evil Andrea";
	//Jesus.setSaldo(0.00f); Modificar sin un settin (error)
	
	
	//Impresion de objetos ya modificados
	System.out.println();//Espacio intencional vacio
	Jesus.mostrarCliente();
	
	}//Cierre de intancias cuando no quiero polimorfear
	
}
