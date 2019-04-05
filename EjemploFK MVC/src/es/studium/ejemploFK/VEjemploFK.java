package es.studium.ejemploFK;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VEjemploFK extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	JButton btnAltaFactura=new JButton("Alta Factura");
	JPanel pnlSup=new JPanel();
	
	public VEjemploFK(){
		setTitle("Alta Factura");
		setSize(300,200);
		setVisible(true);
		
		pnlSup.setLayout(new FlowLayout());
		pnlSup.add(btnAltaFactura);
		
		add(pnlSup,"North");
		
		setLocationRelativeTo(null);
		setLocation(480, 200);
	}

	public static void main(String[] args)
	{
		new VEjemploFK();
	}
}
