import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Removeuser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "mysql");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from staff");
			System.out.println("ID" + "\t" + "NAME");
			while(myRs.next()){
				System.out.println(myRs.getString("id")+"\t"+ myRs.getString("name"));
			}
		}
		catch (Exception exc){
			exc.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Removeuser frame = new Removeuser();
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
	public Removeuser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 520, 441);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Username");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(131, 113, 94, 25);
		panel.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(276, 113, 133, 24);
		panel.add(textField);
		
		JButton btnRemoveUser = new JButton("Remove User");
		btnRemoveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String q2 = "delete from staff where id=";
				String bb=textField.getText();
				String t=q2+bb;
				try{
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "mysql");
					Statement myStmt = myConn.createStatement();
					int j=myStmt.executeUpdate(t);
				}
				catch(Exception bx){
					System.out.println(bx.toString());
				}
			}
		});
		btnRemoveUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRemoveUser.setBounds(197, 293, 133, 35);
		panel.add(btnRemoveUser);
	}

}
