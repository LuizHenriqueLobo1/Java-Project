package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class SwingButtons {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingButtons window = new SwingButtons();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SwingButtons() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Bot�es com Swing");
		
		JButton btnNorth = new JButton("Bot�o Norte");
		btnNorth.setBounds(0, 0, 434, 23);
		frame.getContentPane().add(btnNorth);
		
		JButton btnSouth = new JButton("Bot�o Sul");
		btnSouth.setBounds(0, 238, 434, 23);
		frame.getContentPane().add(btnSouth);
		
		JButton btnEast = new JButton("Bot�o Leste");
		btnEast.setBounds(345, 22, 89, 217);
		frame.getContentPane().add(btnEast);
		
		JButton btnWest = new JButton("Bot�o Oeste");
		btnWest.setBounds(0, 22, 89, 217);
		frame.getContentPane().add(btnWest);
		
	}
	
}
