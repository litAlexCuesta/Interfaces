package Ventana2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana2 extends JFrame {
	// Insertamos campos de texto y etiquetas en un nuevo panel central
	private JPanel panelCentral;
	private JLabel pedirCambio;
	private JTextField cambio;
	private JLabel pedirCantidad;
	private JTextField cantidad;
	private Container panelPrincipal;
	private JLabel etiqueta;
	private JPanel panelNorte;
	private JPanel panelSur;
	private JPanel panelCentro;
	
	public Ventana2(String _msg) {
		super(_msg);
		// Contenedor principal
		this.panelPrincipal = this.getContentPane();
		this.panelPrincipal.setLayout(new BorderLayout());
		this.etiqueta = new JLabel();
		// Inserto el componente en el contenedor
		this.panelPrincipal.add(this.etiqueta);
		// Establezco el resto de propiedades de la ventana
		
		
		JLabel t = new JLabel("Bienvenido a mi ventana");
		
		this.panelNorte = new JPanel();
		this.panelNorte.setLayout(new FlowLayout());
		this.panelNorte.add(this.etiqueta);
		// Configurar el panel sur
		// Inserto el panel norte en el contenedor principal
		this.panelPrincipal.add(this.panelNorte, BorderLayout.NORTH);
		this.panelNorte.add(t);
		
		JLabel t2 = new JLabel("Introducir el cambio");
		JTextField t3 = new JTextField();
		JLabel t4 = new JLabel("Cantidad");
		JTextField t5 = new JTextField();
		
		this.panelCentro = new JPanel();
		this.panelCentro.setLayout(new GridLayout(2, 2, 10, 10));
		this.panelCentro.add(this.etiqueta);
		this.panelCentro.add(t2);
		this.panelCentro.add(t3);
		this.panelCentro.add(t4);
		this.panelCentro.add(t5);
		
		this.panelPrincipal.add(this.panelCentro, BorderLayout.CENTER);
		
		// Insertar el panel sur en el contenedor principal
		
		this.panelSur = new JPanel();
		this.panelSur.setLayout(new FlowLayout());
		this.panelSur.add(this.etiqueta);
		
		this.panelPrincipal.add(this.panelSur, BorderLayout.SOUTH);
		
		
		JButton euroADolar = new JButton("Euros a dolares");
		JButton dolarAEuro = new JButton("Dolares a euros");
		
		// Implementación ActionListener
		euroADolar.addActionListener(
		new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		java.awt.Toolkit.getDefaultToolkit().beep();
		}
		});
		
		// Inserto los elementos en el contenedor principal
		this.panelSur.add(this.etiqueta);
		this.panelSur.add(euroADolar);
		this.panelSur.add(dolarAEuro);
		
		
		this.setLocation(50, 100);
		this.setSize(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	
}
