package TestngDay2;

import org.testng.annotations.Test;

public class ExpectedException {
	String name;
	
	@Test(expectedExceptions = { ArithmeticException.class,NullPointerException.class})
	public void loginTest() {
		int i =9/0;
		ExpectedException obj =null;
		obj.name="tom";
		
	}
	
	
	
	

}
