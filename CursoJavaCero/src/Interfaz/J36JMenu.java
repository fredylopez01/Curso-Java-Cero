package Interfaz;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class J36JMenu extends JFrame implements ActionListener {
	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem itemOne;
	private JMenuItem itemTwo;
	private JMenuItem itemThree;
	
	public J36JMenu() {
		setLayout(null);
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		menu = new JMenu("Opciones");
		menubar.add(menu);
		
		itemOne = new JMenuItem("Azul");
		itemOne.addActionListener(this);
		menu.add(itemOne);
		
		itemTwo = new JMenuItem("Rojo");
		itemTwo.addActionListener(this);
		menu.add(itemTwo);
		
		itemThree = new JMenuItem("Verde");
		itemThree.addActionListener(this);
		menu.add(itemThree);
	}

	public static void main(String[] args) {
		J36JMenu window = new J36JMenu();
		window.setSize(400, 300);
		window.setTitle("Colores");
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Container background = this.getContentPane();
		if(e.getSource() == itemOne) {
			background.setBackground(new Color(0, 0, 255));
		} else if(e.getSource() == itemTwo){
			background.setBackground(new Color(255, 0, 0));
		} else if(e.getSource() == itemThree) {
			background.setBackground(new Color(0, 255, 0));
		}
	}

}
