package test;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	private JLabel spaceLogo;
	private Icon logo;
	private JLabel funtion;
	private JLabel question;
	private JTextField name;
	private JButton getInto;
	private JLabel slogan;
	private String sName = "";
	
	public Login() {
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Login");
		getContentPane().setBackground(new Color(255, 0, 0));
		setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
		
		logo = new ImageIcon(getClass().getResource("logo-coca.png"));
		spaceLogo = new JLabel(logo);
		spaceLogo.setBounds(20, 20, 250, 100);
		add(spaceLogo);
		
		funtion = new JLabel("Sistema de Control Vacacional");
		funtion.setBounds(25, 110, 250, 20);
		funtion.setFont(new Font("Andale Mono", 3, 16));
		funtion.setForeground(new Color(255, 255, 255));
		add(funtion);
		
		question = new JLabel("Ingrese su nombre");
		question.setBounds(20, 180, 120, 25);
		question.setFont(new Font("Andale Mono", 1, 12));
		question.setForeground(new Color(255, 255, 255));
		add(question);
		
		name = new JTextField();
		name.setBounds(20, 205, 250, 25);
		name.setBackground(new Color(255, 255, 255));
		name.setFont(new Font("Andale Mono", 1, 14));
		name.setForeground(new Color(255, 0, 0));
		add(name);
		
		getInto = new JButton("Ingresar");
		getInto.setBounds(100, 250, 100, 30);
		getInto.setBackground(new Color(255, 255, 255));
		getInto.setFont(new Font("Andale Mono", 1, 14));
		getInto.setForeground(new Color(255, 0, 0));
		getInto.addActionListener(this);
		add(getInto);
		
		slogan = new JLabel("©2017 The Coca-Cola Company");
		slogan.setBounds(55, 330 , 200, 25);
		slogan.setFont(new Font("Andale Mono", 1, 12));
		slogan.setForeground(new Color(255, 255, 255));
		add(slogan);
	}
	
	public static void main(String[] args) {
		Login loginTest = new Login();
		loginTest.setSize(300, 410);
		loginTest.setVisible(true);
		loginTest.setResizable(false);
		loginTest.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == getInto) {
			sName = name.getText().trim();
			if(sName.equals("")) {
				JOptionPane.showMessageDialog(null, "Debe llenar el campo con su nombre", "Error", 0, new ImageIcon(new ImageIcon(getClass().getResource("incorrect.jpg")).getImage().getScaledInstance(40, 40, 0)));
			} else {
				TermsAndConditions terms = new TermsAndConditions(sName);
				terms.setSize(600, 400);
				terms.setVisible(true);
				terms.setResizable(false);
				terms.setLocationRelativeTo(null);
				terms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setVisible(false);
			}
		}
	}
}
