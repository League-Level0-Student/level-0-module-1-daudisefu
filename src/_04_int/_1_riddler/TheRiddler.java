package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score= 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
			String input=JOptionPane.showInputDialog(null, "What has many keys but can't open a single lock?");
		// 4. If hey got the answer right, pop up "correct!" and increase the score by one
			if(input.equals("keyboard")) {
				
			score++;
				JOptionPane.showMessageDialog(null,"yes it was the right answer ");
			}
		// 5. Otherwise, say "wrong" and tell ethem the answer
			else  {
				
				JOptionPane.showMessageDialog(null,"that was wrong the answer is keyboard");
			}
		// 6. Add some more riddles
			
			input=JOptionPane.showInputDialog(null," What has to be broken before you use it?");
					if(input.equals("egg")) {
						score+=1;
						JOptionPane.showMessageDialog(null,"good job");
					}
					
					else {
						
						JOptionPane.showInternalMessageDialog(null, " it one more time  that was wrong that answer is egg");
					}
					
					input=JOptionPane.showInputDialog(null, "Feed me and I live, yet give me a drink and I die");
							
						
							
							if(input.equals("fire")) {
								score+=1;
								JOptionPane.showMessageDialog(null,"that was the best" );		
								
							}
							else {
								JOptionPane.showMessageDialog(null, "you do better next time the answer is fire");
							}
							JOptionPane.showMessageDialog(null, "you score is "+score );

		// 2. Make a pop up to show the score.
			
			
		
	}
}

