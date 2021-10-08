package game_interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import game_logic.Hangman;

public class GameInterface {

	private JFrame frame;
	private Hangman hangman = new Hangman();
	
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
		frame.setBounds(100, 100, 700, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Jogo da Forca");
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 684, 486);
		frame.getContentPane().add(tabbedPane);
		
		JPanel theme = new JPanel();
		tabbedPane.addTab("Temas", null, theme, null);
		theme.setLayout(null);
		
		JLabel lblTitleTheme = new JLabel("Escolha o tema do jogo:");
		lblTitleTheme.setBounds(10, 11, 210, 14);
		theme.add(lblTitleTheme);
		
		JRadioButton rdbtnMovies = new JRadioButton("Filmes", true);
		rdbtnMovies.setBounds(10, 44, 99, 14);
		rdbtnMovies.setActionCommand("1");
		theme.add(rdbtnMovies);
		
		JRadioButton rdbtnAnimals = new JRadioButton("Animais");
		rdbtnAnimals.setBounds(10, 72, 99, 14);
		rdbtnAnimals.setActionCommand("2");
		theme.add(rdbtnAnimals);
		
		JRadioButton rdbtnFruits = new JRadioButton("Frutas");
		rdbtnFruits.setBounds(10, 100, 91, 14);
		rdbtnFruits.setActionCommand("3");
		theme.add(rdbtnFruits);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnMovies);
		buttonGroup.add(rdbtnAnimals);
		buttonGroup.add(rdbtnFruits);
		
		JPanel game = new JPanel();
		tabbedPane.addTab("Jogo", null, game, null);
		tabbedPane.setEnabledAt(1, false);
		game.setLayout(null);
		
		JLabel lblLetters = new JLabel("Número de letras: ");
		lblLetters.setBounds(10, 253, 108, 14);
		game.add(lblLetters);
		
		JLabel lblNumberOfLetters = new JLabel("0");
		lblNumberOfLetters.setBounds(115, 253, 32, 14);
		game.add(lblNumberOfLetters);
		
		JLabel lblWord = new JLabel("*Resposta*");
		lblWord.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblWord.setBounds(10, 278, 300, 38);
		game.add(lblWord);
		
		JTextField textLetter = new JTextField();
		textLetter.setBounds(50, 336, 68, 20);
		game.add(textLetter);
		textLetter.setColumns(10);
		
		JLabel lblLetter = new JLabel("Letra:");
		lblLetter.setBounds(10, 339, 42, 14);
		game.add(lblLetter);
		
		JLabel lblSteps = new JLabel("Quantidade de jogadas:");
		lblSteps.setBounds(10, 420, 133, 14);
		game.add(lblSteps);
		
		JLabel lblCountSteps = new JLabel("0");
		lblCountSteps.setBounds(149, 420, 46, 14);
		game.add(lblCountSteps);
		
		JLabel lblChosenTheme = new JLabel("Tema:");
		lblChosenTheme.setBounds(10, 223, 46, 14);
		game.add(lblChosenTheme);
		
		JLabel lblTheme = new JLabel("*Tema*");
		lblTheme.setBounds(50, 223, 97, 14);
		game.add(lblTheme);
		
		JLabel lblStatusGame = new JLabel("*Status*");
		lblStatusGame.setBounds(230, 11, 439, 14);
		game.add(lblStatusGame);
		
		JLabel lblImage = new JLabel("*Imagem*");
		lblImage.setBounds(10, 11, 200, 201);
		game.add(lblImage);
		
		JLabel lblUsedLettersTitle = new JLabel("Letras usadas:");
		lblUsedLettersTitle.setBounds(230, 47, 85, 14);
		game.add(lblUsedLettersTitle);
		
		JLabel lblUsedLetters = new JLabel("*Letras*");
		lblUsedLetters.setBounds(230, 72, 300, 14);
		game.add(lblUsedLetters);
		
		JButton btnStart = new JButton("Iniciar");
		JButton btnPlay = new JButton("Jogar");
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Theme tab
				startThemeInterface(tabbedPane, btnPlay);
				setGameTheme(buttonGroup, lblTheme);
				// Game tab
				hangman.start();
				startGameInterface(lblStatusGame,lblImage, lblCountSteps, lblWord, lblNumberOfLetters, lblUsedLetters);
			}
		});
		btnStart.setBounds(10, 130, 70, 23);
		theme.add(btnStart);
		
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					makePlay(textLetter, lblWord, lblCountSteps, lblImage, lblUsedLetters);
					updateGameStatus(lblStatusGame, btnPlay, textLetter, tabbedPane);
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Insira um caractere.");
				}
			}
		});
		btnPlay.setBounds(10, 377, 103, 23);
		game.add(btnPlay);
		
	}
	
	private String getNameTheme(String themeNumber) {
		String theme;
		if(Integer.parseInt(themeNumber) == 1) {
			theme = "Filmes";
		} else if(Integer.parseInt(themeNumber) == 2) {
			theme = "Animais";
		} else {
			theme = "Frutas";
		}
		return theme;
	}
	
	private void setGameTheme(ButtonGroup buttonGroup, JLabel label) {
		String myTheme = buttonGroup.getSelection().getActionCommand();
		label.setText(getNameTheme(myTheme));
		hangman.setSelectedTheme(Integer.parseInt(myTheme));
	}
	
	private void startThemeInterface(JTabbedPane tabbedPane, JButton button) {
		tabbedPane.setEnabledAt(1, true);
		tabbedPane.setEnabledAt(0, false);
		tabbedPane.setSelectedIndex(1);
		button.setEnabled(true);
	}
	
	private void startGameInterface(JLabel status, JLabel image, JLabel countSteps, JLabel word, JLabel numberOfLetters, JLabel usedLetters) {
		status.setText("Você está jogando.");
		image.setIcon(new ImageIcon("assets\\hangman_game_frame_1.png"));
		countSteps.setText(Integer.toString(hangman.getCountSteps()));
		word.setText(hangman.getUnderlineWord());
		numberOfLetters.setText(Integer.toString(hangman.getRaffledWord().length()));
		usedLetters.setText(hangman.getUsedLetters());
	}
	
	private void resetGameInterface(JButton button, JTextField textField, JTabbedPane tabbedPane) {
		button.setEnabled(false);
		tabbedPane.setEnabledAt(0, true);
		tabbedPane.setEnabledAt(1, false);
		textField.setText("");
	}
	
	private void makePlay(JTextField textField, JLabel word, JLabel countSteps, JLabel image, JLabel usedLetters) {
		char myLetter = textField.getText().toUpperCase().charAt(0);
		if(!hangman.haveThisLetter(Character.toString(myLetter))) {
			hangman.updateUnderlineWord(Character.toString(myLetter));
			word.setText(hangman.getUnderlineWord());
			countSteps.setText(Integer.toString(hangman.getCountSteps()));
			image.setIcon(getImageFrame(hangman.getCountLife()));
			usedLetters.setText(hangman.getUsedLetters());
		} else {
			JOptionPane.showMessageDialog(null, "Esta letra já foi usada!");
		}
	}
	
	private void updateGameStatus(JLabel status, JButton button, JTextField textField, JTabbedPane tabbedPane) {
		if(hangman.checkWin()) {
			status.setText("VOCÊ GANHOU!");
			resetGameInterface(button, textField, tabbedPane);
		} else if(hangman.checkLose()) {
			status.setText("VOCÊ PERDEU!");
			resetGameInterface(button, textField, tabbedPane);
		}
	}
	
	private ImageIcon getImageFrame(int countLife) {
		ImageIcon myFrame;
		if(countLife == 6) {
			myFrame = new ImageIcon("assets\\hangman_game_frame_1.png");
		} else if(countLife == 5) {
			myFrame = new ImageIcon("assets\\hangman_game_frame_2.png");
		} else if(countLife == 4) {
			myFrame = new ImageIcon("assets\\hangman_game_frame_3.png");
		} else if(countLife == 3) {
			myFrame = new ImageIcon("assets\\hangman_game_frame_4.png");
		} else if(countLife == 2) {
			myFrame = new ImageIcon("assets\\hangman_game_frame_5.png");
		} else if(countLife == 1) {
			myFrame = new ImageIcon("assets\\hangman_game_frame_6.png");
		} else {
			myFrame = new ImageIcon("assets\\hangman_game_frame_7.png");
		}
		return myFrame;
	}
}
