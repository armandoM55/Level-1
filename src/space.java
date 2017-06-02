import javax.swing.JFrame;
import javax.swing.JPanel;

public class space {
		JFrame frame;
		JPanel panel=new JPanel();
		final int Width=500;
	final int Height=800;
public static void main(String[] args) {
	
	
}
space(){
	frame = new JFrame();	
	//panel=new
setup();	
}
void setup(){
	frame.pack();
	frame.setVisible(true);
	
	frame.setSize(Width,Height );
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
	
	
}
}
