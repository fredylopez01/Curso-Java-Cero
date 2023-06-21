package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Presenter extends JFrame implements ActionListener {
	private JButton[][] buttons;
	private int counter;
	private JTextArea turn;
	private JTextArea win;
	private JButton retry;
	private String playerOne; 
	private String playerTwo;
	
	public Presenter() {
		buttons = new JButton[3][3];
		ubicarBotones();
		
		win = new JTextArea();
		win.setBounds(480, 120, 250, 80);
		win.setFont(new Font("Andale Mono", 1, 30));
		win.setEnabled(false);
		add(win);
		
		retry = new JButton("Nuevo");
		retry.setBounds(480, 385, 250, 80);
		retry.setFont(new Font("Andale Mono", 1, 30));
		retry.setEnabled(false);
		retry.addActionListener(this);
		add(retry);
		
		counter = 0;
		turn = new JTextArea();
		turn.setBounds(480, 20, 250, 80);
		turn.setFont(new Font("Andale Mono", 1, 30));
		turn.setEnabled(false);
		add(turn);
	}
	
	public static void main(String[] args) {
		Presenter juego = new Presenter();
		juego.run();
	}
	
	public void run() {
		playerOne = JOptionPane.showInputDialog("Ingrese el nombre del jugador 1");
		playerTwo = JOptionPane.showInputDialog("Ingrese el nombre del jugador 2");
		turn.setText("Turno para\n" + playerOne);
		win.setText("");
		setLayout(null);
		setSize(800, 530);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void ubicarBotones() {
		for(int i = 0; i < buttons.length; i++) {
			for(int j = 0; j < buttons[0].length; j++) {
				buttons[i][j] = new JButton("");
				buttons[i][j].setBounds(20+(j*150), 20+(i*150), 150, 150);
				buttons[i][j].setFont(new Font("Andale Mono", 1, 50));
				buttons[i][j].setBackground(new Color(255, 255, 255));
				buttons[i][j].addActionListener(this);
				add(buttons[i][j]);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == retry) {
			for(int i = 0; i < buttons.length; i++) {
				for(int j = 0; j < buttons[0].length; j++) {
					buttons[i][j].setText("");
					buttons[i][j].setEnabled(true);
					buttons[i][j].setBackground(new Color(255, 255, 255));
				}
			}
			run();
		}
		for(int i = 0; i < buttons.length; i++) {
			for(int j = 0; j < buttons[0].length; j++) {
				if(e.getSource() == buttons[i][j]) {
					play(i, j);
				}
			}
		}
	}
	
	public void play(int i, int j) {
		if(counter == 0) {
			buttons[i][j].setText("O");
			buttons[i][j].setBackground(new Color(0, 0, 255));
			buttons[i][j].setEnabled(false);
			counter = 1;
			result();
			turn.setText("Turno para \n" + playerTwo);
			end();
		} else if(counter == 1) {
			buttons[i][j].setText("X");
			buttons[i][j].setBackground(new Color(0, 255, 0));
			buttons[i][j].setEnabled(false);
			counter = 0;
			result();
			turn.setText("Turno para \n" + playerOne);
			end();
		}
	}
	
	public void end() {
		if(win.getText().equals("El ganador es\n" + playerOne) || win.getText().equals("El ganador es\n" + playerTwo)) {
			retry.setEnabled(true);
			turn.setText("");
			for(int i = 0; i < buttons.length; i++) {
				for(int j = 0; j < buttons[0].length; j++) {
					buttons[i][j].setEnabled(false);
				}
			}
		}
	}
	
	public void result() {
		if(horizontal() == 1 || diagonal() == 1 || vertical() == 1 || diagonalBack() == 1) {
			win.setText("El ganador es\n" + playerOne);
		} else if(horizontal() == 2 || diagonal() == 2 || vertical() == 2 || diagonalBack() == 2){
			win.setText("El ganador es\n" + playerTwo);
		}
	}
	
	public int horizontal() {
		int win = 0;
		int verifyOne = 0;
		int verifyTwo = 0;
		for(int i = 0; i < buttons.length; i++) {
			verifyOne = 0;
			verifyTwo = 0;
			for(int j = 0; j < buttons[0].length; j++) {
				if(buttons[i][j].getText().equals("O")) {
					verifyOne++;
				} else if(buttons[i][j].getText().equals("X")) {
					verifyTwo++;
				}
				if(verifyOne == 3) {
					win = 1;
				} else if(verifyTwo == 3) {
					win = 2;
				}
			}
		}
		return win;
	}
	
	public int vertical() {
		int win = 0;
		int verifyOne = 0;
		int verifyTwo = 0;
		for(int i = 0; i < buttons.length; i++) {
			verifyOne = 0;
			verifyTwo = 0;
			for(int j = 0; j < buttons[0].length; j++) {
				if(buttons[j][i].getText().equals("O")) {
					verifyOne++;
				} else if(buttons[j][i].getText().equals("X")) {
					verifyTwo++;
				}
				if(verifyOne == 3) {
					win = 1;
				} else if(verifyTwo == 3) {
					win = 2;
				}
			}
		}
		return win;
	}
	
	public int diagonal() {
		int win = 0;
		int verifyOne = 0;
		int verifyTwo = 0;
		for(int i = 0; i < buttons.length; i++) {
			for(int j = 0; j < buttons[0].length; j++) {
				if(i == j) {
					if(buttons[i][j].getText().equals("O")) {
						verifyOne++;
					} else if(buttons[i][j].getText().equals("X")) {
						verifyTwo++;
					}
				}
			}
		}
		if(verifyOne == 3) {
			win = 1;
		} else if(verifyTwo == 3) {
			win = 2;
		}
		return win;
	}
	
	public int diagonalBack() {
		int win = 0;
		int verifyOne = 0;
		int verifyTwo = 0;
		for(int i = 0; i < buttons.length; i++) {
			for(int j = 0; j < buttons[0].length; j++) {
				if(i == 0 && j == 2 || i == 1 && j == 1 || i == 2 && j == 0) {
					if(buttons[i][j].getText().equals("O")) {
						verifyOne++;
					} else if(buttons[i][j].getText().equals("X")) {
						verifyTwo++;
					}
				}
			}
		}
		if(verifyOne == 3) {
			win = 1;
		} else if(verifyTwo == 3) {
			win = 2;
		}
		return win;
	}
}
