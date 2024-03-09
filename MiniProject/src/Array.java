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

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deleteposition;
	private JTextField insertposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 533);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 128, 0));
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArrayDS = new JLabel("ARRAY DATA STRUCTURE");
		lblArrayDS.setForeground(new Color(255, 0, 0));
		lblArrayDS.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblArrayDS.setBounds(373, 21, 311, 29);
		contentPane.add(lblArrayDS);
		
		JLabel lblArrayLength = new JLabel("ENTER ARRAY LENGTH");
		lblArrayLength.setForeground(new Color(0, 128, 64));
		lblArrayLength.setFont(new Font("Constantia", Font.BOLD, 18));
		lblArrayLength.setBounds(263, 92, 206, 35);
		contentPane.add(lblArrayLength);
		
		length = new JTextField();
		length.setBounds(494, 93, 211, 31);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btnCreateArray = new JButton("CREATE ARRAY");
		btnCreateArray.setForeground(new Color(0, 128, 64));
		btnCreateArray.setFont(new Font("Constantia", Font.BOLD, 18));
		btnCreateArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for creating Array
//				String len = length.getText();
//				int l = Integer.valueOf(len);
				int len = Integer.valueOf(length.getText());
				arr = new int[len];
				String message = "Array of length " + len + " Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnCreateArray.setBounds(388, 161, 180, 31);
		contentPane.add(btnCreateArray);
		
		JLabel lblInsertEle = new JLabel("INSERT AN INTEGER ELEMENT");
		lblInsertEle.setForeground(new Color(0, 128, 64));
		lblInsertEle.setFont(new Font("Constantia", Font.BOLD, 18));
		lblInsertEle.setBounds(134, 222, 276, 31);
		contentPane.add(lblInsertEle);
		
		element = new JTextField();
		element.setBounds(410, 222, 146, 30);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for insertion
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(insertposition.getText());
				arr[pos] = elem;
				String message = "Element " + elem + " inserted at position " + pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		insert.setForeground(new Color(0, 128, 64));
		insert.setFont(new Font("Constantia", Font.BOLD, 18));
		insert.setBounds(816, 222, 129, 31);
		contentPane.add(insert);
		
		JLabel lblDeletePos = new JLabel("DELETE POSITION");
		lblDeletePos.setForeground(new Color(0, 128, 64));
		lblDeletePos.setFont(new Font("Constantia", Font.BOLD, 18));
		lblDeletePos.setBounds(219, 287, 174, 35);
		contentPane.add(lblDeletePos);
		
		deleteposition = new JTextField();
		deleteposition.setBounds(397, 292, 245, 23);
		contentPane.add(deleteposition);
		deleteposition.setColumns(10);
		
		JLabel lblInsertPos = new JLabel("POSITION");
		lblInsertPos.setFont(new Font("Constantia", Font.BOLD, 18));
		lblInsertPos.setForeground(new Color(0, 128, 64));
		lblInsertPos.setBounds(588, 230, 117, 23);
		contentPane.add(lblInsertPos);
		
		insertposition = new JTextField();
		insertposition.setBounds(689, 226, 117, 26);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for deletion
				int pos = Integer.valueOf(deleteposition.getText());
				arr[pos] = 0;
				String message = "Element Deleted at position " + pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 18));
		delete.setForeground(new Color(0, 128, 64));
		delete.setBounds(677, 289, 129, 31);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for display
				String msg = "";
				for(int i=0; i<arr.length; i++) {
					msg = msg + " " + arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(0, 128, 64));
		display.setFont(new Font("Constantia", Font.BOLD, 18));
		display.setBounds(416, 332, 186, 31);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(220, 220, 220));
		displaybox.setForeground(new Color(255, 255, 255));
		displaybox.setBounds(91, 399, 823, 35);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
