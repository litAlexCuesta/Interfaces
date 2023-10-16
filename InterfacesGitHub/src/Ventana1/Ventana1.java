package Ventana1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana1 extends JFrame{
	
	private JLabel etiqueta;
	
	public Ventana1(String _msg) {
		super(_msg);
		this.setLocation(50,100);
		this.setSize(400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.etiqueta = new JLabel("Mi segundo conversor");
		
	}

	public static void main(String[] args) {
		Ventana1 ventana = new Ventana1("Ventana1");
	}

}
