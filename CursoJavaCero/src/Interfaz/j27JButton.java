package Interfaz;

import javax.swing.*;
import java.awt.event.*;

public class j27JButton extends JFrame implements ActionListener{

    JButton botonOne;

    public j27JButton(){
        setLayout(null);
        botonOne = new JButton("Cerrar");
        botonOne.setBounds(300, 250, 100, 30);
        add(botonOne);
        botonOne.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == botonOne){
            System.exit(0);
        }
    }

    public static void main (String [] args){
        j27JButton interfaz = new j27JButton();
        interfaz.setBounds(0, 0, 450, 350);
        interfaz.setVisible(true);
        interfaz.setResizable(false);
        interfaz.setLocationRelativeTo(null);
    }
}