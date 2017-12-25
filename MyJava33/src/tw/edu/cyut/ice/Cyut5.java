package tw.edu.cyut.ice;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Cyut5 extends JFrame {
	private JButton b1, b2, b3;
	private JTextArea area;
	
	public Cyut5() {
		super("My Window");
		
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		area = new JTextArea();
		
		setLayout(new BorderLayout());
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.NORTH);
		add(b3, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Cyut5();
	}

}
