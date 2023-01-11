import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WinLogin extends JFrame {

   private JPanel contentPane;
   private JTextField tfID;
   private JTextField tfPw;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               WinLogin frame = new WinLogin();
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
   public WinLogin() {
      setTitle("Login");
//      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 360, 167);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblID = new JLabel("ID:");
      lblID.setBounds(12, 31, 57, 15);
      contentPane.add(lblID);
      
      tfID = new JTextField();
      tfID.addKeyListener(new KeyAdapter() {
      	@Override
      	public void keyPressed(KeyEvent e) {
      		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
      			tfPw.requestFocus();
      			tfPw.setSelectionStart(0);
      			tfPw.setSelectionEnd(tfPw.getText().length());
      		}
      	}
      });
      tfID.setBounds(81, 28, 116, 21);
      contentPane.add(tfID);
      tfID.setColumns(10);
      
      JLabel lblPW = new JLabel("PW:");
      lblPW.setBounds(12, 87, 57, 15);
      contentPane.add(lblPW);
      
      tfPw = new JTextField();
      tfPw.addKeyListener(new KeyAdapter() {
      	@Override
      	public void keyPressed(KeyEvent e) {
      		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
      			tfID.requestFocus();
      			tfID.setSelectionStart(0);
      			tfID.setSelectionEnd(tfID.getText().length());
      		}
      	}
      });
      tfPw.setColumns(10);
      tfPw.setBounds(81, 84, 116, 21);
      contentPane.add(tfPw);
      
      JButton btnLogin = new JButton("로그인");
      btnLogin.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //로그인 성공/실패 판별
            if(tfID.getText().equals("test") && tfPw.getText().equals("1234"))
               System.out.println("로그인 성공");
            else
               System.out.println("로그인 실패");
            Temp temp = new Temp();
            temp.setVisible(true);
            		
            
         }
      });
      btnLogin.setBounds(209, 27, 97, 80);
      contentPane.add(btnLogin);
   }
}