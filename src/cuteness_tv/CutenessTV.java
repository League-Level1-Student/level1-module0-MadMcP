package cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
    public void showButton() {
        frame.setVisible(true);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        frame.add(panel);
    	frame.pack();
    	button1.addActionListener(this);
    	button2.addActionListener(this);
    	button3.addActionListener(this);
    	button1.setText("Ducks");
    	button2.setText("Frog");
    	button3.setText("Unicorns");
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed==button1) {
			showDucks();
		}
		else if (buttonPressed==button2) {
			showFrog();
		}
		else if (buttonPressed==button3) {
			showFluffyUnicorns();
		}
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
