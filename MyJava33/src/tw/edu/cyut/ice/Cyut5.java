package tw.edu.cyut.ice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Cyut5 extends JFrame implements ActionListener {
	private JButton b1, b2, b3;
	private JTextArea area;
	
	public Cyut5() {
		super("My Window");
		
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		area = new JTextArea();
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		top.add(b1); top.add(b2);top.add(b3);
		
		add(top, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Cyut5();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("b1");
		}else if (e.getSource() == b2) {
			System.out.println("b2");
		}else if (e.getSource() == b3) {
			System.out.println("b3");
		}
	}

}
