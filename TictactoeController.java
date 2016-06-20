import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

class TictactoeController extends JFrame{
	public static boolean player0 = true;//to decide the player turn
	public static JButton[][] buttonMatrix = new JButton[3][3];//to check the order
	public static int[][] stateOfButton = new int[3][3];//to check the state of the button 1:Player0 , 2 :playerX
	
	
	TictactoeController(){
		setMatrix();
		
		JButton but1=TictactoeModel.getBut1();
		JButton but2=TictactoeModel.getBut2();
		JButton but3=TictactoeModel.getBut3();
		JButton but4=TictactoeModel.getBut4();
		JButton but5=TictactoeModel.getBut5();
		JButton but6=TictactoeModel.getBut6();
		JButton but7=TictactoeModel.getBut7();
		JButton but8=TictactoeModel.getBut8();
		JButton but9=TictactoeModel.getBut9();
		
		
		/***********but1****************/
		
		but1.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e){
				
				if(player0){
					
					stateOfButton[0][0]=1;
					but1.setText("0");
					
				}else{
					
					stateOfButton[0][0]=2;
					but1.setText("X");
					
				}
				
				but1.setEnabled(false);
				checkWinner();
				player0=!player0;
				
			}
			
			
			
		});
		/********************but2*********************/
		but2.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e){
				
				if(player0){
					
					stateOfButton[0][1]=1;
					but2.setText("0");
					
				}else{
					
					stateOfButton[0][1]=2;
					but2.setText("X");
					
				}
				
				but2.setEnabled(false);
				checkWinner();
				player0=!player0;
				
			}
			
			
			
		});
		
		/***************but3**************/
		
		but3.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e){
				
				if(player0){
					
					stateOfButton[0][2]=1;
					but3.setText("0");
					
				}else{
					
					stateOfButton[0][2]=2;
					but3.setText("X");
					
				}
				
				but3.setEnabled(false);
				checkWinner();
				player0=!player0;
			}
			
			
			
		});
		
		/********************but4******************/
		
		but4.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e){
				
				if(player0){
					
					stateOfButton[1][0]=1;
					but4.setText("0");
					
				}else{
					
					stateOfButton[1][0]=2;
					but4.setText("X");
					
				}
				
				
				but4.setEnabled(false);
				checkWinner();
				player0=!player0;
				
			}
			
			
			
		});
		
		/**********************but5******************/
		
		but5.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e){
				
				if(player0){
					
					stateOfButton[1][1]=1;
					but5.setText("0");
					
				}else{
					
					stateOfButton[1][1]=2;
					but5.setText("X");
					
				}
				
				but5.setEnabled(false);
				checkWinner();
				player0=!player0;
				
			}
			
			
			
		});
		
		/********************but6************/
		but6.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e){
				
				if(player0){
					
					stateOfButton[1][2]=1;
					but6.setText("0");
					
				}else{
					
					stateOfButton[1][2]=2;
					but6.setText("X");
					
				}
				
				but6.setEnabled(false);
				checkWinner();
				player0=!player0;
				
			}
			
			
			
		});
		
		/*******************but7*************/
		but7.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e){
				
				if(player0){
					
					stateOfButton[2][0]=1;
					but7.setText("0");
					
				}else{
					
					stateOfButton[2][0]=2;
					but7.setText("X");
					
				}
				
				but7.setEnabled(false);
				checkWinner();
				player0=!player0;
			}
			
			
			
		});
		/*****************but8***************/
		but8.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e){
				
				if(player0){
					
					stateOfButton[2][1]=1;
					but8.setText("0");
					
				}else{
					
					stateOfButton[2][1]=2;
					but8.setText("X");
					
				}
				
				but8.setEnabled(false);
				checkWinner();
				player0=!player0;
			}
			
			
			
		});
		/****************but9***************/
		but9.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e){
				
				if(player0){
					
					stateOfButton[2][2]=1;
					but9.setText("0");
					
				}else{
					
					stateOfButton[2][2]=2;
					but9.setText("X");
					
				}
				
				but9.setEnabled(false);
				checkWinner();
				player0=!player0;
				
			}
			
			
			
		});
		




	
		
	}
	public static void setMatrix(){
		
		TictactoeModel.setBut1(TictactoeView.but1);
		TictactoeModel.setBut2(TictactoeView.but2);
		TictactoeModel.setBut3(TictactoeView.but3);
		TictactoeModel.setBut4(TictactoeView.but4);
		TictactoeModel.setBut5(TictactoeView.but5);
		TictactoeModel.setBut6(TictactoeView.but6);
		TictactoeModel.setBut7(TictactoeView.but7);
		TictactoeModel.setBut8(TictactoeView.but8);
		TictactoeModel.setBut9(TictactoeView.but9);
		
		
	}
	public int checkWinner(){
		int counter0 = 0;//to count if the state is 1
		int counterX = 0;//to count if the state is 2
		for(int i=0 ; i < 3; i++){//to check horizontal rows
			for(int j=0 ; j<3 ; j++){
				
				if(!buttonMatrix[i][j].isEnabled() && stateOfButton[i][j]==1){
					counter0++;//increment by 1 if the state of the button is 1
					
				}else if(!buttonMatrix[i][j].isEnabled() && stateOfButton[i][j]==2){
					counterX++;//increment by 1 if the state of the button is 2
					
				}else{
					break;
				}
					
				
			}
			if(counter0 == 3){
				JOptionPane.showMessageDialog(this, "Player0 won..");
				return 0;
			}else if(counterX == 3){
				JOptionPane.showMessageDialog(this, "PlayerX won..");
				return 0;
				
			}
			
			counter0=0;
			counterX=0;
			
		}
		
		for(int i=0 ; i < 3; i++){//to check vertical rows
			for(int j=0 ; j<3 ; j++){
				
				if(!buttonMatrix[j][i].isEnabled() && stateOfButton[j][i]==1){
					counter0++;//increment by 1 if the state of the button is 1
					
				}else if(!buttonMatrix[j][i].isEnabled() && stateOfButton[j][i]==2){
					counterX++;//increment by 1 if the state of the button is 2
					
				}else{
					break;
				}
					
				
			}
			if(counter0 == 3){
				JOptionPane.showMessageDialog(this, "Player0 won..");
				return 0;
			}else if(counterX == 3){
				JOptionPane.showMessageDialog(this, "PlayerX won..");
				return 0;
				
			}
			
			counter0=0;
			counterX=0;
			
		}
		for(int i=0;i<3;i++){//to check the main diagonal
			if(!buttonMatrix[i][i].isEnabled() && stateOfButton[i][i]==1){
					counter0++;//increment by 1 if the state of the button is 1
					
			}else if(!buttonMatrix[i][i].isEnabled() && stateOfButton[i][i]==2){
					counterX++;//increment by 1 if the state of the button is 2
					
			}else{
					break;
			}
			
			
		}
		if(counter0 == 3){
				JOptionPane.showMessageDialog(this, "Player0 won..");
				return 0;
		}else if(counterX == 3){
				JOptionPane.showMessageDialog(this, "PlayerX won..");
				return 0;
				
		}
		counter0=0;
		counterX=0;
	
		for(int i=0 ; i < 3; i++){//to check counter diagonal
			
				
			if(!buttonMatrix[i][2-i].isEnabled() && stateOfButton[i][2-i]==1){
				counter0++;//increment by 1 if the state of the button is 1
				
			}else if(!buttonMatrix[i][2-i].isEnabled() && stateOfButton[i][2-i]==2){
				counterX++;//increment by 1 if the state of the button is 2
				
			}else{
				break;
			}
			
			
		}
				
			
		
		if(counter0 == 3){
			JOptionPane.showMessageDialog(this, "Player0 won..");
			return 0;
		}else if(counterX == 3){
			JOptionPane.showMessageDialog(this, "PlayerX won..");
			return 0;
			
		}
		counter0=0;
		counterX=0;
		
		
		return -1;
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
