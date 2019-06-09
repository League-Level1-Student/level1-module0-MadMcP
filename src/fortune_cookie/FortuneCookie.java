package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton button = new JButton();
	
    public void showButton() {
        System.out.println("Button clicked");
        frame.setVisible(true);
        frame.add(button);
    	frame.pack();
    	button.addActionListener(this);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand==0) {
			JOptionPane.showMessageDialog(null, "Luck is on your side today");
		}
		else if (rand==1) {
			JOptionPane.showMessageDialog(null, "Luck will work against you today");
		}
		else if (rand==2) {
			JOptionPane.showMessageDialog(null, "The day is in your hands");
		}
		else if (rand==3) {
			JOptionPane.showMessageDialog(null, "The day will we like any other.");
		}
		else if (rand==4) {
			JOptionPane.showMessageDialog(null, "The day will be unlike any other");
		}
	}
}
