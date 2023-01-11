import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temp extends JFrame {

	private JPanel contentPane;
	private JTextField fahTextField;
	private JTextField celTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temp frame = new Temp();
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
	public Temp() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton changeButton = new JButton("\uBCC0\uD658");
		changeButton.setBounds(171, 110, 97, 23);
		contentPane.add(changeButton);
		
		JLabel celLabel = new JLabel("\uC12D\uC528:");
		celLabel.setBounds(116, 159, 57, 15);
		contentPane.add(celLabel);
		
		fahTextField = new JTextField();
		fahTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fah = Double.parseDouble(fahTextField.getText());
				double cel = Math.round((fah-32)/1.8);
				changeButton.setText(cel + " ");
			}
		});
		fahTextField.setBounds(171, 65, 116, 21);
		contentPane.add(fahTextField);
		fahTextField.setColumns(10);
		
		celTextField = new JTextField();
		celTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cel = Double.parseDouble(fahTextField.getText());
				double fah = Math.round(cel * 9.0/5.0 + 32);
				changeButton.setText(fah + " ");
			}
		});
				
		celTextField.setBounds(171, 156, 116, 21);
		contentPane.add(celTextField);
		celTextField.setColumns(10);
		
		JLabel fahLabel = new JLabel("\uD654\uC528:");
		fahLabel.setBounds(116, 68, 57, 15);
		contentPane.add(fahLabel);
		

	}
}
