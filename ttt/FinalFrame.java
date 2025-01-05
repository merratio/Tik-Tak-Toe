package ttt;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FinalFrame extends JFrame{
	private JButton playAgain;
	
	public FinalFrame() {
		playAgain = new JButton("Play Again");
		
		this.setBounds(150, 170, WIDTH, HEIGHT);
		
		this.setSize(new Dimension(200, 100));
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(playAgain, BorderLayout.SOUTH);
		ButtonListener(this);
	}
	
	public void ButtonListener(FinalFrame obj) {
		playAgain.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				obj.dispose();
				Grid restart = new Grid();
			}
			
		});
	}
	
	
}
