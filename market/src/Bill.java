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
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;

public class Bill extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	static int amount=0;
	private JTextField textField_4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	/*	try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "mysql");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from inventory;");
			System.out.println("ITEMID   " + "ITEMNAME  " + "PRICE  "+ "QUANTITY");
			while(myRs.next()){
				System.out.println(myRs.getString("item_id")+"\t"+ myRs.getString("item_name") +"\t" + myRs.getString("price")+"\t"+ myRs.getString("quantity"));
			}
		}
		catch (Exception exc){
			exc.printStackTrace();
		}
	*/	System.out.println("ITEMID   " + "ITEMNAME  " + "PRICE  "+ "QUANTITY");
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
		setBounds(100, 100, 538, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBillNo = new JLabel("Bill no");
		lblBillNo.setBounds(32, 34, 46, 14);
		contentPane.add(lblBillNo);
		
		textField = new JTextField();
		textField.setBounds(202, 31, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(202, 96, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a= textField_1.getText();
				String b = textField_3.getText(); 
				int g=Integer.valueOf(b);
				int h=0,p=0;
				int qf=0;
				String q=null;
				try
				{
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "mysql");
					Statement myStmt = myConn.createStatement();
					ResultSet rs = myStmt.executeQuery("select * from inventory;");
				
					while (rs.next())
					{
						if (rs.getString(1).equals(a) ){
							//i=i+rs.getInt(4);
							q=rs.getString(2);
							p=rs.getInt(3);
							h =rs.getInt(4);
							if(h<g){
								qf=1;
								System.out.println("NOT AVAILABLE");
								break;
							}
							amount+=g*p;
						}
						
					} 
				/*if(amount==0){
						System.out.println("Item not found\n");
					}
					else{
						 System.out.println("Amount: " + amount);
					}*/
					
				}
				catch(SQLException cx)
				{
					System.out.println(cx.toString());
				}
				int f=h-g;
				if(qf==0){
				System.out.println(a+"\t"+q+"\t"+p+"\t"+g);
				
				try
				{
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "mysql");
					Statement myStmt = myConn.createStatement();
					ResultSet myrs = myStmt.executeQuery("select * from inventory;");
					String t ="UPDATE inventory SET quantity = \"" +f+ "\"WHERE item_id =\"" + a+ "\";";
					int flag=0;
					while (myrs.next())
					{
						if (myrs.getString(1).equals(a)){
							
							 myStmt.executeUpdate(t);	
							 flag=1;
							 //System.out.println("Updated quantity!");
						
						}
					}
				}
						
					
					
					
				
			catch(SQLException cx)
				{
					//System.out.println(cx.toString()); 		 //exception problem
				}
				}
				
				
				
			
			}	
		});
		btnAdd.setBounds(202, 256, 89, 23);
		contentPane.add(btnAdd);
		
		JLabel lblCustomername = new JLabel("CustomerName");
		lblCustomername.setBounds(32, 92, 121, 28);
		contentPane.add(lblCustomername);
		
		JLabel lblNewLabel = new JLabel("Item id");
		lblNewLabel.setBounds(32, 175, 56, 16);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 172, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("quantity");
		lblNewLabel_1.setBounds(261, 178, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(361, 172, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String aa = textField.getText();
				String bb = textField_2.getText();
				String cc = textField_4.getText();
				
				String q1 = "insert into bill Values(\"";
				String t = q1 +aa+"\",\""+bb+"\",\""+cc+"\",\""+amount+"\");";
				try
				{
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "mysql");
					Statement myStmt = myConn.createStatement();
					 myStmt.executeUpdate(t);
				//	System.out.println("");
				}
				catch(Exception ax)
				{
					System.out.println(ax.toString());
				}
			
							
				System.out.println("TOTAL AMOUNT: "+amount);
			}
		});
		btnCreate.setBounds(202, 319, 97, 25);
		contentPane.add(btnCreate);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(317, 60, 56, 16);
		contentPane.add(lblDate);
		
		textField_4 = new JTextField();
		textField_4.setBounds(361, 57, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
