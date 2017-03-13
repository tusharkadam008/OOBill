import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Adduser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adduser frame = new Adduser();
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
	public Adduser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 520, 441);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("Username");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(131, 113, 94, 25);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Password");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(131, 176, 94, 28);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(276, 113, 133, 24);
		panel.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(276, 180, 133, 22);
		panel.add(passwordField);
		
		JButton btnAddUser = new JButton("Add User");
		btnAddUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAddUser.setBounds(203, 293, 112, 35);
		panel.add(btnAddUser);
	}

}
