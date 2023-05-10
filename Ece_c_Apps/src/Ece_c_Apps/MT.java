package Ece_c_Apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MT {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MT window = new MT();
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
	public MT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(220, 20, 60));
		frame.setBounds(100, 100, 717, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK MY SHOW");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(265, 42, 194, 25);
		lblNewLabel.setBackground(new Color(220, 20, 60));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(118, 139, 83, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(265, 137, 160, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(118, 218, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Oppenheimer", "Inception", "Interstellar", "Dunkirk"}));
		c1.setBounds(265, 215, 160, 22);
		frame.getContentPane().add(c1);
		
		JLabel lblNewLabel_3 = new JLabel("TICKETS");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(118, 305, 68, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5"}));
		c2.setBounds(265, 305, 160, 22);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = t1.getText();
				String movie =(String) c1.getSelectedItem();
				String t =(String) c2.getSelectedItem();
				int tickets = Integer.parseInt(t);
				int bill =0;
				if(movie.equals("Oppenheimer"))
				{
					bill=400*tickets;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+" \n Selected Movie: "+movie+"\n Tickets: "+t+"\n Total bill: "+bill);
				}
				else if(movie.equals("Inception"))
				{
					bill=300*tickets;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+" \n Selected Movie: "+movie+"\n Tickets: "+t+"\n Total bill: "+bill);
					
				}
				else if(movie.equals("Interstellar"))
				{
					bill=450*tickets;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+" \n Selected Movie: "+movie+"\n Tickets: "+t+"\n Total bill: "+bill);
					
				}
				else if(movie.equals("Dunkirk"))
				{
					bill=200*tickets;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+" \n Selected Movie: "+movie+"\n Tickets: "+t+"\n Total bill: "+bill);
					
				}
				else if(movie.equals("The Prestige"))
				{
					bill=250*tickets;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+" \nSelected Movie: "+movie+"\n Tickets: "+t+"\n Total bill: "+bill);
					
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid movie name");
				}
					
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(321, 387, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
