import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Changepwd extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Changepwd frame = new Changepwd();
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
	public Changepwd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(63, 34, 93, 14);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(205, 31, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCurrentpassword = new JLabel("CurrentPassword");
		lblCurrentpassword.setBounds(63, 84, 135, 14);
		contentPane.add(lblCurrentpassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 81, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewpassword = new JLabel("NewPassword");
		lblNewpassword.setBounds(63, 133, 93, 14);
		contentPane.add(lblNewpassword);
		
		textField_2 = new JTextField();
		textField_2.setBounds(205, 130, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(143, 202, 89, 23);
		contentPane.add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(268, 202, 89, 23);
		contentPane.add(btnBack);
	}

}
