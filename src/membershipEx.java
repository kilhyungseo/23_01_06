import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class membershipEx extends JFrame {

	public JPanel contentPane;
	public JTextField nameField;
	public JTextField idField;
	public JTextField pwField;
	public JTextField pw2Field;
	public JTextField birthField;
	public JTextField phoneField;
	public JTextField emailField;
	public JButton overlapButton;
	public JButton JoinButton;
	public JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					membershipEx frame = new membershipEx();
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
	public membershipEx() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("\uC774\uB984 : ");
		nameLabel.setBounds(81, 55, 57, 15);
		contentPane.add(nameLabel);
		
		JLabel idLabel = new JLabel("ID : ");
		idLabel.setBounds(93, 97, 57, 15);
		contentPane.add(idLabel);
		
		JLabel pwLabel = new JLabel("PW : ");
		pwLabel.setBounds(93, 136, 57, 15);
		contentPane.add(pwLabel);
		
		JLabel pw2Label = new JLabel("PW2 : ");
		pw2Label.setBounds(93, 180, 57, 15);
		contentPane.add(pw2Label);
		
		JLabel birthLabel = new JLabel("\uC0DD\uB144\uC6D4\uC77C : ");
		birthLabel.setBounds(69, 219, 69, 15);
		contentPane.add(birthLabel);
		
		JLabel phoneLabel = new JLabel("\uC804\uD654\uBC88\uD638 : ");
		phoneLabel.setBounds(69, 260, 69, 15);
		contentPane.add(phoneLabel);
		
		JLabel emailLabel = new JLabel("\uC774\uBA54\uC77C : ");
		emailLabel.setBounds(81, 296, 57, 15);
		contentPane.add(emailLabel);
		
		nameField = new JTextField();
		nameField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					idField.requestFocus();
				}
			}
		});
		nameField.setBounds(162, 49, 116, 21);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		idField = new JTextField();
		idField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					pwField.requestFocus();
				}
			}
		});
		idField.setColumns(10);
		idField.setBounds(162, 94, 116, 21);
		contentPane.add(idField);
		
		pwField = new JTextField();
		pwField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					pw2Field.requestFocus();
				}
				
			}
		});
		pwField.setColumns(10);
		pwField.setBounds(162, 133, 116, 21);
		contentPane.add(pwField);
		
		pw2Field = new JTextField();
		pw2Field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equalsIgnoreCase(pw2Field.getText())) {
					addKeyListener();
				}
			}

			private void addKeyListener() {
				pw2Field.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if(e.getKeyCode() == KeyEvent.VK_ENTER) {
							birthField.requestFocus();
						}else {
							JOptionPane.showMessageDialog(contentPane, "암호가 일치하지 않습니다", "Message", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				
			}
		});
		
		pw2Field.setColumns(10);
		pw2Field.setBounds(162, 177, 116, 21);
		contentPane.add(pw2Field);
		
		birthField = new JTextField();
		birthField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					phoneField.requestFocus();
				}
			}
		});
		birthField.setColumns(10);
		birthField.setBounds(162, 216, 116, 21);
		contentPane.add(birthField);
		
		phoneField = new JTextField();
		phoneField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					emailField.requestFocus();
				}
			}
		});
		phoneField.setColumns(10);
		phoneField.setBounds(162, 254, 116, 21);
		contentPane.add(phoneField);
		
		emailField = new JTextField();
		emailField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					JoinButton.requestFocus();
				}
			}
		});
		emailField.setColumns(10);
		emailField.setBounds(162, 290, 116, 21);
		contentPane.add(emailField);
		
		overlapButton = new JButton("\uC911\uBCF5\uD655\uC778");
		overlapButton.setBounds(302, 93, 97, 23);
		contentPane.add(overlapButton);
		
		JoinButton = new JButton("\uAC00\uC785");
		JoinButton.setBounds(102, 356, 97, 23);
		contentPane.add(JoinButton);
		
		cancelButton = new JButton("\uCDE8\uC18C");
		cancelButton.setBounds(229, 356, 97, 23);
		contentPane.add(cancelButton);
	}

}
