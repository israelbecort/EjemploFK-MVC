package es.studium.ejemploFK;


public class Main
{

	public static void main(String[] args)
	{
		VEjemploFK VistaEjemploFK = new VEjemploFK();
		VEjemploFKSeleccionarFactura vistaSeleccionar=new VEjemploFKSeleccionarFactura();
		VEjemploFKDetallesFactura vistaDetalles=new VEjemploFKDetallesFactura();
//		MContadorPalabras Modelo = new MContadorPalabras();
		
		/* Instanciamos un objeto de la clase Controlador */
		new CEjemploFK(VistaEjemploFK, vistaSeleccionar,vistaDetalles); 

	}

}
