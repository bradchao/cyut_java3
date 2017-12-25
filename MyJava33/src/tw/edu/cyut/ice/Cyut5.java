package tw.edu.cyut.ice;

import javax.swing.JFrame;

public class Cyut5 extends JFrame {
	public Cyut5() {
		super("My Window");
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Cyut5();
	}

}
