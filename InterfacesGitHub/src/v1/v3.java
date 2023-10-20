package v1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class v3 extends JFrame{
	private Container panelPrincipal;
	private JPanel panelCentro;

	v3(String _msg){
		super(_msg);
		
		this.panelPrincipal = this.getContentPane();
		this.panelPrincipal.setLayout(new BorderLayout());
		
		this.panelCentro = new JPanel();
		this.panelCentro.setLayout(new FlowLayout());
		JLabel t = new JLabel("Mensaje");
		this.panelCentro.add(t);
		this.panelPrincipal.add(this.panelCentro, BorderLayout.CENTER);
		
		this.setLocation(50, 100);
		this.setSize(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
