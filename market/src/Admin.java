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
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				Removeuser removeuser=new Removeuser();
				removeuser.setVisible(true);
			}
		});
		mnNewUser.add(mntmRemoveUser);
		
		JMenu mnManagebills = new JMenu("Manage Bills");
		menuBar.add(mnManagebills);
		
		JMenu mnInventory = new JMenu("Inventory");
		menuBar.add(mnInventory);
		
		JMenuItem mntmUpdate = new JMenuItem("Update");
		mntmUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory inventory=new Inventory();
				inventory.setVisible(true);
			}
		});
		mnInventory.add(mntmUpdate);
		
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
		
		JMenu mnLogout = new JMenu("Logout");
		menuBar.add(mnLogout);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.dispose();
				//Project p1=new Project();
				//p1.setVisible(true);
			}
		});
		mnLogout.add(mntmLogout);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
