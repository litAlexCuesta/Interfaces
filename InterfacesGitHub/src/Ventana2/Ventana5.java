package Ventana2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana5 extends JFrame {
	private JPanel panelCentral;
	private JLabel pedirCambio;
	private JTextField cambio;
	private JLabel pedirCantidad;
	private JTextField cantidad;
	private Container panelPrincipal;
	private JLabel etiqueta;
	private JPanel panelNorte;
	private JPanel panelSur;

	Ventana5(String _msg) {
		super(_msg);
		this.panelPrincipal = this.getContentPane();
		this.etiqueta = new JLabel("Bienvenido a mi quinto conversor");
		// Inserto el componente en el contenedor
		this.panelPrincipal.add(this.etiqueta);
		// Establezco el resto de propiedades de la ventana
		this.setLocation(50, 100);
		this.setSize(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton euroADolar = new JButton("Euros a dolares");
		JButton dolarAEuro = new JButton("Dolares a euros");
		// Inserto los elementos en el contenedor principal
		this.panelPrincipal.add(this.etiqueta);
		this.panelPrincipal.add(euroADolar);
		this.panelPrincipal.add(dolarAEuro);
		
		this.panelNorte = new JPanel();
		this.panelNorte.setLayout(new FlowLayout());
		this.etiqueta = new JLabel("Bienvenido a mi cuarto conversor");
		this.panelNorte.add(this.etiqueta);
		// Configurar el panel sur
		// Inserto el panel norte en el contenedor principal
		this.panelPrincipal.add(this.panelNorte, BorderLayout.NORTH);
		// Insertar el panel sur en el contenedor principal
		
		this.panelSur = new JPanel();
		
	}
}
