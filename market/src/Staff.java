import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Staff extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff frame = new Staff();
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
	public Staff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 433);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("");
		menuBar.add(menu);
		
		JMenu mnBilling = new JMenu("Billing");
		menuBar.add(mnBilling);
		
		JMenuItem mntmCreateBill = new JMenuItem("Create Bill");
		mntmCreateBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bill bl=new Bill();
				bl.setVisible(true);
			}
		});
		mnBilling.add(mntmCreateBill);
		
		JMenuItem mntmViewBill = new JMenuItem("View Bill");
		mntmViewBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				managingBill mngbill =new managingBill();
				mngbill.setVisible(true);
			}
		});
		mnBilling.add(mntmViewBill);
		
		JMenu mnLogout = new JMenu("Logout");
		menuBar.add(mnLogout);
		
		JMenuItem mntmChangePassword = new JMenuItem("Change Password");
		mntmChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changepwd cpwd=new Changepwd();
				cpwd.setVisible(true);
			}
		});
		mnLogout.add(mntmChangePassword);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Logout lgt=new Logout();
				lgt.setVisible(true);
			}
		});
		mnLogout.add(mntmLogout);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
	}
}
