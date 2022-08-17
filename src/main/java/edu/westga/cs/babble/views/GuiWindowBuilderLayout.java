package edu.westga.cs.babble.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;

public class GuiWindowBuilderLayout extends JFrame {

	protected JPanel contentPane;
	protected JTextField textField;
	protected JButton btnNewButton;
	protected JButton btnNewButton_1;
	protected JTextField textField_1;
	protected JLabel lblNewLabel;
	protected JTextField textField_2;
	protected JLabel lblNewLabel_1;
	protected JLabel lblNewLabel_2;
	protected JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiWindowBuilderLayout frame = new GuiWindowBuilderLayout();
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
	public GuiWindowBuilderLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		
		this.textField = new JTextField();
		this.textField.setBounds(39, 102, 343, 19);
		this.contentPane.add(this.textField);
		this.textField.setColumns(10);
		
		this.btnNewButton = new JButton("Reset");
		this.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		this.btnNewButton.setBounds(149, 131, 114, 21);
		this.contentPane.add(this.btnNewButton);
		
		this.btnNewButton_1 = new JButton("Play Word");
		this.btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		this.btnNewButton_1.setBounds(273, 131, 109, 21);
		this.contentPane.add(this.btnNewButton_1);
		
		this.textField_1 = new JTextField();
		this.textField_1.setBounds(262, 176, 120, 19);
		this.contentPane.add(this.textField_1);
		this.textField_1.setColumns(10);
		
		this.lblNewLabel = new JLabel("Score:");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lblNewLabel.setBounds(218, 177, 45, 18);
		this.contentPane.add(this.lblNewLabel);
		
		this.textField_2 = new JTextField();
		this.textField_2.setBounds(39, 218, 343, 19);
		this.contentPane.add(this.textField_2);
		this.textField_2.setColumns(10);
		
		this.lblNewLabel_1 = new JLabel("Your Word");
		this.lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lblNewLabel_1.setBounds(39, 73, 85, 19);
		this.contentPane.add(this.lblNewLabel_1);
		
		this.lblNewLabel_2 = new JLabel("Tiles");
		this.lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lblNewLabel_2.setBounds(39, 10, 45, 13);
		this.contentPane.add(this.lblNewLabel_2);
		
		this.list = new JList();
		this.list.setBounds(39, 33, 343, 30);
		this.contentPane.add(this.list);
	}
}
