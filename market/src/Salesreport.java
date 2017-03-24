import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Salesreport extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salesreport frame = new Salesreport();
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
	public Salesreport() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterDateddmmyyyy = new JLabel("Enter Date(dd/mm/yyyy):");
		lblEnterDateddmmyyyy.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnterDateddmmyyyy.setBounds(12, 76, 239, 59);
		contentPane.add(lblEnterDateddmmyyyy);
		
		textField = new JTextField();
		textField.setBounds(256, 96, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnShowSales = new JButton("Show Sales");
		btnShowSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sales sales=new Sales();
				sales.setVisible(true);
			}
		});
		btnShowSales.setBounds(127, 142, 157, 25);
		contentPane.add(btnShowSales);
	}

}
