package Interfaz;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class J37Submenu extends JFrame implements ActionListener {
	private JMenuBar menubar;
	private JMenu menu;
	private JMenu submenuOne;
	private JMenu submenuTwo;
	private JMenuItem itemOne;
	private JMenuItem itemTwo;
	private JMenuItem itemThree;
	private JMenuItem itemFour;
	
	public J37Submenu() {
		setLayout(null);
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		menu = new JMenu("Opciones");
		menubar.add(menu);
		
		submenuOne = new JMenu("Tamaño de la ventana");
		menu.add(submenuOne);
		
		submenuTwo = new JMenu("Color de fondo");
		menu.add(submenuTwo);
		
		itemOne = new JMenuItem("300*200");
		itemOne.addActionListener(this);
		submenuOne.add(itemOne);
		
		itemTwo = new JMenuItem("640*480");
		itemTwo.addActionListener(this);
		submenuOne.add(itemTwo);
		
		itemThree = new JMenuItem("Verde");
		itemThree.addActionListener(this);
		submenuTwo.add(itemThree);
		
		itemFour = new JMenuItem("Azul");
		itemFour.addActionListener(this);
		submenuTwo.add(itemFour);
	}

	public static void main(String[] args) {
		J37Submenu window = new J37Submenu();
		window.setSize(400, 300);
		window.setTitle("Submenus");
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == itemOne) {
			setSize(300, 200);
			setLocationRelativeTo(null);
		} else if(e.getSource() == itemTwo){
			setSize(640, 480);
			setLocationRelativeTo(null);
		} else if(e.getSource() == itemThree) {
			getContentPane().setBackground(new Color(0, 255, 0));
		} else if(e.getSource() == itemFour) {
			getContentPane().setBackground(new Color(0, 0, 200));
		}
	}
}
