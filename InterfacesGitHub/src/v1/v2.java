package v1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class v2 extends JFrame{
	private Container panelPrincipal;
	private JLabel etiqueta;

	v2(String _msg){
		super(_msg);
		
		this.panelPrincipal = this.getContentPane();
		this.panelPrincipal.setLayout(new GridLayout(3, 1, 10, 10));
		
		JLabel t = new JLabel("");
		this.panelPrincipal.add(t);
		
		JButton presionaBoton = new JButton("Saludar");
		this.panelPrincipal.add(presionaBoton);
		
		this.setLocation(50, 100);
		this.setSize(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
