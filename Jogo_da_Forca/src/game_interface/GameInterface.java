package game_interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import game_logic.Hangman;

public class GameInterface {

	private JFrame frame;

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
		
		Hangman hangman = new Hangman();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 684, 486);
		frame.getContentPane().add(tabbedPane);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
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
		buttonGroup.add(rdbtnMovies);
		buttonGroup.add(rdbtnAnimals);
		buttonGroup.add(rdbtnFruits);
		
		JPanel game = new JPanel();
		tabbedPane.addTab("Jogo", null, game, null);
		tabbedPane.setEnabledAt(1, false);
		game.setLayout(null);
		
		JLabel lblLetters = new JLabel("Número de letras: ");
		lblLetters.setBounds(10, 173, 108, 14);
		game.add(lblLetters);
		
		JLabel lblNumberOfLetters = new JLabel("0");
		lblNumberOfLetters.setBounds(115, 173, 32, 14);
		game.add(lblNumberOfLetters);
		
		JLabel lblWord = new JLabel("Palavra");
		lblWord.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblWord.setBounds(10, 198, 200, 38);
		game.add(lblWord);
		
		JTextField textLetter = new JTextField();
		textLetter.setBounds(45, 262, 68, 20);
		game.add(textLetter);
		textLetter.setColumns(10);
		
		JLabel lblLetter = new JLabel("Letra:");
		lblLetter.setBounds(10, 265, 42, 14);
		game.add(lblLetter);
		
		JLabel lblSteps = new JLabel("Quantidade de jogadas:");
		lblSteps.setBounds(10, 379, 133, 14);
		game.add(lblSteps);
		
		JLabel lblCountSteps = new JLabel("0");
		lblCountSteps.setBounds(149, 379, 46, 14);
		game.add(lblCountSteps);
		
		JButton btnStart = new JButton("Iniciar");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setEnabledAt(1, true);
				tabbedPane.setEnabledAt(0, false);
				tabbedPane.setSelectedIndex(1);
				
				String myTheme = buttonGroup.getSelection().getActionCommand();
				hangman.setSelectedTheme(Integer.parseInt(myTheme));
				hangman.setRaffledWord();
				String word = hangman.getRaffledWord();
				System.out.println(word);
				hangman.setUnderlineWord();
				lblWord.setText(hangman.getUnderlineWord());
				lblNumberOfLetters.setText(Integer.toString(hangman.getRaffledWord().length()));
			}
		});
		btnStart.setBounds(10, 130, 70, 23);
		theme.add(btnStart);
		
		JButton btnPlay = new JButton("Jogar");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					char myLetter = textLetter.getText().charAt(0);
					hangman.updateUnderlineWord(Character.toString(myLetter));
					lblWord.setText(hangman.getUnderlineWord());
					lblCountSteps.setText(Integer.toString(hangman.getCountSteps()));
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Insira um caractere.");
				}
				
			}
		});
		btnPlay.setBounds(10, 314, 103, 23);
		game.add(btnPlay);
		
	}
	
}
