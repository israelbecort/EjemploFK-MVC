package es.studium.ejemploFK;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VEjemploFKSeleccionarFactura extends JFrame
{
	private static final long serialVersionUID = 1L;
	JLabel lblFecha=new JLabel("Fecha Factura:");
	JTextField txtFecha=new JTextField(8);
	JLabel lblCliente=new JLabel("Clietne:");
	Choice choCliente=new Choice();
	
	JButton btnSiguiente=new JButton("Siguiente");
	JButton btnCancelar=new JButton("Cancelar");
	
	JPanel pnlSup=new JPanel();
	JPanel pnlInf=new JPanel();
	
	Calendar fecha=new GregorianCalendar();
	int dia=fecha.get(Calendar.DAY_OF_MONTH);
	int mes=fecha.get(Calendar.MONTH)+1;
	int anio=fecha.get(Calendar.YEAR);
	String fechaHoy=(dia+"/"+mes+"/"+anio);
	
	
	public VEjemploFKSeleccionarFactura() {
	
		setTitle("Seleccionar factura");
		setSize(300,200);
		setVisible(true);
		
		pnlSup.setLayout(new GridLayout(2,2));
		pnlSup.add(lblFecha);
		lblFecha.setHorizontalAlignment(0);
		JPanel pnlSupSup =new JPanel();
		pnlSupSup.add(txtFecha);
		pnlSup.add(pnlSupSup);	
		
		pnlSup.add(lblCliente);
		lblCliente.setHorizontalAlignment(0);
		JPanel pnlCent3=new JPanel();
		pnlCent3.add(choCliente);
		pnlSup.add(pnlCent3);
		
		pnlInf.setLayout(new FlowLayout());
		pnlInf.add(btnSiguiente);
		pnlInf.add(btnCancelar);
		
		add(pnlSup,"North");
		add(pnlInf,"South");
		
		txtFecha.setText(fechaHoy);
		txtFecha.setHorizontalAlignment(JTextField.CENTER);
		
		setLocationRelativeTo(null);
		setLocation(480, 200);

	}
	/*public static void main(String[] args)
	{
		new VEjemploFKSeleccionarFactura();
	}*/

}
