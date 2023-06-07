package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TermsAndConditions extends JFrame implements ActionListener, ChangeListener {
	private JLabel title;
	private JTextArea terms;
	private JScrollPane move;
	private JCheckBox affirmation;
	private JButton accept;
	private JButton noAccept;
	private Icon icon;
	private JLabel image;
	private String name;
	
	public TermsAndConditions(String name) {
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
		this.name = name;
		
		title = new JLabel("TÉRMINOS Y CONDICIONES");
		title.setBounds(200, 10, 200, 35);
		title.setFont(new Font("Andale Mono", 1, 14));
		title.setForeground(new Color(0, 0, 0));
		add(title);
		
		terms = new JTextArea();
		terms.setEditable(false);
		terms.setFont(new Font("Andale Mono", 0, 11));
		terms.setText(termString());
		
		move = new JScrollPane(terms);
		move.setBounds(10, 50, 560, 200);
		add(move);
		
		affirmation = new JCheckBox("Yo " + this.name + " Acepto");
		affirmation.setBounds(10, 260, 250, 25);
		affirmation.addChangeListener(this);
		add(affirmation);
		
		accept = new JButton("Continuar");
		accept.setBounds(10, 300, 100, 30);
		accept.setEnabled(false);
		accept.addActionListener(this);
		add(accept);
		
		noAccept = new JButton("No acepto");
		noAccept.setBounds(130, 300, 100, 30);
		noAccept.addActionListener(this);
		add(noAccept);
		
		icon = new ImageIcon(getClass().getResource("coca-cola.png"));
		image = new JLabel(icon);
		image.setBounds(300, 230, 300, 150);
		add(image);
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		if(affirmation.isSelected()) {
			accept.setEnabled(true);
			noAccept.setEnabled(false);
		} else {
			accept.setEnabled(false);
			noAccept.setEnabled(true);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == accept) {
			Calculator calculatorTest = new Calculator(name);
			calculatorTest.setSize(600, 500);
			calculatorTest.setVisible(true);
			calculatorTest.setResizable(false);
			calculatorTest.setLocationRelativeTo(null);
			calculatorTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(false);
		} else if(e.getSource() == noAccept) {
			Login loginTest = new Login();
			loginTest.setSize(300, 410);
			loginTest.setVisible(true);
			loginTest.setResizable(false);
			loginTest.setLocationRelativeTo(null);
			loginTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(false);
		}
	}

	public String termString() {
		return "\n          Esta página web es propiedad y está operado por Empresas de gaseosas.S.A.S. "
				+ "\n          Estos Términos establecen los términos y condiciones bajo los cuales tu puedes usar nuestra "
				+ "\n          página web y servicios ofrecidos por nosotros. Esta página web ofrece a los visitantes consultar la "
				+ "\n          cantidad de vacaciones que se ofrece en este sitio web"
				+ "\n\n          Al acceder o usar la página web de nuestro servicio, usted aprueba que haya leído, entendido y "
				+ "\n          aceptado estar sujeto a estos Términos:"
				+ "\n          Para usar nuestro página web y / o recibir nuestros servicios, debes tener al menos 18 años de "
				+ "\n          edad, o la mayoría de edad legal en tu jurisdicción, y poseer la autoridad legal, el derecho y "
				+ "\n          la libertad para participar en estos "
				+ "\n          Términos como un acuerdo vinculante. No tienes permitido utilizar esta página web y / o recibir"
				+ "\n          servicios si hacerlo está prohibido en tu país o en virtud de cualquier ley o regulación aplicable"
				+ "\n          a tu caso."
				+ "\n\n          El Servicio y todos los materiales incluidos o transferidos, incluyendo, sin limitación, "
				+ "\n          software, imágenes, texto, gráficos, logotipos, patentes, marcas registradas, marcas de servicio,"
				+ "\n          derechos de autor, fotografías, audio, videos, música y todos los Derechos de Propiedad "
				+ "\n          Intelectual relacionados con ellos, son la propiedad exclusiva de nn. "
				+ "\n          Salvo que se indique explícitamente en este documento, no se considerará que nada en estos "
				+ "\n          Términos crea una licencia en o bajo ninguno de dichos Derechos de Propiedad Intelectual, "
				+ "\n          y tu aceptas no vender, licenciar, alquilar, modificar, distribuir, copiar, "
				+ "\n          reproducir, transmitir, exhibir públicamente, realizar públicamente, publicar, adaptar, editar "
				+ "\n          o crear trabajos derivados de los mismos.";
	}
	
}
