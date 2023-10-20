package v1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class v1 extends JFrame{

	private Container panelPrincipal;
	private JLabel etiqueta;
	private JPanel panelNorte;

	v1(String _msg){
		super(_msg);
		// Contenedor principal
		this.panelPrincipal = this.getContentPane();
		this.panelPrincipal.setLayout(new BorderLayout());
		this.etiqueta = new JLabel();
		this.panelPrincipal.add(this.etiqueta);
		
		JLabel t = new JLabel("Presiona el boton");
		JButton presionaBoton = new JButton("Click aquí");
		
		this.panelNorte = new JPanel();
		this.panelNorte.setLayout(new FlowLayout());
		this.panelNorte.add(this.etiqueta);
		this.panelPrincipal.add(this.panelNorte, BorderLayout.NORTH);
		this.panelNorte.add(t);
		this.panelNorte.add(presionaBoton);
		
		this.setLocation(50, 100);
		this.setSize(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
