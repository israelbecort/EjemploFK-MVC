package es.studium.ejemploFK;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CEjemploFK implements WindowListener, ActionListener, KeyListener
{
//	VEjemploFKSeleccionarFactura vejemplofkseleccionarfactura =new VEjemploFKSeleccionarFactura();
//	VEjemploFKDetallesFactura vejemplofkdetallesfactura =new VEjemploFKDetallesFactura();
	
	VEjemploFK objVistaEjemploFK=null;
	VEjemploFKSeleccionarFactura objVistaEjemploFKSeleccionarFactura=null;
	VEjemploFKDetallesFactura objVEjemploFKDetallesFactura=null;
	public CEjemploFK(VEjemploFK objVistaEjemploFK, VEjemploFKSeleccionarFactura objVistaSeleccionar,VEjemploFKDetallesFactura objVEjemploFKDetallesFactura) {
		
		this.objVistaEjemploFK = objVistaEjemploFK;
		this.objVistaEjemploFKSeleccionarFactura=objVistaSeleccionar;
		this.objVEjemploFKDetallesFactura=objVEjemploFKDetallesFactura;
		
		objVistaEjemploFK.btnAltaFactura.addActionListener(this);
		objVistaEjemploFK.addWindowListener(this); 
		objVistaSeleccionar.btnSiguiente.addActionListener(this);
		objVistaSeleccionar.addWindowListener(this);
		objVistaSeleccionar.btnCancelar.addActionListener(this);
		objVistaSeleccionar.addWindowListener(this);
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ejemplofk?autoReconnect=true&useSSL=false";
		String login = "root";
		String password = "Studium2018;";
		Statement statement = null;
		ResultSet rs = null;
		Connection connection = null;
		
		try
		{
			Class.forName(driver);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Se ha producido un error al cargar el Driver");
		}
		//ESTABLECER CONEXION CON BASE DE DATOS
		try
		{
			connection = DriverManager.getConnection(url, login, password);
		}
		catch(SQLException e)
		{
			System.out.println("Se produjo un error al conectar a la Base de Datos");
		}
		//PREPARAR EL STATEMENT
		try
		{
			statement=connection.createStatement();
			rs=statement.executeQuery("SELECT * FROM clientes");
			objVistaSeleccionar.choCliente.add("Elige uno...");
			while (rs.next())
			{
				objVistaSeleccionar.choCliente.add(rs.getString("nombreCliente"));
			}
		}
		catch(SQLException e)
		{
			System.out.println("Error en la sentencia SQL");
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		if(objVistaEjemploFK.btnAltaFactura.equals(arg0.getSource())) {
			try {
				objVistaEjemploFK.setVisible(false);
				objVistaEjemploFKSeleccionarFactura.setVisible(true);
				/*String contador= null;
				String str=null;
				int res=0;
				
					contador =objVista.text.getText();
					res = objModelo.cuentaPalabras(contador);
					str=Integer.toString(res);
					objVista.lblContador.setText(str);*/
					
			}catch(Exception e) {
				e.printStackTrace(); 
			}
		}
		if(objVistaEjemploFKSeleccionarFactura.btnSiguiente.equals(arg0.getSource())){
			try {
				objVistaEjemploFKSeleccionarFactura.setVisible(false);
				objVEjemploFKDetallesFactura.setVisible(true);
					
			}catch(Exception a) {
				a.printStackTrace(); 
			}
		}else if(objVistaEjemploFKSeleccionarFactura.btnCancelar.equals(arg0.getSource())) {
			try {
				objVistaEjemploFKSeleccionarFactura.setVisible(false);
					
			}catch(Exception a) {
				a.printStackTrace(); 
			}
		}
		
	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

}
