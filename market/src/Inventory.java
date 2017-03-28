import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inventory extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	
	Connection myConn;
	Statement st;
	ResultSet myRs;

	
	public static void main(String[] args) {
		
		try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "mysql");
			Statement st = myConn.createStatement();
			ResultSet myRs = st.executeQuery("select * from inventory");
			System.out.println("ID" + "\t" + "NAME" + "\t" + "PRICE" +"\t" + "QUANTITY");
			while(myRs.next()){
				System.out.println(myRs.getString("item_id")+"\t"+ myRs.getString("item_name") +"\t" + myRs.getString("price")+"\t"+ myRs.getString("quantity"));
			}
		}
		catch (Exception exc){
			exc.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
					//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
	public Inventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setBounds(22, 23, 77, 22);
		contentPane.add(lblProductName);
		
		textField = new JTextField();
		textField.setBounds(112, 24, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblProductId = new JLabel("Product id");
		lblProductId.setBounds(230, 27, 69, 18);
		contentPane.add(lblProductId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(309, 24, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(22, 76, 46, 14);
		contentPane.add(lblPrice);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(230, 76, 46, 14);
		contentPane.add(lblQuantity);
		
		textField_2 = new JTextField();
		textField_2.setBounds(112, 73, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(309, 73, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String aa = textField.getText();
				String bb = textField_1.getText();
				String cc = textField_2.getText();
				String dd = textField_3.getText();

				//String q ="insert into inventory values(\'";
				String t = "insert into inventory values(\"" +aa+"\",\""+bb+"\",\""+cc+"\",\""+dd+"\");";	
				//String t = q+aa+"\","+bb+",\""+cc+"\","+dd+"\")";
					try
						{
						int i = st.executeUpdate(t);
						}
						catch(Exception ax)
						{
						System.out.println(ax.toString());
						}

			}
		});
		btnAdd.setBounds(174, 118, 89, 23);
		contentPane.add(btnAdd);
		
		table = new JTable();
		table.setBounds(22, 167, 373, 148);
		contentPane.add(table);
	}
}
