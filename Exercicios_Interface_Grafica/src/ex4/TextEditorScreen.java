package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class TextEditorScreen {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextEditorScreen window = new TextEditorScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TextEditorScreen() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Editor de Texto");
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 414, 210);
		frame.getContentPane().add(textArea);
		
		ManipulateFile manipulateFile = new ManipulateFile();
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				textArea.setText(manipulateFile.load(getPath(btnLoad)));
			}
		});
		btnLoad.setBounds(126, 232, 89, 23);
		frame.getContentPane().add(btnLoad);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manipulateFile.save(textArea.getText(), getPath(btnSave));
			}
		});
		btnSave.setBounds(225, 232, 89, 23);
		frame.getContentPane().add(btnSave);
		
	}
	
	public static String getPath(JButton button) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(button);
		File filePath = fileChooser.getSelectedFile();
		return filePath.toString();
	}
	
}
