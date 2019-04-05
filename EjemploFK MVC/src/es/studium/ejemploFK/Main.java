package es.studium.ejemploFK;


public class Main
{

	public static void main(String[] args)
	{
		VEjemploFK Vista = new VEjemploFK();
//		MContadorPalabras Modelo = new MContadorPalabras();
		
		/* Instanciamos un objeto de la clase Controlador */
		new CEjemploFK(Vista); 

	}

}
