package es.studium.ejemploFK;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VEjemploFKDetallesFactura extends JFrame
{
	private static final long serialVersionUID = 1L;

	JLabel lblFactura=new JLabel("Factura Nº:");
	JLabel lblNFactura=new JLabel(" 5");
	
	JLabel lblArticulo=new JLabel("Articulo:");
	Choice choArticulo=new Choice();
	
	JLabel lblCantidad=new JLabel("Cantidad");
	JTextField txtCantidad=new JTextField(5);
	JButton btnAgregar=new JButton("Agregar");
	
	String[] columnas= {
			"idArtículo",
			"Descripción",
			"Cantidad",
			"Precio",
			"Subtotal"
	};
	Object[][] data = {
			{"Kathy", "Smith",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"John", "Doe",
			     "Rowing", new Integer(3), new Boolean(true)},
			    {"Sue", "Black",
			     "Knitting", new Integer(2), new Boolean(false)},
			    {"Jane", "White",
			     "Speed reading", new Integer(20), new Boolean(true)},
			    {"Joe", "Brown",
			     "Pool", new Integer(10), new Boolean(false)}
	};
	
	JTable tabDatos=new JTable(data, columnas);
	
	JLabel lblTotal=new JLabel("Total:");
	JTextField txtTotal=new JTextField(5);
	
	JButton btnAceptar=new JButton("Aceptar");
	JButton btnCancelar=new JButton("Cancelar");
	
	JPanel pnlSup=new JPanel();
	JPanel pnlCent=new JPanel();
	JPanel pnlInf=new JPanel();
	
	public VEjemploFKDetallesFactura() {
		setTitle("Detalles Factura");
		setSize(400,400);
		setVisible(true);
		
		pnlSup.setLayout(new GridLayout(4,2));
		pnlSup.add(lblFactura);
		lblFactura.setHorizontalAlignment(JLabel.RIGHT);
		pnlSup.add(lblNFactura);
		lblNFactura.setHorizontalAlignment(JLabel.LEFT);
		
		pnlSup.add(lblArticulo);
		lblArticulo.setHorizontalAlignment(0);
		JPanel pnlSupSup =new JPanel();
		pnlSupSup.add(choArticulo);
		pnlSup.add(pnlSupSup);
		
		pnlSup.add(lblCantidad);
		lblCantidad.setHorizontalAlignment(0);
		JPanel pnlSupSup2=new JPanel();
		pnlSupSup2.add(txtCantidad);
		lblTotal.setHorizontalAlignment(0);
		pnlSup.add(pnlSupSup2);
		JPanel pnlSupSup3=new JPanel();
		pnlSupSup3.setLayout(new FlowLayout());
		pnlSupSup3.add(btnAgregar);
		JLabel lblVac=new JLabel();
		pnlSup.add(lblVac);
		pnlSup.add(pnlSupSup3);
		
		//JScrollPane scrollPane = new JScrollPane(tabDatos);
		tabDatos.setFillsViewportHeight(true);
		pnlCent.setLayout(new BorderLayout());
		pnlCent.add(tabDatos.getTableHeader(), BorderLayout.PAGE_START);
		pnlCent.add(tabDatos, BorderLayout.CENTER);
		pnlCent.add(tabDatos);
		
		
		pnlInf.setLayout(new GridLayout(2,3));
		pnlInf.add(lblTotal);
		lblTotal.setHorizontalAlignment(0);
		JPanel pnlInfInf=new JPanel();
		pnlInfInf.add(txtTotal);
		lblTotal.setHorizontalAlignment(0);
		pnlInf.add(pnlInfInf);
		
		JPanel pnlInf1=new JPanel();
		pnlInf1.setLayout(new FlowLayout());
		pnlInf1.add(btnAceptar);
		JPanel pnlInf2=new JPanel();
		pnlInf2.setLayout(new FlowLayout());
		pnlInf2.add(btnCancelar);
		pnlInf.add(pnlInf1);
		pnlInf.add(pnlInf2);
		
		add(pnlSup,"North");
		add(pnlCent, "Center");
		add(pnlInf,"South");
		
		setLocationRelativeTo(null);
		setLocation(480, 200);
		
	}
	
	public static void main(String[] args)
	{
		new VEjemploFKDetallesFactura();
	}

}
