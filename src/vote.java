import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class vote {
public static void main(String[] args) {
	String age =JOptionPane.showInputDialog(null, "how old are you?");
	int age1 = Integer.parseInt(age);
	if(age1>18){
		JOptionPane.showInputDialog("who are you voting for");
	} else {
		JOptionPane.showMessageDialog(null, "nobody cares");
	}
}
}
