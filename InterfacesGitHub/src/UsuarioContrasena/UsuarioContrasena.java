package UsuarioContrasena;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioContrasena {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Registro de Usuarios");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel etiquetaUsuario = new JLabel("Nombre de Usuario:");
        JTextField campoUsuario = new JTextField(15);
        JLabel etiquetaContraseña = new JLabel("Contraseña:");
        JPasswordField campoContraseña = new JPasswordField(15);
        JButton botonRegistro = new JButton("Registrarse");
        botonRegistro.setBackground(new Color(0, 206, 209));
        botonRegistro.setBorderPainted(false);
        JLabel etiquetaResultado = new JLabel();
        
        botonRegistro.addActionListener(
        		new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String usuario = campoUsuario.getText();
						char [] contrasena = campoContraseña.getPassword();
						int longi = contrasena.length;
						if(!usuario.equals("")) {
							if(longi != 0) {
								etiquetaResultado.setText("Usuario y contraseña introducido. Hola " + usuario + "!");
							}else {
								etiquetaResultado.setText("Introduce contraseña");
							}
						}else {
							etiquetaResultado.setText("Introduce nombre usuario");
						}
					}
				}
        		);

        panel.add(etiquetaUsuario);
        panel.add(campoUsuario);
        panel.add(etiquetaContraseña);
        panel.add(campoContraseña);
        panel.add(new JLabel());
        panel.add(botonRegistro);
        panel.add(etiquetaResultado);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(550, 200);
        ventana.add(panel);
        ventana.setVisible(true);
    }
}