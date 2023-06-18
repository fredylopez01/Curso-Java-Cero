package Interfaz;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;

public class J29JPasswordField extends JFrame {
	private JLabel enunciado;
	private JPasswordField password;
	
	public J29JPasswordField() {
		setLayout(null);
		setSize(300, 250);
		setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        enunciado = new JLabel("Ingrese la contraseña");
        enunciado.setBounds(20, 20, 140, 20);
        add(enunciado);
        
        password = new JPasswordField();
        password.setBounds(20, 50, 140, 20);
        add(password);
	}

	public static void main(String[] args) {
		J29JPasswordField window = new J29JPasswordField();
		
	}

}
