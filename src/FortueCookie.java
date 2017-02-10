import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortueCookie implements ActionListener {
public static void main(String[] args) {
	FortueCookie fot= new FortueCookie();
	fot.showButton();
}
void showButton() {
	// TODO Auto-generated method stub
JFrame frame=new JFrame();	
JButton but=new JButton();
JPanel pan=new JPanel();
frame.setVisible(true);
frame.add(pan);
frame.add(but);
but.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "");
	int and= new Random().nextInt(5);
}
}