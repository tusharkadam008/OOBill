import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JFrame admin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 826, 628);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewUser = new JMenu("New User");
		menuBar.add(mnNewUser);
		
		JMenuItem mntmAddUser = new JMenuItem("Add user");
		mntmAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adduser adduser=new Adduser();
				adduser.setVisible(true);
			}
		});
		mnNewUser.add(mntmAddUser);
		
		JMenuItem mntmRemoveUser = new JMenuItem("Remove User");
		mntmRemoveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<100; i++){
					System.out.println();
				}
				Removeuser removeuser=new Removeuser();
				removeuser.setVisible(true);
			}
		});
		mnNewUser.add(mntmRemoveUser);
		
		JMenu mnManagebills = new JMenu("Manage Bills");
		menuBar.add(mnManagebills);
		
		JMenuItem mntmManagebills = new JMenuItem("Managebills");
		mntmManagebills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					for(int i=0; i<10; i++)
						System.out.println();
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "mysql");
					Statement myStmt = myConn.createStatement();
					ResultSet myRs = myStmt.executeQuery("select * from bill");
					System.out.println("NO." + "\t" + "NAME"+ "\t" +"DATE"+ "\t\t\t" +"AMT");
					System.out.println();
					while(myRs.next()){
						System.out.println(myRs.getString("bill_no")+"\t"+ myRs.getString("username")+"\t"+ myRs.getString("date")+"\t"+"\t"+ myRs.getString("amount"));
					}
				}
				catch (Exception exc){
					exc.printStackTrace();
				}
				
			//	Managebills managebills=new Managebills();
			//	managebills.setVisible(true);
			}
		});
		mnManagebills.add(mntmManagebills);
		
		JMenu mnInventory = new JMenu("Inventory");
		menuBar.add(mnInventory);
		
		JMenuItem mntmAddItem = new JMenuItem("Add item");
		mntmAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory invntry=new Inventory();
				invntry.setVisible(true);
				
			}
		});
		mnInventory.add(mntmAddItem);
		
		JMenuItem mntmUpdateQuantity = new JMenuItem("Update quantity");
		mntmUpdateQuantity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdateQuantity upqnty =new UpdateQuantity();
				upqnty.setVisible(true);
			}
		});
		mnInventory.add(mntmUpdateQuantity);
		
		JMenu mnSalesReport = new JMenu("Sales Report");
		menuBar.add(mnSalesReport);
		
		JMenuItem mntmCheckReport = new JMenuItem("Check Report");
		mntmCheckReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salesreport salesreport =new Salesreport();
				salesreport.setVisible(true);
			}
		});
		mnSalesReport.add(mntmCheckReport);
		
		JMenu mnTax = new JMenu("TAX");
		menuBar.add(mnTax);
		
		JMenuItem mntmChangeTax = new JMenuItem("Change Tax");
		mntmChangeTax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tax tax=new Tax();
				tax.setVisible(true);
			}
		});
		mnTax.add(mntmChangeTax);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
