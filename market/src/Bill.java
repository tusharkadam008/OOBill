import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;

public class Bill extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "mysql");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from bill");
			System.out.println("BILL_NO" + "\t" + "USERNAME" + "\t" + "DATE" +"\t" + "AMOUNT");
			while(myRs.next()){
				System.out.println(myRs.getString("bill_no")+"\t"+ myRs.getString("username") +"\t" + myRs.getString("date")+"\t"+ myRs.getString("amount"));
			}
		}
		catch (Exception exc){
			exc.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill frame = new Bill();
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
	public Bill() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBillNo = new JLabel("Bill no");
		lblBillNo.setBounds(32, 34, 46, 14);
		contentPane.add(lblBillNo);
		
		textField = new JTextField();
		textField.setBounds(67, 31, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(185, 34, 67, 14);
		contentPane.add(lblUsername);
		
		textField_1 = new JTextField();
		textField_1.setBounds(262, 31, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(202, 96, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnChoose = new JButton("Choose");
		btnChoose.setBounds(37, 173, 89, 23);
		contentPane.add(btnChoose);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(202, 173, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnCreateBill = new JButton("Create Bill");
		btnCreateBill.setBounds(123, 207, 89, 23);
		contentPane.add(btnCreateBill);
		
		table = new JTable();
		table.setBounds(37, 288, 337, 81);
		contentPane.add(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(335, 78, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblCustomername = new JLabel("CustomerName");
		lblCustomername.setBounds(32, 92, 121, 28);
		contentPane.add(lblCustomername);
	}
}
