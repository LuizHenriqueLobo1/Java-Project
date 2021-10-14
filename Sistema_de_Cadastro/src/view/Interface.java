package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import main.*;
import javax.swing.JList;

public class Interface {

	private JFrame frame;
	private JTextField textName;
	private JTextField textAge;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interface() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Sistema de Cadastro");
		
		Form form = new Form();
		
		JLabel lblTitle = new JLabel("Preencha o formulário:");
		lblTitle.setBounds(10, 11, 132, 14);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblName = new JLabel("Nome:");
		lblName.setBounds(10, 50, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblAge = new JLabel("Idade:");
		lblAge.setBounds(10, 90, 46, 14);
		frame.getContentPane().add(lblAge);
		
		JLabel lblGender = new JLabel("Sexo:");
		lblGender.setBounds(10, 130, 46, 14);
		frame.getContentPane().add(lblGender);
		
		textName = new JTextField();
		textName.setBounds(52, 47, 140, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setBounds(52, 87, 46, 20);
		frame.getContentPane().add(textAge);
		textAge.setColumns(10);
		
		JRadioButton rdbtnMale = new JRadioButton("Masculino");
		rdbtnMale.setBounds(52, 126, 109, 23);
		rdbtnMale.setSelected(true);
		rdbtnMale.setActionCommand("M");
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Feminino");
		rdbtnFemale.setBounds(52, 151, 109, 23);
		rdbtnFemale.setActionCommand("F");
		frame.getContentPane().add(rdbtnFemale);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnMale);
		buttonGroup.add(rdbtnFemale);
		
		JLabel lblList = new JLabel("Lista de Pessoas:");
		lblList.setBounds(10, 256, 114, 14);
		frame.getContentPane().add(lblList);
		
		JLabel lblNumberOfPeoples = new JLabel("Número de Pessoas:");
		lblNumberOfPeoples.setBounds(268, 256, 120, 14);
		frame.getContentPane().add(lblNumberOfPeoples);
		
		JLabel lblCountPeoples = new JLabel("0");
		lblCountPeoples.setBounds(394, 256, 30, 14);
		frame.getContentPane().add(lblCountPeoples);
		
		JList<String> list = new JList<>();
		list.setBounds(10, 281, 414, 219);
		frame.getContentPane().add(list);
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
		list.setModel(listModel);
		
		JButton btnRegister = new JButton("Cadastrar");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				People people = new People();
				people.setName(textName.getText());
				people.setAge(Integer.parseInt(textAge.getText()));
				people.setGender(buttonGroup.getSelection().getActionCommand().charAt(0));
				form.registerPeople(people);
				listModel.addElement(form.getLastPeople());
				lblCountPeoples.setText(Integer.toString(form.getNumberOfPeoples()));
			}
		});
		btnRegister.setBounds(42, 196, 100, 23);
		frame.getContentPane().add(btnRegister);
		
	}

}
