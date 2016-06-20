import javax.swing.*;

class TictactoeMain extends JFrame{
	private static TictactoeView frame;
	
	public static void main(String[] args){
		
		frame = new TictactoeView();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		
		
	}
		
	
}
