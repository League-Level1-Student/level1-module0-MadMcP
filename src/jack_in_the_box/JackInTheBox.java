package jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton button = new JButton();
	int pressed = 0;
	
    public void showButton() {
        System.out.println("Button clicked");
        frame.setVisible(true);
        frame.add(button);
    	frame.pack();
    	button.addActionListener(this);
    	button.setText("Surprise");
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed==button) {
			pressed = pressed + 1;
		}
		if (pressed==5) {
			showPicture("jackInTheBox.png");
			playSound("homer-woohoo.wav");
		}
	}
	private void showPicture(String fileName) {
	    try {
	        JLabel imageLabel = createLabelImage(fileName);
	        JFrame frame = new JFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.add(imageLabel);
	        frame.setVisible(true);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	private JLabel createLabelImage(String fileName) {
		try {
	            URL imageURL = getClass().getResource(fileName);
	            if (imageURL == null) {
		       System.err.println("Could not find image " + fileName);
		       return new JLabel();
	            } else {
	                Icon icon = new ImageIcon(imageURL);
	                JLabel imageLabel = new JLabel(icon);
	                return imageLabel;
	            }
	        } catch (Exception e) {
	            System.err.println("Could not find image " + fileName);
	            return new JLabel();
	        }
	}
	private void playSound(String soundFile) { 
	    try {
	        AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	        sound.play();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
