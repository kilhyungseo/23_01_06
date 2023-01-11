

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinGBB extends JFrame {

   private JPanel contentPane;
   private JLabel lblComputer;
   private JLabel lblHuman;
   private String GBB[] = {"gawi","bawi","bo"};
   private int computer;
   private JLabel lblHuman2;
   private JLabel lblComputer2;
    
   
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               WinGBB frame = new WinGBB();
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
   public WinGBB() {
      setTitle("가위바위보 게임");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 464, 381);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      lblHuman = new JLabel("");
      lblHuman.setBackground(new Color(255, 255, 0));
      lblHuman.setBounds(12, 32, 154, 182);
      contentPane.add(lblHuman);
      lblHuman.setOpaque(true);
      
      lblComputer = new JLabel("");
      lblComputer.setBackground(new Color(255, 255, 0));
      lblComputer.setBounds(282, 32, 154, 182);
      contentPane.add(lblComputer);
      lblComputer.setOpaque(true);
      
      JButton btnGawi = new JButton("");      
      btnGawi.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            showHuman(0);
            
            showComputer();
            
            showresult(0);
         }
      });
      ImageIcon image = new ImageIcon(WinGBB.class.getResource("/images/gawi.jpg"));
      Image pic = image.getImage();
      pic = pic.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
      ImageIcon img = new ImageIcon(pic);
      btnGawi.setIcon(img);
      
      btnGawi.setBounds(12, 238, 100, 100);
      contentPane.add(btnGawi);
      
      JButton btnBawi = new JButton("");
      btnBawi.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            showHuman(1);
            
            showComputer();
            
            showresult(1);
         }
      });
      image = new ImageIcon(WinGBB.class.getResource("/images/bawi.jpg"));
      pic = image.getImage();
      pic = pic.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
      img = new ImageIcon(pic);
      btnBawi.setIcon(img);
      btnBawi.setBounds(170, 238, 100, 100);
      contentPane.add(btnBawi);
      
      JButton btnBo = new JButton("");
      btnBo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            showHuman(2);
            
            showComputer();
            
            showresult(2);
         }
      });
      image = new ImageIcon(WinGBB.class.getResource("/images/bo.jpg"));
      pic = image.getImage();
      pic = pic.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
      img = new ImageIcon(pic);
      btnBo.setIcon(img);
      btnBo.setBounds(327, 238, 100, 100);
      contentPane.add(btnBo);
      
      lblHuman2 = new JLabel("Human");
      lblHuman2.setBounds(64, 7, 57, 15);
      contentPane.add(lblHuman2);
      
      lblComputer2 = new JLabel("Computer");
      lblComputer2.setBounds(327, 7, 77, 15);
      contentPane.add(lblComputer2);
   }
   int win, coin, lose, draw, fail, coinInt;
   protected void showresult(int Human) {
	   //가위바위보 승패 설정
	   
	   			coin++;
	    if(Human >= 0 && Human <= 2) {//유저의 가위바위보 입력값이 0~2일 때만
	        //가위=0,바위=1,보=2
	    	if((computer == 0 && Human == 1) || (computer == 1 && Human == 2) || (computer == 2 && Human ==0)) {//유저가 진경우
	    		win++;
	            System.out.println("[승리]");
	            
	       }else if(computer == Human) {//무승부인경우
	    	   	draw++;
	            System.out.println("[무승부]");
	        }else {
	            lose++;
	            System.out.println("[패배]");
	        }
	    }else {//오류상황
	    		fail++;
	        System.out.println("값을 잘못 입력 하였습니다.");    
	    }
	    System.out.println("=========================================");
	    float wins = ((float)win/(float)(coin))*100; // 승률변수 =(이긴횟수/총 경기)x100
		
		System.out.println("[결과] 게임 횟수 : " +coin);
		System.out.println("[전적] win:"+win+"번, lose:"+lose+"번, draw:"+draw+"번, 무효:"+fail+"번");
		System.out.printf("[승률] %.2f%% \n",wins);
		System.out.println("================GAME END=================");
	}
	
   
   protected void showHuman(int i) {
      ImageIcon image = new ImageIcon(WinGBB.class.getResource("/images/"+GBB[i]+".jpg"));
      Image pic = image.getImage();
      pic = pic.getScaledInstance(154, 182, Image.SCALE_SMOOTH);
      ImageIcon img = new ImageIcon(pic);
      lblHuman.setIcon(img);
   }

   protected void showComputer() {
      computer = (int)(Math.random()*3);
	  String strName = GBB[computer];
      System.out.println(strName + "를 내셨습니다");                                       
      System.out.println("=========================================");
      ImageIcon image = new ImageIcon(WinGBB.class.getResource("/images/" + strName + ".jpg"));
      Image pic = image.getImage();
      pic = pic.getScaledInstance(154, 182, Image.SCALE_SMOOTH);
      ImageIcon img = new ImageIcon(pic);
      lblComputer.setIcon(img);      
   }

}