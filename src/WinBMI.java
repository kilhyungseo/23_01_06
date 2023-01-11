

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

public class WinBMI extends JFrame {

   private JPanel contentPane;
   private JTextField tfHeight;
   private JTextField tfWeight;
   private JLabel lblResult;

   
   /**
    * Create the frame.
    */
   public WinBMI() {
      setTitle("BMI 계산기");
      //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 488, 111);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      
      JLabel lblHeight = new JLabel("신장:");
      contentPane.add(lblHeight);
      
      tfHeight = new JTextField();
      tfHeight.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER) {
               tfWeight.requestFocus();
            }
         }
      });
      contentPane.add(tfHeight);
      tfHeight.setColumns(10);
      
      JLabel lblCm = new JLabel("cm");
      contentPane.add(lblCm);
      
      JLabel lblWeight = new JLabel("체중:");
      contentPane.add(lblWeight);
      
      tfWeight = new JTextField();
      tfWeight.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER) {
               CalcBMI();
            }
         }
      });
      tfWeight.setColumns(10);
      contentPane.add(tfWeight);
      
      JLabel lblKg = new JLabel("kg");
      contentPane.add(lblKg);
      
      JButton btnCalc = new JButton("계산하기");
      btnCalc.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            CalcBMI();
         }
      });
      contentPane.add(btnCalc);
      
      lblResult = new JLabel("판별:");
      contentPane.add(lblResult);
   }


   protected void CalcBMI() {
      double height = Double.parseDouble(tfHeight.getText());
      double weight = Double.parseDouble(tfWeight.getText());
      height = height/100;
      double BMI = weight/(height * height);
      if(BMI >= 30)
         lblResult.setText("판별:" + String.format("%.2f", BMI) + " >> 비만");
      else if(BMI >= 25)
         lblResult.setText("판별:" + String.format("%.2f", BMI) + " >> 과체중");
      else if(BMI >= 20)
         lblResult.setText("판별:" + String.format("%.2f", BMI) + " >> 정상");
      else
         lblResult.setText("판별:" + String.format("%.2f", BMI) + " >> 저체중");
   }
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinBMI winbmi = new WinBMI();
					winbmi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
   
}

