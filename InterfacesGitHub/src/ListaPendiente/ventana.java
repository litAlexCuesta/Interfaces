package ListaPendiente;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ventana extends JFrame{
	
 private Container panelPrincipal;
 private JPanel panelSur;

ventana(String _msg){
	 super(_msg);
	 
	 DefaultListModel<String> modeloLista = new DefaultListModel<>();
	 JList<String> listaTareas = new JList<>(modeloLista);
	 
	 this.panelPrincipal = this.getContentPane();
	 this.panelPrincipal.setLayout(new BorderLayout());
	 
	 
	 JScrollPane sp = new JScrollPane(listaTareas);
	 this.panelPrincipal.add(sp, BorderLayout.NORTH);

	 
	 this.panelSur = new JPanel();
	 this.panelSur.setLayout(new FlowLayout());
	 JTextField jt = new JTextField(15);
	 this.panelSur.add(jt);
	 JButton a = new JButton("Añadir");
	 a.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			modeloLista.addElement(jt.getText());
			
		}
	});
	 this.panelSur.add(a);
	 JButton b = new JButton("Borrar");
	 this.panelSur.add(b);
	 b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			modeloLista.removeElement(jt.getText());
			modeloLista.remove(listaTareas.getSelectedIndex());
			
		}
	});
	 this.panelPrincipal.add(panelSur, BorderLayout.SOUTH);
	 
	 
	 
	 	this.setLocation(50, 100);
		this.setSize(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
	
	


}
