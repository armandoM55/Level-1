
public class journey {
	int distance;
	String destination = "home";

	journey(int distance, String destination) {
		this.distance = distance;
		this.destination = destination;

	}
	public static void main(String[] args) {
		journey a =new journey(1000,"Las Vegas");
		System.out.println(a.distance);
		System.out.println(a.destination);
		
		
		
		
		
	}
	
}