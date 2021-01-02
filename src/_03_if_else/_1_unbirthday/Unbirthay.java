package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthay {
	
	public static void main(String[] args) {
		String Unbirthay=JOptionPane.showInputDialog("what is you birthday");
		
		if(Unbirthay.equals("01/02")) {
			JOptionPane.showMessageDialog(null, "happy birthday");
				
			
		}
		
		else {
			JOptionPane.showMessageDialog(null, "happy unbirthday");
		}
	
	
	}

}
