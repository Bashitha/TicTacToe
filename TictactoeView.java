import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
class TictactoeView extends JFrame{
	
	
	public static JButton but1;
	public static JButton but2;
	public static JButton but3;
	public static JButton but4;
	public static JButton but5;
	public static JButton but6;
	public static JButton but7;
	public static JButton but8;
	public static JButton but9;
	
	 
	
	TictactoeView(){
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new GridLayout(3,3));
		
		but1 = new JButton();
		but2 = new JButton();
		but3 = new JButton();
		but4 = new JButton();
		but5 = new JButton();
		but6 = new JButton();
		but7 = new JButton();
		but8 = new JButton();
		but9 = new JButton();
		
		buttonPane.add(but1);
		buttonPane.add(but2);
		buttonPane.add(but3);
		buttonPane.add(but4);
		buttonPane.add(but5);
		buttonPane.add(but6);
		buttonPane.add(but7);
		buttonPane.add(but8);
		buttonPane.add(but9);
		
		add(buttonPane);
		
		TictactoeController controller=new TictactoeController();

		
		
		
		
		
	}
}
