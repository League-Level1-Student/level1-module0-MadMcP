package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String URL= "https://s3.amazonaws.com/cdn.brecks.com/images/500/73689A.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component Lily;
		// 3. use the "createImage()" method below to initialize your Component
		Lily = createImage(URL);
		// 4. add the image to the quiz window
		quizWindow.add(Lily);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What type of flower is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equalsIgnoreCase("Lily")) {
			System.out.println("CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(Lily);
		// 10. find another image and create it (might take more than one line
		// of code)
		String URL2= "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBk30X3alvdsHHRMHoSwVaN0IDgf_dgIUUikKJONAdx4Y3VrYDfw";
		Component Daisy;
		Daisy = createImage(URL2);
		quizWindow.add(Daisy);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("What type of flower is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer2.equalsIgnoreCase("Daisy")){
			System.out.println("CORRECT");
		}
		else {
			System.out.println("INCORRECT");
		}
	}
	
	private Component createImage(String icon2) throws MalformedURLException {
		URL url = new URL(icon2);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
