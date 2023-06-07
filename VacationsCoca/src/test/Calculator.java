package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Calculator extends JFrame implements ActionListener {
	private JMenuBar menuBar;
	private JMenu options;
	private JMenu color;
	private JMenuItem red;
	private JMenuItem black;
	private JMenuItem purple;
	private JMenuItem nuevo;
	private JMenuItem salir;
	private JMenu calculate;
	private JMenuItem cVacations;
	private JMenu about;
	private JMenuItem creator;
	private JLabel spaceLogo;
	private Icon logo;
	private JLabel welcome;
	private JLabel title;
	private JLabel qName;
	private JTextField name;
	private JLabel qFirstLastName;
	private JTextField firstName;
	private JLabel qSecondLastName;
	private JTextField secondName;
	private JLabel qSection;
	private JComboBox<String> section;
	private JLabel qAntiquity;
	private JComboBox<String> antiquity;
	private JLabel mResult;
	private JScrollPane move;
	private JTextArea result;
	private JLabel slogan;
	
	public Calculator(String sName) {
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(255, 0, 0));
		setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 0, 0));
		setJMenuBar(menuBar);
		
		options = new JMenu("Opciones");
		options.setFont(new Font("Andale mono", 1, 12));
		options.setForeground(new Color(255, 255, 255));
		menuBar.add(options);
		
		color = new JMenu("Color de fondo");
		color.setFont(new Font("Andale mono", 1, 12));
		color.setForeground(new Color(255, 0, 0));
		options.add(color);
		
		red = new JMenuItem("Rojo");
		red.setFont(new Font("Andale mono", 1, 12));
		red.setForeground(new Color(255, 0, 0));
		red.addActionListener(this);
		color.add(red);
		
		black = new JMenuItem("Negro");
		black.setFont(new Font("Andale mono", 1, 12));
		black.setForeground(new Color(0, 0, 0));
		black.addActionListener(this);
		color.add(black);
		
		purple = new JMenuItem("Morado");
		purple.setFont(new Font("Andale mono", 1, 12));
		purple.setForeground(new Color(128, 0, 128));
		purple.addActionListener(this);
		color.add(purple);
		
		nuevo = new JMenuItem("Nuevo");
		nuevo.setFont(new Font("Andale mono", 1, 12));
		nuevo.setForeground(new Color(255, 0, 0));
		nuevo.addActionListener(this);
		options.add(nuevo);
		
		salir = new JMenuItem("Cerrar sesión");
		salir.setFont(new Font("Andale mono", 1, 12));
		salir.setForeground(new Color(255, 0, 0));
		salir.addActionListener(this);
		options.add(salir);
		
		calculate = new JMenu("Calcular");
		calculate.setFont(new Font("Andale mono", 1, 12));
		calculate.setForeground(new Color(255, 255, 255));
		menuBar.add(calculate);
		
		cVacations = new JMenuItem("Vacaciones");
		cVacations.setFont(new Font("Andale mono", 1, 12));
		cVacations.setForeground(new Color(255, 0, 0));
		cVacations.addActionListener(this);
		calculate.add(cVacations);
		
		about = new JMenu("Acerca de");
		about.setFont(new Font("Andale mono", 1, 12));
		about.setForeground(new Color(255, 255, 255));
		about.addActionListener(this);
		menuBar.add(about);
		
		creator = new JMenuItem("Creador");
		creator.setFont(new Font("Andale mono", 1, 12));
		creator.setForeground(new Color(255, 0, 0));
		creator.addActionListener(this);
		about.add(creator);
		
		logo = new ImageIcon(getClass().getResource("logo-coca.png"));
		spaceLogo = new JLabel(logo);
		spaceLogo.setBounds(10, 10, 250, 100);
		add(spaceLogo);
		
		welcome = new JLabel("Bienvenido " + sName);
		welcome.setBounds(300, 35, 300, 50);
		welcome.setFont(new Font("Andale mono", 1, 28));
		welcome.setForeground(new Color(255, 255, 255));
		add(welcome);
		
		title = new JLabel("Datos del trabajador para el cálculo de vacaciones");
		title.setBounds(50, 100, 450, 50);
		title.setFont(new Font("Andale mono", 1, 18));
		title.setForeground(new Color(255, 255, 255));
		add(title);
		
		qName = new JLabel("Nombre completo:");
		qName.setBounds(20, 160, 150, 20);
		qName.setForeground(new Color(255, 255, 255));
		add(qName);
		
		name = new JTextField();
		name.setBounds(20, 180, 150, 25);
		add(name);
		
		qFirstLastName = new JLabel("Apellido Paterno:");
		qFirstLastName.setBounds(20, 220, 150, 20);
		qFirstLastName.setForeground(new Color(255, 255, 255));
		add(qFirstLastName);
		
		firstName = new JTextField();
		firstName.setBounds(20, 240, 150, 25);
		add(firstName);
		
		qSecondLastName = new JLabel("Apellido Materno:");
		qSecondLastName.setBounds(20, 280, 150, 20);
		qSecondLastName.setForeground(new Color(255, 255, 255));
		add(qSecondLastName);
		
		secondName = new JTextField();
		secondName.setBounds(20, 300, 150, 25);
		add(secondName);
		
		qSection = new JLabel("Selecciona el Departamento:");
		qSection.setBounds(240, 160, 180, 20);
		qSection.setForeground(new Color(255, 255, 255));
		add(qSection);
		
		section = new JComboBox<String>();
		section.setBounds(240, 180, 200, 25);
		section.addItem("");
		section.addItem("Atención al Cliente");
		section.addItem("Departamento de Logistica");
		section.addItem("Departamento de Gerencia");
		section.setSelectedIndex(0);
		add(section);
		
		
		qAntiquity = new JLabel("Selecciona la Antiguedad:");
		qAntiquity.setBounds(240, 220, 150, 20);
		qAntiquity.setForeground(new Color(255, 255, 255));
		add(qAntiquity);
		
		antiquity = new JComboBox<String>();
		antiquity.setBounds(240, 240, 200, 25);
		antiquity.addItem("");
		antiquity.addItem("1 año de servicio");
		antiquity.addItem("2 a 6 años de servicio");
		antiquity.addItem("7 años o más de servicio");
		antiquity.setSelectedIndex(0);
		add(antiquity);
		
		mResult = new JLabel("Resultado del Cálculo:");
		mResult.setBounds(240, 280, 150, 20);
		mResult.setForeground(new Color(255, 255, 255));
		add(mResult);
		
		result = new JTextArea("Aqui aparece el resultado del cálculo de las \nvacaciones");
		result.setFont(new Font("Andale mono", 1, 12));
		result.setForeground(new Color(255, 0, 0));
		result.setEnabled(false);
		add(result);
		
		move = new JScrollPane(result);
		move.setBounds(240, 300, 320, 90);
		add(move);
		
		slogan = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
		slogan.setBounds(90, 400 , 380, 25);
		slogan.setFont(new Font("Andale mono", 1, 12));
		slogan.setForeground(new Color(255, 255, 255));
		add(slogan);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == red) {
			getContentPane().setBackground(new Color(255, 0, 0));
			menuBar.setBackground(new Color(255, 0, 0));
		} 
		if(e.getSource() == black) {
			getContentPane().setBackground(new Color(0, 0, 0));
			menuBar.setBackground(new Color(0, 0, 0));
		} 
		if(e.getSource() == purple) {
			getContentPane().setBackground(new Color(51, 0, 51));
			menuBar.setBackground(new Color(51, 0, 51));
		}
		if(e.getSource() == nuevo) {
			name.setText("");
			firstName.setText("");
			secondName.setText("");
			section.setSelectedIndex(0);
			antiquity.setSelectedIndex(0);
			result.setText("Aqui aparece el resultado del cálculo de las \nvacaciones");
		} if(e.getSource() == salir) {
			Login loginTest = new Login();
			loginTest.setSize(300, 410);
			loginTest.setVisible(true);
			loginTest.setResizable(false);
			loginTest.setLocationRelativeTo(null);
			loginTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(false);
		}
		if(e.getSource() == creator) {
			JOptionPane.showMessageDialog(null, "Creador:\nFredy Oswaldo López D\nEstudiante de Ingenieria de Sistemas ", "Acerca del Creador", 0, new ImageIcon(new ImageIcon(getClass().getResource("coca-cola.png")).getImage().getScaledInstance(60, 40, 0)));
		}
		if(e.getSource() == cVacations) {
			String sName = name.getText();
			String sFirstName = firstName.getText();
			String sSecondName = secondName.getText();
			String sSection = section.getSelectedItem().toString();
			String sAntiquity =  antiquity.getSelectedItem().toString();
			if(sName.equals("") || sFirstName.equals("") || sSecondName.equals("") || sSection.equals("") || sAntiquity.equals("")) {
				JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", 0, new ImageIcon(new ImageIcon(getClass().getResource("incorrect.jpg")).getImage().getScaledInstance(40, 40, 0)));
			} else {
				result.setText("El señor(a): " + sName + " " + sFirstName + " " + sSecondName + "\nque pertenece al departamento de:\n" 
						+ sSection + " con " + sAntiquity + "\ntiene derecho a: " + determinarVacaciones(sSection, sAntiquity));
			}
			
		}
		
	}
	
	public String determinarVacaciones(String section, String antiquity) {
		String message = "";
		if(section.equals("Atención al Cliente")) {
			if(antiquity.equals("1 año de servicio")) {
				message = " 6 dias de vacaciones"; 
			} else if(antiquity.equals("2 a 6 años de servicio")) {
				message = " 14 dias de vacaciones";
			} else if(antiquity.equals("7 años o más de servicio")) {
				message = " 20 dias de vacaciones";
			} 
		} else if(section.equals("Departamento de Logistica")) {
			if(antiquity.equals("1 año de servicio")) {
				message = " 7 dias de vacaciones";
			} else if(antiquity.equals("2 a 6 años de servicio")) {
				message = " 15 dias de vacaciones";
			} else if(antiquity.equals("7 años o más de servicio")) {
				message = " 22 dias de vacaciones";
			}
		} else if(section.equals("Departamento de Gerencia")) {
			if(antiquity.equals("1 año de servicio")) {
				message = " 10 dias de vacaciones";
			} else if(antiquity.equals("2 a 6 años de servicio")) {
				message = " 20 dias de vacaciones";
			} else if(antiquity.equals("7 años o más de servicio")) {
				message = " 30 dias de vacaciones";
			}
		}
		return message;
	}

}
