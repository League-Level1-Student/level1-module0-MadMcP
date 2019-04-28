package houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot ro = new Robot();
	static String h;
	static String c;
	public static void main(String[] args) {
		ro.setWindowColor(0, 0, 0);
		ro.moveTo(5,500);
		for (int i = 0; i < 10; i++) {
		h = JOptionPane.showInputDialog("Insert height (small, medium, big, large)");
		c = JOptionPane.showInputDialog("Insert color (red, orange, yellow, green, blue, purple)");
		houses(h, c);
		}
	}
	public static void houses(String height, String color) {
		int t = 0;
		if (h.equalsIgnoreCase("small")) {
			t = 60;
		}
		else if (h.equalsIgnoreCase("medium")) {
			t = 120;
		}
		else if (h.equalsIgnoreCase("big")) {
			t = 200;
		}
		else if (h.equalsIgnoreCase("large")) {
			t = 250;
		}
		else {
			t = 100;
		}
		if (c.equalsIgnoreCase("red")) {
			ro.setPenColor(216, 26, 26);
		}
		else if (c.equalsIgnoreCase("orange")) {
			ro.setPenColor(250, 175, 35);
		}
		else if (c.equalsIgnoreCase("yellow")) {
			ro.setPenColor(250, 240, 48);
		}
		else if (c.equalsIgnoreCase("green")) {
			ro.setPenColor(8, 206, 33);
		}
		else if (c.equalsIgnoreCase("blue")) {
			ro.setPenColor(18, 177, 219);
		}
		else if (c.equalsIgnoreCase("purple")) {
			ro.setPenColor(211, 169, 242);
		}
		else {
			ro.setRandomPenColor();
		}
		ro.penDown();
		ro.setSpeed(100);
		ro.move(t);
		if (t >= 200) {
			drawFlatRoof();
		}
		else {
			drawPointyRoof();
		}
		ro.move(t);
		ro.turn(-90);
		ro.setPenColor(26, 100, 47);
		ro.move(20);
		ro.turn(-90);
	}
	public static void drawPointyRoof() {
		ro.turn(45);
		ro.move(20);
		ro.turn(90);
		ro.move(20);
		ro.turn(45);
	}
	public static void drawFlatRoof() {
		ro.turn(90);
		ro.move(30);
		ro.turn(90);
	}
}
