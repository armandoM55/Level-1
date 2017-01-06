import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Joke_teller implements ActionListener {
	JFrame window=new JFrame("jokes");
	JButton jokeButton=new JButton("Jokes");
	JButton Jokebutton=new JButton("Punchline");
	JPanel panel=new JPanel();
	
public static void main(String[] args) {
Joke_teller J=new Joke_teller();	
J.setup();

}
void setup(){
	window.setVisible(true);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.add(panel);
	panel.add(jokeButton);
	panel.add(Jokebutton);
	window.pack();
	jokeButton.addActionListener(this);
	Jokebutton.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==jokeButton){
		System.out.println("My Life");
		JOptionPane.showMessageDialog(null, "My life");
}	else{ System.out.println("German soldiers walk into a BAR");
}}
}


