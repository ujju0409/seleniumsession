package TestngDay2;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test(invocationCount=5)
	public void Atest() {
		System.out.println("A---test");
	}
	
	
	@Test(invocationCount=3)
	public void Btest() {
		System.out.println("B---test");
	}
}
