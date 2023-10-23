package v1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class v2 extends JFrame{
	private Container panelPrincipal;
	private JLabel etiqueta;

	v2(String _msg){
		super(_msg);
		
		this.panelPrincipal = this.getContentPane();
		this.panelPrincipal.setLayout(new GridLayout(3, 1, 10, 10));
		
		JTextField t = new JTextField("");
		this.panelPrincipal.add(t);
		
		JLabel texto = new JLabel("");
		
		JButton presionaBoton = new JButton("Saludar");
		presionaBoton.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String j = t.getText();
						if(!j.equals("")) {
							texto.setText("Hola " + j);
						}else {
							texto.setText("Introduce un nombre");
						}
						
					}
				}
				);

		this.panelPrincipal.add(presionaBoton);
		panelPrincipal.add(texto);
		
		this.setLocation(50, 100);
		this.setSize(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
