package es.studium.ejemploFK;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class CEjemploFK implements WindowListener, ActionListener, KeyListener
{
	VEjemploFK objVistaEjemploFK=null;
	VEjemploFKSeleccionarFactura objVistaEjemploFKSeleccionarFactura=null;
	public CEjemploFK(VEjemploFK objVista) {
		
		this.objVistaEjemploFK = objVista;
		
		objVista.btnAltaFactura.addActionListener(this);
		objVista.addWindowListener(this); 
		
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
				new VEjemploFKSeleccionarFactura();
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
