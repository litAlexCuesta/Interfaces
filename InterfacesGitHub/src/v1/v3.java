package v1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class v3 extends JFrame{
	private Container panelPrincipal;
	private JPanel panelCentro;

	v3(String _msg){
		super(_msg);
		
		this.panelPrincipal = this.getContentPane();
		this.panelPrincipal.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		this.panelCentro = new JPanel();
		this.panelCentro.setLayout(new GridLayout(4, 2, 10, 10));
		JLabel t = new JLabel("Mensaje");
		
		JCheckBox c = new JCheckBox("Mostrar mensaje");
		
		 ButtonGroup grupoRadio = new ButtonGroup();
	     JRadioButton radio1 = new JRadioButton("Opción 1");
	     JRadioButton radio2 = new JRadioButton("Opción 2");
	     JLabel textoMostrar = new JLabel("");
	     grupoRadio.add(radio1);
	     grupoRadio.add(radio2);
	     
	     JButton b = new JButton("Actualizar");
			b.addActionListener(
					new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							if(c.isSelected()) {
								if(radio1.isSelected()) {
									textoMostrar.setText("OPCION 1");
								}
								if(radio2.isSelected()) {
									textoMostrar.setText("OPCION 2");
								}
							}else {
								textoMostrar.setText("Mensaje oculto");
							}
							
						}
					}
					);
	        
		this.panelCentro.add(t);
		this.panelCentro.add(b);
		this.panelCentro.add(c);
		this.panelCentro.add(textoMostrar);
		this.panelCentro.add(radio1);
		this.panelCentro.add(radio2);
		this.panelPrincipal.add(this.panelCentro, BorderLayout.CENTER);
		
		this.setLocation(50, 100);
		this.setSize(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
