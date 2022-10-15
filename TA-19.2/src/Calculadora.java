import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	double num1;
	double num2;
	double resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inserte un numero");
		lblNewLabel.setBounds(51, 32, 103, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Inserte un numero");
		lblNewLabel_1.setBounds(214, 32, 103, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(61, 57, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(224, 57, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(89, 231, 65, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(180, 228, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				num2 = Double.parseDouble(textField_1.getText());
				
				resultado = num1 + num2;
				
				textField_2.setText(String.valueOf(resultado));
				
			}
		});
		btnNewButton.setBounds(51, 105, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				num2 = Double.parseDouble(textField_1.getText());
				
				resultado = num1 - num2;
				
				textField_2.setText(String.valueOf(resultado));
				
			}
		});
		btnNewButton_1.setBounds(214, 105, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("/");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				num2 = Double.parseDouble(textField_1.getText());
				
				resultado = num1 / num2;
				
				textField_2.setText(String.valueOf(resultado));
				
			}
		});
		btnNewButton_2.setBounds(51, 159, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("*");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				num2 = Double.parseDouble(textField_1.getText());
				
				resultado = num1 * num2;
				
				textField_2.setText(String.valueOf(resultado));
				
			}
		});
		btnNewButton_3.setBounds(214, 159, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(303, 261, 89, 23);
		contentPane.add(btnNewButton_4);
	}
}
