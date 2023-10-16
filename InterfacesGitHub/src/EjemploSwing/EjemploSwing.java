package EjemploSwing;
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploSwing {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de Componentes de Swing"); //CREA JFRAME CON EL NOMBRE QUE SE LE DA
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRARSE AL DAR A LA X
        ventana.setSize(400, 300); //TAMAÑO DEL JFRAME

        JPanel panel = new JPanel(); //CREANDO UN PANEL
        panel.setLayout(new GridLayout(7, 2, 10, 10)); //CREANDO UN LAYOUT CON GRID QUE ES MAS ESPECÍFICO

        JLabel etiqueta = new JLabel("Etiqueta:"); //CREANDO UNA JLABEL CON NOMBRE ETIQUETA
        panel.add(etiqueta); //AÑADE ETIQUETA

        JTextField campoTexto = new JTextField(20); //CREA UN TEXFIELD
        panel.add(campoTexto); //AÑADE UN TEXFIELD

        JButton boton = new JButton("Botón"); //CREA UN BOTÓN
        panel.add(boton); //AÑADE EL BOTON

        JCheckBox checkBox = new JCheckBox("Casilla de Verificación"); //CREA UN CHECKBOX
        panel.add(checkBox); //AÑADE UN CHHECKBOX

        ButtonGroup grupoRadio = new ButtonGroup(); //CREA UN BUTTONGROUP
        JRadioButton radio1 = new JRadioButton("Opción 1"); //CREA RADIOBUTTON OPCION 1
        JRadioButton radio2 = new JRadioButton("Opción 2"); //CREA RADIOBUTTON OPCION 2
        grupoRadio.add(radio1);
        grupoRadio.add(radio2);
        panel.add(radio1);
        panel.add(radio2); //AÑADE TODO LO ANTERIOR

        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"}; //CREA UN ARRAY DE STRINGS
        JComboBox<String> comboBox = new JComboBox<>(opciones); //CREA UN COMBOBOX CON EL ARRAY DE ANTES
        panel.add(comboBox); //LO AÑADE

        JButton dialogoBoton = new JButton("Mostrar Diálogo"); //CREA UN JBUTTON
        panel.add(dialogoBoton); //LO AÑADE

        // IGNORAR ESTE BLOQUE
        dialogoBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialogo = new JDialog(ventana, "Diálogo de Ejemplo", true);
                dialogo.setSize(300, 150);
                dialogo.setLayout(new FlowLayout());
                JLabel mensajeDialogo = new JLabel("Este es un JDialog de ejemplo.");
                dialogo.add(mensajeDialogo);
                dialogo.setVisible(true);
				
			}
        });

        ventana.add(panel);
        ventana.setVisible(true); //
    }
}