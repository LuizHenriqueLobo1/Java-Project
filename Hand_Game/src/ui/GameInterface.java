package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import main.ZeroOne;
import main.EvenOdd;
import main.Player;

public class GameInterface {

	private JFrame frame;
	private ZeroOne zeroOne;
	private EvenOdd evenOdd;
	private JTextField textPlayerName;
	private JTextField textPlayResult;
	private JTextField textRemovedPlayerName;
	private JTextField textPlayer1;
	private JTextField textPlayer2;
	private JTextField textStatus;
	private JTextField textFinalResult;
	
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
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Jogos");
		
		zeroOne = new ZeroOne();
		evenOdd = new EvenOdd();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 464, 439);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panelZeroOne = new JPanel();
		tabbedPane.addTab("Zero ou Um", null, panelZeroOne, null);
		panelZeroOne.setLayout(null);
		
		JLabel lblPlayer = new JLabel("Nome do Jogador:");
		lblPlayer.setBounds(10, 46, 104, 14);
		panelZeroOne.add(lblPlayer);
		
		textPlayerName = new JTextField();
		textPlayerName.setBounds(124, 43, 156, 20);
		panelZeroOne.add(textPlayerName);
		textPlayerName.setColumns(10);
		
		JLabel lblPlay = new JLabel("Resultado da jogada: ");
		lblPlay.setBounds(10, 136, 128, 14);
		panelZeroOne.add(lblPlay);
		
		textPlayResult = new JTextField();
		textPlayResult.setBounds(10, 166, 439, 20);
		panelZeroOne.add(textPlayResult);
		textPlayResult.setColumns(10);
		textPlayResult.setEditable(false);
		
		JLabel lblRemovedPlayerName = new JLabel("Jogador eliminado:");
		lblRemovedPlayerName.setBounds(10, 296, 110, 14);
		panelZeroOne.add(lblRemovedPlayerName);
		
		textRemovedPlayerName = new JTextField();
		textRemovedPlayerName.setBounds(124, 293, 156, 20);
		panelZeroOne.add(textRemovedPlayerName);
		textRemovedPlayerName.setColumns(10);
		textRemovedPlayerName.setEditable(false);
		
		JButton btnRegister = new JButton("Cadastrar");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zeroOne.addPlayer(new Player(textPlayerName.getText()));
				textPlayerName.setText("");
			}
		});
		btnRegister.setBounds(309, 42, 116, 23);
		panelZeroOne.add(btnRegister);
		
		JButton btnReset = new JButton("Resetar");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zeroOne.resetPlayers();
				textPlayResult.setText("");
				textRemovedPlayerName.setText("");
			}
		});
		btnReset.setBounds(309, 76, 116, 23);
		panelZeroOne.add(btnReset);
		
		JButton btnPlay = new JButton("Jogar");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(zeroOne.getPlayerListSize() > 2) {
					zeroOne.setPlayersNumbers();
					textPlayResult.setText(zeroOne.showPlayers());
					zeroOne.comparePlayersNumbers();
					textRemovedPlayerName.setText(zeroOne.getRemovedPlayerName());
				} else if(zeroOne.getPlayerListSize() < 2) {
					JOptionPane.showMessageDialog(null, "É preciso de 2 jogadores ou mais.");
				} else {
					textPlayResult.setText(zeroOne.showPlayers());
					textRemovedPlayerName.setText("");
				}
			}
		});
		btnPlay.setBounds(172, 206, 116, 23);
		panelZeroOne.add(btnPlay);
		
		JPanel panelEvenOdd = new JPanel();
		tabbedPane.addTab("Par ou Impar", null, panelEvenOdd, null);
		panelEvenOdd.setLayout(null);
		
		JLabel lblPlayer1 = new JLabel("Jogador 1:");
		lblPlayer1.setBounds(10, 46, 76, 14);
		panelEvenOdd.add(lblPlayer1);
		
		textPlayer1 = new JTextField();
		textPlayer1.setBounds(85, 43, 116, 20);
		panelEvenOdd.add(textPlayer1);
		textPlayer1.setColumns(10);
		
		JLabel lblPlayer2 = new JLabel("Jogador 2:");
		lblPlayer2.setBounds(10, 76, 76, 14);
		panelEvenOdd.add(lblPlayer2);
		
		textPlayer2 = new JTextField();
		textPlayer2.setColumns(10);
		textPlayer2.setBounds(85, 73, 116, 20);
		panelEvenOdd.add(textPlayer2);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setBounds(10, 136, 95, 14);
		panelEvenOdd.add(lblStatus);
		
		textStatus = new JTextField();
		textStatus.setBounds(10, 166, 439, 20);
		panelEvenOdd.add(textStatus);
		textStatus.setColumns(10);
		textStatus.setEditable(false);
		
		JLabel lblFinalResult = new JLabel("Resultado final:");
		lblFinalResult.setBounds(10, 270, 94, 14);
		panelEvenOdd.add(lblFinalResult);
		
		textFinalResult = new JTextField();
		textFinalResult.setBounds(10, 300, 439, 20);
		panelEvenOdd.add(textFinalResult);
		textFinalResult.setColumns(10);
		textFinalResult.setEditable(false);
		
		JButton btnRegisterStart = new JButton("Cadastrar e Iniciar");
		btnRegisterStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evenOdd.resetPlayers();
				evenOdd.addPlayer(new Player(textPlayer1.getText()));
				evenOdd.addPlayer(new Player(textPlayer2.getText()));
				evenOdd.setPlayersOptions();
				evenOdd.setPlayersNumbers();
				textStatus.setText("");
				textStatus.setText(evenOdd.showPlayers());
			}
		});
		btnRegisterStart.setBounds(258, 54, 148, 23);
		panelEvenOdd.add(btnRegisterStart);
		
		JButton btnPlay2 = new JButton("Jogar");
		btnPlay2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evenOdd.defineWinner();
				textFinalResult.setText(evenOdd.showResult());
			}
		});
		btnPlay2.setBounds(162, 212, 134, 23);
		panelEvenOdd.add(btnPlay2);
		
	}
	
}
