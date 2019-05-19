package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	private JLabel Lilly;
	private JLabel Sunflower;

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizWindow.setPreferredSize(new Dimension(333,500));
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		showLily();
		// 2. create a variable of type "Component" that will hold your image
		// 3. use the "createImage()" method below to initialize your Component
		// 4. add the image to the quiz window
		// 5. call the pack() method on the quiz window
		// 6. ask a question that relates to the image
		String answer1 = JOptionPane.showInputDialog("What kind of flower is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer1.equalsIgnoreCase("lily")) {
			System.out.println("CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(Lilly);
		// 10. find another image and create it (might take more than one line
		// of code)
		showSunflower();
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question
		
		// 14+ check answer, say if correct or incorrect, etc.
		String answer2 = JOptionPane.showInputDialog("What kind of flower is this?");
		if (answer2.equalsIgnoreCase("sunflower")) {
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
	
	private void showLily() {
		JFrame quizWindow = new JFrame();
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizWindow.setVisible(true);

		Icon icon = new ImageIcon(getClass().getResource("Lilly.jpg"));
		this.Lilly = new JLabel(icon);
		quizWindow.add(Lilly);
		quizWindow.pack();
	}
	private void showSunflower() {
		JFrame quizWindow = new JFrame();
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizWindow.setVisible(true);

		Icon icon = new ImageIcon(getClass().getResource("Sunflower.jpg"));
		this.Sunflower = new JLabel(icon);
		quizWindow.add(Sunflower);
		quizWindow.pack();
	}
	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
