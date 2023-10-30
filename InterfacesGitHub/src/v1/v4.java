package v1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class v4 extends JFrame {
    private Container panelPrincipal;

    v4(String _msg) {
        super(_msg);
        
        this.panelPrincipal = this.getContentPane();
        this.panelPrincipal.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton b1 = new JButton("Boton 1");
        b1.setFocusPainted(false);
        b1.setBorderPainted(false);
        b1.setBackground(Color.red);
        
        b1.addActionListener(
        		new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame j1 = new JFrame("Boton 1");
						j1.setLayout(new FlowLayout(FlowLayout.CENTER));
						
						
					}
				}
        		);
        
        
        this.panelPrincipal.add(b1);

        JButton b2 = new JButton("Boton 2");
        b2.setFocusPainted(false);
        b2.setBorderPainted(false);
        b2.setBackground(Color.green);
        this.panelPrincipal.add(b2);

        JButton b3 = new JButton("Boton 3");
        b3.setFocusPainted(false);
        b3.setBorderPainted(false);
        b3.setBackground(Color.blue);
        this.panelPrincipal.add(b3);

        this.setLocation(50, 100);
        this.setSize(400, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }}
