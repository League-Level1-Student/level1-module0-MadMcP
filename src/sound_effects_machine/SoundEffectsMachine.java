package sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	
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
    	button1.setText("Service Bell");
    	button2.setText("Sawing Wood");
    	button3.setText("Rain");
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed==button1) {
			playSound("service-bell_daniel_simion.wav");
		}
		else if (buttonPressed==button2) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		else if (buttonPressed==button3) {
			playSound("heavy-rain-daniel_simon.wav");
		}
	}
	
	private void playSound(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

	    sound.play();

	}
}
