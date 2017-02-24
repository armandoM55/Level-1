import static org.junit.Assert.*;

import org.junit.Test;

public class introToTest {

	@Test
	public void test() {
		// assertEquals(4,add(2,2));
		// assertEquals(20,add(5,15));
		// assertEquals(5,add(5,21));
		assertEquals(25, squareNum(5));
		 assertEquals(10,absoluteValue(-10));
		 assertEquals(3,absoluteValue(3));
		 assertTrue(isWeekend("Sunday"));
	}
	
	
	
	
	Boolean isWeekend(){
		return true;
	}
	
int absoluteValue(int y){
if(y>0){
	return y;
}
else{
y=y*-1;
return y;
}

}
	int squareNum(int x){
	return x*x;
	}
	int add(int x) {
		return 10;
		// int add(int x,int y){
		// return 4;
	}
}
