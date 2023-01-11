

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class WinViewer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinViewer frame = new WinViewer();
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
	public WinViewer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(WinViewer.class.getResource("/images/exit.PNG")));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setBounds(12, 74, 200, 300);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("");
		lblNewLabel2.setIcon(new ImageIcon(WinViewer.class.getResource("/images/pic3.gif")));
		lblNewLabel2.setOpaque(true);
		lblNewLabel2.setBackground(new Color(255, 128, 0));
		lblNewLabel2.setBounds(227, 10, 206, 485);
		contentPane.add(lblNewLabel2);
		
		JButton btnNewButton = new JButton("Exit \uADF8\uB9BC\uBCF4\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("그림파일", "jpg", "png", "gif");
				chooser.setFileFilter(filter);
				int ret = chooser.showOpenDialog(contentPane);
				if(ret == JFileChooser.APPROVE_OPTION) {
				String path = chooser.getSelectedFile().getPath();
				ImageIcon image = new ImageIcon(path);
				Image pic = image.getImage();
				pic = pic.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
				ImageIcon img = new ImageIcon(pic);
				lblNewLabel.setIcon(img);
				
//				ImageIcon image = new ImageIcon("src/images/pic3.png");
//				lblNewLabel.setIcon(image);
				}	 
			}
		});
		btnNewButton.setBounds(445, 165, 114, 47);
		contentPane.add(btnNewButton);
	}
}
