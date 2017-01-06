import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Greeter implements ActionListener{
	JFrame Frame=new JFrame("Enter Name");
	JButton Jaysbutton=new JButton("Enter name");
	JButton JBut=new JButton("Greeter");
	JPanel panel=new JPanel();
	String name;
public static void main(String[] args) {
Greeter greet=new Greeter();	
greet.setup();
}
void setup(){
Frame.setVisible(true);
Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Frame.add(panel);
panel.add(Jaysbutton);
panel.add(JBut);
Jaysbutton.addActionListener(this);
JBut.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource()==Jaysbutton){
		 name=JOptionPane.showInputDialog(null, "Enter yo name");
}else{
	JOptionPane.showMessageDialog(null, "Hello my M8 " + name +" Hope you haven a great day");
	}}
}
