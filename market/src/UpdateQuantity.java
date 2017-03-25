import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UpdateQuantity extends JFrame {

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
					UpdateQuantity frame = new UpdateQuantity();
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
	public UpdateQuantity() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProductName = new JLabel("Product name");
		lblProductName.setBounds(29, 11, 71, 14);
		contentPane.add(lblProductName);
		
		JLabel lblProductId = new JLabel("Product id");
		lblProductId.setBounds(250, 11, 63, 14);
		contentPane.add(lblProductId);
		
		textField = new JTextField();
		textField.setBounds(143, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(323, 8, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnChoose = new JButton("Choose");
		btnChoose.setBounds(179, 61, 89, 23);
		contentPane.add(btnChoose);
		
		JLabel lblUpdateQuantity = new JLabel("Update Quantity");
		lblUpdateQuantity.setBounds(29, 137, 104, 14);
		contentPane.add(lblUpdateQuantity);
		
		textField_2 = new JTextField();
		textField_2.setBounds(143, 134, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(179, 182, 89, 23);
		contentPane.add(btnUpdate);
	}

}
