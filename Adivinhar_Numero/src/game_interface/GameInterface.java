package game_interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import game_logic.GameLogic;

public class GameInterface {

	private JFrame frame;
	private JTextField textField;
	private JButton btnStart;
	private JButton btnPlay;
	private JLabel lblStatus;
	private JLabel lblResult;
	private JLabel lblCount;
	private JLabel lblAttempments;

	private GameLogic game = new GameLogic();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameInterface window = new GameInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GameInterface() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Adivinhe o Número");
		
		JLabel lblTitle = new JLabel("Digite um número:");
		lblTitle.setBounds(30, 50, 106, 14);
		frame.getContentPane().add(lblTitle);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(146, 47, 97, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnStart = new JButton("Iniciar");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.start();
				btnStart.setEnabled(false);
				btnPlay.setEnabled(true);
				textField.setEnabled(true);
				lblResult.setText("O jogo começou, faça sua jogada.");
				lblCount.setText("0");
			}
		});
		btnStart.setBounds(30, 105, 89, 23);
		frame.getContentPane().add(btnStart);
		
		btnPlay = new JButton("Jogar");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.setPlayerNumber(Integer.parseInt(textField.getText()));
				lblResult.setText(game.compare(game.getPlayerNumber()));
				lblCount.setText(Integer.toString(game.getCount()));
				textField.setText("");
				if(game.getStatus() == false) {
					btnStart.setEnabled(true);
					btnPlay.setEnabled(false);
					textField.setEnabled(false);
				}
			}
		});
		btnPlay.setEnabled(false);
		btnPlay.setBounds(154, 105, 89, 23);
		frame.getContentPane().add(btnPlay);
		
		lblStatus = new JLabel("Status:");
		lblStatus.setBounds(10, 184, 46, 14);
		frame.getContentPane().add(lblStatus);
		
		lblResult = new JLabel("Clique em (Iniciar) para começar!");
		lblResult.setBounds(54, 184, 245, 14);
		frame.getContentPane().add(lblResult);
		
		lblCount = new JLabel("0");
		lblCount.setBounds(78, 220, 35, 14);
		frame.getContentPane().add(lblCount);
		
		lblAttempments = new JLabel("Tentativas: ");
		lblAttempments.setBounds(10, 220, 70, 14);
		frame.getContentPane().add(lblAttempments);
	}
	
}
