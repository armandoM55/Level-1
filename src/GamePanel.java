import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel; 
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	int Timer;
GamePanel(){
	Timer =1000/60;
	startGame();
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println();
	} 
	void startGame(){
		
		
	}

	
}
