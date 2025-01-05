package ttt;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Button extends JButton{
	boolean onclick;
	public Button() {
		onclick = false;
		this.setBackground(Color.white);
		this.setFont(new Font("Arial", Font.PLAIN, 50));
	}
	
	public int ButtonOperation(int player) {
		if(this.getText() == "" && player ==1) {
			this.setText("X");
			player = 2;
		}
		else if(this.getText() == "" && player ==2){
			this.setText("O");
			player = 1;
		}
		
		return player;
	}
	
	public boolean GetOnClick() {
		return onclick;
	}
	
	public void SetOnClick(boolean click) {
		onclick = click;
	}
	
	

}
