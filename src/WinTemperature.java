import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class WinTemperature extends JFrame {

   private JPanel contentPane;
   private JTextField taFahrenheit;
   private JTextField taCelsius;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               WinTemperature frame = new WinTemperature();
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
   public WinTemperature() {
      setTitle("¿Âµµ º¯È¯±â");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 542, 229);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblFahrenheit = new JLabel("È­¾¾:");
      lblFahrenheit.setFont(new Font("±¼¸²", Font.PLAIN, 20));
      lblFahrenheit.setBounds(58, 31, 57, 35);
      contentPane.add(lblFahrenheit);
      
      taFahrenheit = new JTextField();
      taFahrenheit.addFocusListener(new FocusAdapter() {
      	@Override
      	public void focusGained(FocusEvent e) {
    	    taFahrenheit.setSelectionStart(0);
    	    taFahrenheit.setSelectionEnd(taFahrenheit.getText().length());
      		
      	}
      });
      taFahrenheit.setHorizontalAlignment(SwingConstants.RIGHT);
      taFahrenheit.setText("0");
      taFahrenheit.setFont(new Font("±¼¸²", Font.PLAIN, 20));
      taFahrenheit.setBounds(138, 28, 301, 38);
      contentPane.add(taFahrenheit);
      taFahrenheit.setColumns(10);
      
      taCelsius = new JTextField();
      taCelsius.addFocusListener(new FocusAdapter() {
      	@Override
      	public void focusGained(FocusEvent e) {
    		taCelsius.setSelectionStart(0);
    		taCelsius.setSelectionEnd(taCelsius.getText().length());
      	}
      });
      taCelsius.addKeyListener(new KeyAdapter() {
      	@Override
      	public void keyPressed(KeyEvent e) {
      		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
      			C2F();

      		}
      	}
      });
      taCelsius.setHorizontalAlignment(SwingConstants.RIGHT);
      taCelsius.setText("0");
      taCelsius.setFont(new Font("±¼¸²", Font.PLAIN, 20));
      taCelsius.setColumns(10);
      taCelsius.setBounds(138, 128, 301, 34);
      contentPane.add(taCelsius);
      
      JLabel lblCelsius = new JLabel("¼·¾¾:");
      lblCelsius.setFont(new Font("±¼¸²", Font.PLAIN, 20));
      lblCelsius.setBounds(58, 128, 57, 31);
      contentPane.add(lblCelsius);
      
      JButton btnConversion = new JButton("º¯È¯");
      taFahrenheit.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
        			F2C();
        			
        		}
        	}
        });
      btnConversion.setBounds(138, 76, 196, 42);
      contentPane.add(btnConversion);
      
      
   }

protected void C2F() {
		double Celsius = Double.parseDouble(taCelsius.getText());
	    double Fahrenheit;
	    Fahrenheit = (double)9 / 5 * Celsius + 32;
	    taFahrenheit.setText(String.format("%.2f", Fahrenheit));
	    taFahrenheit.requestFocus();
	    taFahrenheit.setSelectionStart(0);
	    taFahrenheit.setSelectionEnd(taFahrenheit.getText().length());

}

protected void F2C() {
		double Fahrenheit = Double.parseDouble(taFahrenheit.getText());
		double Celsius;
		Celsius = (double)5 / 9 * (Fahrenheit - 32);
		taCelsius.setText(String.format("%.2f", Celsius));
		taCelsius.requestFocus();
		taCelsius.setSelectionStart(0);
		taCelsius.setSelectionEnd(taCelsius.getText().length());
	
}
}