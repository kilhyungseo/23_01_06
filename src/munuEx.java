import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.Color;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.ImageIcon;

public class munuEx extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private JMenuItem mntmNewMenuItem_2;
	/**
	 * @wbp.nonvisual location=131,499
	 */
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					munuEx frame = new munuEx();
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
	public munuEx() {
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();

		contentPane.setBackground(new Color(0, 255, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setPreferredSize(new Dimension(0, 5));
		menuBar.setBounds(0, 0, 434, 37);
		contentPane.add(menuBar);
		
		JMenu fileMenu = new JMenu("\uD30C\uC77C");
		fileMenu.setIcon(null);
		fileMenu.setMnemonic('f');
		fileMenu.setPreferredSize(new Dimension(175, 100));
		menuBar.add(fileMenu);
		
		
		JMenu mntmNewMenu = new JMenu("open");
		mntmNewMenu.setIcon(new ImageIcon(munuEx.class.getResource("/images/open.png")));
		mntmNewMenu.setMnemonic('p');
		

		mntmNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				
			}
		});
		mntmNewMenu.setPreferredSize(new Dimension(100, 40));
		fileMenu.add(mntmNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\uC800\uC7A5");
		mntmNewMenuItem_1.setIcon(new ImageIcon(munuEx.class.getResource("/images/save.png")));
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.showSaveDialog(fileMenu);
			}
		});
		
		JMenu mnNewMenu_4 = new JMenu("New menu");
		fileMenu.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem_5);
		fileMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("\uCDE8\uC18C");
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_2.setSize(new Dimension(5, 5));
		fileMenu.add(mntmNewMenuItem_2);
		
		JSeparator separator = new JSeparator();
		fileMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\uB2EB\uAE30");
		mntmNewMenuItem_3.setIcon(new ImageIcon(munuEx.class.getResource("/images/[\uD06C\uAE30\uBCC0\uD658]exit.PNG")));
		mntmNewMenuItem_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		fileMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu = new JMenu("\uC708\uB3C4\uC6B0\uC5F4\uAE30");
		mnNewMenu.setPreferredSize(new Dimension(100, 26));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("BMI\uCE21\uC815");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WinBMI winbmi = new WinBMI();
				winbmi.setVisible(true);
			}
		});
		mntmNewMenuItem_4.setIcon(new ImageIcon(munuEx.class.getResource("/images/[\uD06C\uAE30\uBCC0\uD658]BMI.PNG")));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem sdf = new JMenuItem("\uD68C\uC6D0\uAC00\uC785");
		sdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				membershipEx membershipEx = new membershipEx();
				membershipEx.setVisible(true);
			}
		});
		sdf.setIcon(new ImageIcon(munuEx.class.getResource("/images/[\uD06C\uAE30\uBCC0\uD658]\uD68C\uC6D0\uAC00\uC785.PNG")));
		mnNewMenu.add(sdf);
		
		JMenuItem mntmNewMenuItem_4_1_1 = new JMenuItem("\uB85C\uADF8\uC778");
		mntmNewMenuItem_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WinLogin winlogin = new WinLogin();
				winlogin.setVisible(true);
			}
		});
		mntmNewMenuItem_4_1_1.setIcon(new ImageIcon(munuEx.class.getResource("/images/[\uD06C\uAE30\uBCC0\uD658]\uB85C\uADF8\uC778.PNG")));
		mnNewMenu.add(mntmNewMenuItem_4_1_1);
		
		JMenuItem mntmNewMenuItem_4_1_2 = new JMenuItem("\uC628\uB3C4\uBCC0\uD658");
		mntmNewMenuItem_4_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Temp temp = new Temp();
				temp.setVisible(true);
			}
		});
		mntmNewMenuItem_4_1_2.setIcon(new ImageIcon(munuEx.class.getResource("/images/[\uD06C\uAE30\uBCC0\uD658]\uC628\uB3C4.PNG")));
		mnNewMenu.add(mntmNewMenuItem_4_1_2);
		
		JMenu mnNewMenu_1 = new JMenu("\uC0C9\uC0C1");
		mnNewMenu_1.setPreferredSize(new Dimension(100, 26));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4_1_3 = new JMenuItem("\uBE68\uAC15");
		mntmNewMenuItem_4_1_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_4_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.red);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4_1_3);
		
		JMenuItem mntmNewMenuItem_4_1_4 = new JMenuItem("\uB178\uB791");
		mntmNewMenuItem_4_1_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_4_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.yellow);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4_1_4);
		
		JMenuItem mntmNewMenuItem_4_1_5 = new JMenuItem("\uD30C\uB791");
		mntmNewMenuItem_4_1_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_4_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.blue);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4_1_5);
		
		JMenuItem mntmNewMenuItem_4_1_6 = new JMenuItem("\uBD99\uC5EC\uB123\uAE30");
		mnNewMenu_1.add(mntmNewMenuItem_4_1_6);
		
		JMenuItem mntmNewMenuItem_4_1_7 = new JMenuItem("\uBD99\uC5EC\uB123\uAE30");
		mnNewMenu_1.add(mntmNewMenuItem_4_1_7);
		
		JMenu mnNewMenu_2 = new JMenu("\uBCF4\uAE30");
		mnNewMenu_2.setPreferredSize(new Dimension(100, 26));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4_1_8 = new JMenuItem("\uBD99\uC5EC\uB123\uAE30");
		mnNewMenu_2.add(mntmNewMenuItem_4_1_8);
		
		JMenuItem mntmNewMenuItem_4_1_9 = new JMenuItem("\uBD99\uC5EC\uB123\uAE30");
		mnNewMenu_2.add(mntmNewMenuItem_4_1_9);
		
		JMenuItem mntmNewMenuItem_4_1_10 = new JMenuItem("\uBD99\uC5EC\uB123\uAE30");
		mnNewMenu_2.add(mntmNewMenuItem_4_1_10);
		
		JMenuItem mntmNewMenuItem_4_1_11 = new JMenuItem("\uBD99\uC5EC\uB123\uAE30");
		mnNewMenu_2.add(mntmNewMenuItem_4_1_11);
		
		JMenuItem mntmNewMenuItem_4_1_12 = new JMenuItem("\uBD99\uC5EC\uB123\uAE30");
		mnNewMenu_2.add(mntmNewMenuItem_4_1_12);
		
		JMenu mnNewMenu_3 = new JMenu("\uBCF4\uAE30");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_4_1_8_1 = new JMenuItem("\uBD99\uC5EC\uB123\uAE30");
		mnNewMenu_3.add(mntmNewMenuItem_4_1_8_1);
		
		JMenuItem mntmNewMenuItem_4_1_9_1 = new JMenuItem("\uBD99\uC5EC\uB123\uAE30");
		mnNewMenu_3.add(mntmNewMenuItem_4_1_9_1);
		
		JMenuItem mntmNewMenuItem_4_1_10_1 = new JMenuItem("\uBD99\uC5EC\uB123\uAE30");
		mnNewMenu_3.add(mntmNewMenuItem_4_1_10_1);
		
		JMenuItem mntmNewMenuItem_4_1_11_1 = new JMenuItem("\uBD99\uC5EC\uB123\uAE30");
		mnNewMenu_3.add(mntmNewMenuItem_4_1_11_1);
		
		JMenuItem mntmNewMenuItem_4_1_12_1 = new JMenuItem("\uBD99\uC5EC\uB123\uAE30");
		mnNewMenu_3.add(mntmNewMenuItem_4_1_12_1);
		
		
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
