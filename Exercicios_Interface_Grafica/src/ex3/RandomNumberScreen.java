package ex3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RandomNumberScreen {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RandomNumberScreen window = new RandomNumberScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RandomNumberScreen() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 495, 115);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Gerador de Números Aleatórios");
		
		JLabel lbText = new JLabel("N\u00FAmero Aleat\u00F3rio:");
		lbText.setBounds(10, 26, 143, 14);
		frame.getContentPane().add(lbText);
		
		JTextArea txtNumber = new JTextArea();
		txtNumber.setBounds(133, 21, 120, 22);
		frame.getContentPane().add(txtNumber);
		
		JButton btnGenerate = new JButton("Gerar");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RandomNumber randomNumber = new RandomNumber();
				txtNumber.setText(randomNumber.getRandomNumber());
			}
		});
		btnGenerate.setBounds(279, 22, 89, 23);
		frame.getContentPane().add(btnGenerate);
		
		JButton btnClear = new JButton("Limpar");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumber.setText("");
			}
		});
		btnClear.setBounds(378, 22, 89, 23);
		frame.getContentPane().add(btnClear);
	
	}
	
}
