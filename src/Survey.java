import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Survey implements ActionListener{
	JFrame frame =new JFrame("Survey");
	JPanel pannel=new JPanel();
	JButton but=new JButton("Roll da Dice");
	JLabel text=new JLabel("click Bait");
	JLabel text1=new JLabel("you Win");
	String Dice;
	JTextField field=new JTextField(100);
	JTextField score=new JTextField("1000");
	JPasswordField pass=new JPasswordField();
	int boi= 5;
	int b0ss= 7;
public static void main(String[] args) {
	Survey boi=new Survey();
boi.setup();
}
void setup(){
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(pannel);
	pannel.add(but);
	pannel.add(text);
	pannel.add(score);
	pannel.add(field);
	frame.pack();
	but.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==but){
boi =new Random().nextInt(6+1);
b0ss=new Random().nextInt(6+1);

		text.setText(""+boi + b0ss);
	if(boi==b0ss){
	JOptionPane.showMessageDialog(null, "You Win!");
	}


}}}
