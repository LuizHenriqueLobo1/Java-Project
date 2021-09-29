package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import main.Pessoa;

public class Tela {
	
	private JFrame frame;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private Pessoa pessoa;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tela() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 295, 275);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Calculadora de IMC");

		JLabel labelPeso = new JLabel("Peso");
		labelPeso.setBounds(10, 29, 46, 14);
		frame.getContentPane().add(labelPeso);

		JLabel labelAltura = new JLabel("Altura");
		labelAltura.setBounds(10, 67, 46, 14);
		frame.getContentPane().add(labelAltura);

		txtPeso = new JTextField();
		txtPeso.setBounds(55, 26, 110, 20);
		frame.getContentPane().add(txtPeso);
		txtPeso.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(55, 64, 110, 20);
		frame.getContentPane().add(txtAltura);
		
		JLabel labelImc = new JLabel("IMC");
		labelImc.setBounds(10, 167, 46, 14);
		frame.getContentPane().add(labelImc);

		JLabel labelResultado = new JLabel("Resultado");
		labelResultado.setBounds(10, 204, 82, 14);
		frame.getContentPane().add(labelResultado);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double peso = Double.parseDouble(txtPeso.getText());
				double altura = Double.parseDouble(txtAltura.getText());
				pessoa = new Pessoa(peso, altura);
				String imc = pessoa.getIMC();
				labelImc.setText(imc);
				String resultado = pessoa.getResultado();
				labelResultado.setText(resultado);
			}
		});
		btnCalcular.setBounds(10, 114, 155, 23);
		frame.getContentPane().add(btnCalcular);

	}
	
}
