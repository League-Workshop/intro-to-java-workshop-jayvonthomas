package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
			String input = JOptionPane.showInputDialog(null, "how many days are in a year");
		// 3.  Use an if statement to check if their answer is correct
			if (input.equals("365")) {
				speak("correct");
				score += 1;
			}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		input = JOptionPane.showInputDialog("how many states are in America");
		if (input. equals("50") )
			speak("correct");
		    score += 1;
	
		// 6.  After all the questions have been asked, print the user's score 
		
			JOptionPane.showMessageDialog(null, score);
	}
			static void speak(String words) {
				try {
					Runtime.getRuntime().exec("say " + words).waitFor();
				}
				 catch (Exception e) {
					 e.printStackTrace();
				 }
			}
}
