 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.awt.JobAttributes;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String sponggar="https://res.cloudinary.com/teepublic/image/private/s--fXvoaYMf--/t_Preview/b_rgb:5e366e,c_limit,f_jpg,h_630,q_90,w_630/v1466107758/production/designs/547814_1.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component name; 
		// 3. use the "createImage()" method below to initialize your Component
name=createImage(sponggar);
		// 4. add the image to the quiz window
quizWindow.add(name);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
sponggar=JOptionPane.showInputDialog("what MEMAY is this?");
		// 7. print "CORRECT" if the user gave the right answer
if (sponggar.equals("spongegar")) {
	
	JOptionPane.showMessageDialog(null, "corret");
}
else{
	JOptionPane.showMessageDialog(null, "wrong");
}	// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(name);
		// 10. find another image and create it (might take more than one line of code)
String Ken= "https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjbi5a4-NjPAhWGKWMKHQlxDEsQjRwIBw&url=http%3A%2F%2Ftheberry.com%2F2016%2F10%2F10%2F27-ken-bone-tweets-eb%2F&psig=AFQjCNHwBWNEkYhG5CRj18auvEXC_Az-4w&ust=1476487964109665";
		// 11. add the second image to the quiz window
Component name2;
name2= createImage(Ken);
quizWindow.add(name2);
quizWindow.pack();
Ken=JOptionPane.showInputDialog("Ok whos thiisss boiiii");
if (Ken.equals("Ken bonne")){
JOptionPane.showMessageDialog(null, "correckt");
} 
else{
JOptionPane.showMessageDialog(null, "U is da Wrong number");	
}
}
		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





