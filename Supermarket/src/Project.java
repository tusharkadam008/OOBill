import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Project {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project window = new Project();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 538, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_44836373928297");
		panel.setLayout(null);
		
		JLabel lblSupermarketBillingSystem = new JLabel("SUPERMARKET BILLING SYSTEM");
		lblSupermarketBillingSystem.setBounds(116, 5, 288, 25);
		lblSupermarketBillingSystem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblSupermarketBillingSystem);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Admin admin=new Admin();
				admin.setVisible(true);
				
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAdminLogin.setBounds(78, 106, 162, 40);
		panel.add(btnAdminLogin);
		
		JButton btnUserLogin = new JButton("Staff Login");
		btnUserLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Staff staff=new Staff();
				staff.setVisible(true);	
			}
		});
		btnUserLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnUserLogin.setBounds(303, 106, 157, 40);
		panel.add(btnUserLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(166, 225, 94, 25);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(166, 263, 94, 28);
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(292, 225, 133, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(292, 267, 133, 22);
		panel.add(passwordField);
	}
}
