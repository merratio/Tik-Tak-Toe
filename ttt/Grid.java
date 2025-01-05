package ttt;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Grid extends JFrame{
	Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
	int player;
	
	//constructor
	public Grid() {
		button1 = new Button();
		button2 = new Button();
		button3 = new Button();
		button4 = new Button();
		button5 = new Button();
		button6 = new Button();
		button7 = new Button();
		button8 = new Button();
		button9 = new Button();
		
		player = 1;

		
		this.setSize(new Dimension(500, 500));
		this.setTitle("TIK-TAK-TOE");
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(button9);

		this.setLayout(new GridLayout(3,3));
		ButtonListener(this);

	}
	
	public void CheckForWinner(Grid grid) {
		/*
		 ways to win tik tak toe
		 straight lines
		 -horizontal
		 -- if button 1 2 3 are equal
		 -- if button 4 5 6 are equal
		 -- if button 7 8 9 are equal
		 -Vertical
		 -- if button1 4 and 7 are equal
		 -- if button2 5 and 8 are equal
		 -- if button3 6 and 9 are equal
		 Diagonal lines
		 - if button 1 button 5 and button 9 are equal or 
		 - if button 3 5 and 7 are equal
		 */
		
		if(button1.GetOnClick() == true && button2.GetOnClick() == true && button3.GetOnClick() == true) {
			if((button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText()))){
				grid.setEnabled(false);
				
				FinalFrame frame = new FinalFrame();
				
				JLabel label = new JLabel("Loser: Player " + player);
				frame.add(label, BorderLayout.CENTER);
				return;
			}
		}
		
		if(button4.GetOnClick() == true && button5.GetOnClick() == true && button6.GetOnClick() == true) {
			if((button4.getText().equals(button5.getText()) && button5.getText().equals(button6.getText()))){
				grid.setEnabled(false);
				
				FinalFrame frame = new FinalFrame();
				
				JLabel label = new JLabel("Loser: Player " + player);
				frame.add(label, BorderLayout.CENTER);
				return;
			}
		}
		
		if(button7.GetOnClick() == true && button8.GetOnClick() == true && button9.GetOnClick() == true) {
			if(button7.getText().equals(button8.getText()) && button8.getText().equals(button9.getText())){
				grid.setEnabled(false);
				
				FinalFrame frame = new FinalFrame();
				
				JLabel label = new JLabel("Loser: Player " + player);
				frame.add(label, BorderLayout.CENTER);
				return;
			}
		}
		
		
		if(button1.GetOnClick() == true && button4.GetOnClick() == true && button7.GetOnClick() == true) {
			if((button1.getText().equals(button4.getText()) && button4.getText().equals(button7.getText()))){
				grid.setEnabled(false);
				FinalFrame frame = new FinalFrame();
				
				JLabel label = new JLabel("Loser: Player " + player);
				frame.add(label, BorderLayout.CENTER);
				return;
			}
		}
		
		if(button2.GetOnClick() == true && button5.GetOnClick() == true && button8.GetOnClick() == true) {
			if(button2.getText().equals(button5.getText()) && button5.getText().equals(button8.getText())){
				grid.setEnabled(false);
				FinalFrame frame = new FinalFrame();
				
				JLabel label = new JLabel("Loser: Player " + player);
				frame.add(label, BorderLayout.CENTER);
				return;
			}
		}
		
		if(button3.GetOnClick() == true && button6.GetOnClick() == true && button9.GetOnClick() == true) {
			if(button3.getText().equals(button6.getText()) && button6.getText().equals(button9.getText())){
				grid.setEnabled(false);
				FinalFrame frame = new FinalFrame();
				
				JLabel label = new JLabel("Loser: Player " + player);
				frame.add(label, BorderLayout.CENTER);
				return;
			}
		}
		
		if(button1.GetOnClick() == true && button5.GetOnClick() == true && button9.GetOnClick() == true) {
			if((button1.getText().equals(button5.getText()) && button5.getText().equals(button9.getText()))){
				grid.setEnabled(false);
				FinalFrame frame = new FinalFrame();
				
				JLabel label = new JLabel("Loser: Player " + player);
				frame.add(label, BorderLayout.CENTER);
				return;
			}
		
		}

		if(button3.GetOnClick() == true && button5.GetOnClick() == true && button7.GetOnClick() == true) {
			if(button3.getText().equals(button5.getText()) && button5.getText().equals(button7.getText())){
				grid.setEnabled(false);
				FinalFrame frame = new FinalFrame();
				
				JLabel label = new JLabel("Loser: Player " + player);
				frame.add(label, BorderLayout.CENTER);
				return;
			}
		}
						
	}
	
	
	
	public void ButtonListener(Grid grid) {
		//button 1
		button1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				button1.SetOnClick(true);
				player = button1.ButtonOperation(player);
				grid.CheckForWinner(grid);
				revalidate();
			}
		});
		
		//button 2
		button2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				button2.SetOnClick(true);
				player = button2.ButtonOperation(player);
				grid.CheckForWinner(grid);
				revalidate();
			}
		});
		
		//button 3
		button3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				button3.SetOnClick(true);
				player =button3.ButtonOperation(player);
				grid.CheckForWinner(grid);
				revalidate();
			}
		});
		
		//button 4
		button4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				button4.SetOnClick(true);
				player = button4.ButtonOperation(player);
				grid.CheckForWinner(grid);
				revalidate();
			}
		});
		
		//button5
		button5.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				button5.SetOnClick(true);
				player = button5.ButtonOperation(player);
				grid.CheckForWinner(grid);
				revalidate();
			}
		});
		
		//button 6
		button6.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				button6.SetOnClick(true);
				player = button6.ButtonOperation(player);
				grid.CheckForWinner(grid);
				revalidate();
			}
		});
		
		//button 7
		button7.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				button7.SetOnClick(true);
				player = button7.ButtonOperation(player);
				grid.CheckForWinner(grid);
				revalidate();
			}
		});
		
		//button 8
		button8.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				button8.SetOnClick(true);
				player = button8.ButtonOperation(player);
				grid.CheckForWinner(grid);
				revalidate();
			}
		});
		
		//button 9
		button9.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				player = button9.ButtonOperation(player);
				button9.SetOnClick(true);
				grid.CheckForWinner(grid);
				revalidate();
			}
		});	
	
	}
	

}
