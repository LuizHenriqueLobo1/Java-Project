package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class AbsencesCount {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbsencesCount window = new AbsencesCount();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AbsencesCount() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Marcação de Faltas");
		
		JLabel lblNewLabel = new JLabel("Número");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 8, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 48, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 45, 182, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Regime");
		lblNewLabel_2.setBounds(10, 86, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Diurno");
		rdbtnNewRadioButton.setBounds(66, 82, 65, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Noturno");
		rdbtnNewRadioButton_1.setBounds(133, 82, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Número de Faltas");
		lblNewLabel_3.setBounds(10, 126, 121, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(133, 123, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnPrimeiro = new JButton("Primeiro");
		btnPrimeiro.setBounds(10, 186, 77, 23);
		frame.getContentPane().add(btnPrimeiro);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(97, 186, 77, 23);
		frame.getContentPane().add(btnAnterior);
		
		JButton btnSeguinte = new JButton("Seguinte");
		btnSeguinte.setBounds(184, 186, 77, 23);
		frame.getContentPane().add(btnSeguinte);
		
		JButton btnUltimo = new JButton("Ultimo");
		btnUltimo.setBounds(271, 186, 77, 23);
		frame.getContentPane().add(btnUltimo);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(358, 186, 77, 23);
		frame.getContentPane().add(btnNovo);
	}
	
}
