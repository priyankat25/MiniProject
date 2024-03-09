import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 539);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(144, 238, 144));
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStackDS = new JLabel("STACK DATA STRUCTURE");
		lblStackDS.setForeground(new Color(255, 0, 0));
		lblStackDS.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblStackDS.setBounds(350, 25, 371, 28);
		contentPane.add(lblStackDS);
		
		JLabel lblStackSize = new JLabel("ENTER THE STACK SIZE:");
		lblStackSize.setForeground(new Color(255, 0, 0));
		lblStackSize.setFont(new Font("Constantia", Font.BOLD, 18));
		lblStackSize.setBounds(275, 97, 229, 25);
		contentPane.add(lblStackSize);
		
		sizefield = new JTextField();
		sizefield.setBounds(514, 95, 262, 28);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton btnCreateStack = new JButton("CREATE STACK");
		btnCreateStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for creating stack
				size = Integer.valueOf(sizefield.getText());
				s = new int[size];
				String message = "Stack of size " + size + " Created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		btnCreateStack.setFont(new Font("Constantia", Font.BOLD, 18));
		btnCreateStack.setForeground(new Color(255, 0, 0));
		btnCreateStack.setBounds(406, 153, 195, 40);
		contentPane.add(btnCreateStack);
		
		JLabel lblEntetEle = new JLabel("ENTER AN ELEMENT:");
		lblEntetEle.setForeground(new Color(255, 0, 0));
		lblEntetEle.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEntetEle.setBounds(182, 224, 208, 34);
		contentPane.add(lblEntetEle);
		
		element = new JTextField();
		element.setBounds(385, 224, 229, 32);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for push
				int elem;
				if(top==size-1) {
					JOptionPane.showMessageDialog(contentPane, "PUSH not Possible");
				}
				else {
					elem = Integer.valueOf(element.getText());
					++top;
					s[top] = elem;
					JOptionPane.showMessageDialog(contentPane, "PUSH Successful");
					element.setText("");
				}
			}
		});
		push.setForeground(new Color(255, 0, 0));
		push.setFont(new Font("Constantia", Font.BOLD, 18));
		push.setBounds(655, 224, 109, 34);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for pop
				if(top == -1) {
					JOptionPane.showMessageDialog(contentPane, "POP not possible");
				}
				else {
					String message = "Element deleted is: " + s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
			}
		});
		pop.setForeground(new Color(255, 0, 0));
		pop.setFont(new Font("Constantia", Font.BOLD, 18));
		pop.setBounds(466, 280, 109, 34);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for display elements
				String message ="";
				if(top == -1) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				for(int i=top; i>=0; i--) {
					message = message + " " + s[i];
				}
				displaybox.setText(message);
			}
		});
		display.setForeground(Color.RED);
		display.setFont(new Font("Constantia", Font.BOLD, 18));
		display.setBounds(454, 350, 147, 34);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(211, 211, 211));
		displaybox.setColumns(10);
		displaybox.setBounds(131, 425, 796, 32);
		contentPane.add(displaybox);
	}
}
